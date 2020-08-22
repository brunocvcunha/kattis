import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://open.kattis.com/problems/arbitrage/
 *
 * @author brunovolpato
 */
public class Arbitrage {

  public static boolean arbitrage(String[] currencies, List<Quote> quotes) {

    Map<String, List<Quote>> quotesMap =
        quotes.stream().collect(Collectors.groupingBy(quote -> quote.from));

    for (int k = 0; k < currencies.length; k++) {

      String baseCurrency = currencies[k];

      Double maximize = maximize(new ArrayList<>(), baseCurrency, baseCurrency, 1, quotesMap);

      if (maximize > 1) {
        return true;
      }
    }

    return false;
  }

  public static Double maximize(
      List<String> seen,
      String baseCurrency,
      String targetCurrency,
      double start,
      Map<String, List<Quote>> quotesMap) {

    Double maximize = Double.MIN_VALUE;
    List<Quote> quotes = quotesMap.get(baseCurrency);
    if (quotes == null || seen.contains(baseCurrency)) {
      return maximize;
    }

    seen.add(baseCurrency);

    for (Quote quote : quotes) {
      if (quote.to.equals(targetCurrency)) {
        maximize = Math.max(maximize, start / quote.ratio);
        continue;
      }

      if (seen.contains(quote.to)) {
        continue;
      }

      maximize = Math.max(maximize, maximize(seen, quote.to, targetCurrency, start / quote.ratio, quotesMap));

    }
    return maximize;
  }

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = in.readLine()) != null) {

      int n = Integer.valueOf(line);
      if (n == 0) {
        return;
      }

      String currenciesLine = in.readLine();

      String[] currencies = currenciesLine.split("\\s");

      List<Quote> quotes = new ArrayList<>();

      String combosQuantity = in.readLine();

      int combos = Integer.valueOf(combosQuantity);
      for (int j = 0; j < combos; j++) {
        String comboLine = in.readLine();
        String[] combo = comboLine.split("\\s");
        String[] ratioPair = combo[2].split(":");

        Quote quote = new Quote();
        quote.from = combo[0];
        quote.to = combo[1];
        quote.ratio = Double.valueOf(ratioPair[0]) / Double.valueOf(ratioPair[1]);

        quotes.add(quote);
      }

      if (arbitrage(currencies, quotes)) {
        System.out.println("Arbitrage");
      } else {
        System.out.println("Ok");
      }
    }
  }
}

class Quote {
  String from;
  String to;
  double ratio;

  public Quote() {}

  public Quote(String from, String to, double ratio) {
    this.from = from;
    this.to = to;
    this.ratio = ratio;
  }
}
