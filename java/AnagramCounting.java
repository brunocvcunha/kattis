import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/anagramcounting/
 *
 * @author brunovolpato
 */
public class AnagramCounting {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = in.readLine()) != null) {

      Map<Character, Integer> repeats = new HashMap<>();
      for (char c : line.toCharArray()) {
        if (repeats.containsKey(c)) {
          repeats.put(c, repeats.get(c) + 1);
        } else {
          repeats.put(c, 1);
        }
      }

      BigInteger factorial = BigInteger.ONE;
      for (int i = 0; i < line.length(); i++) {
        factorial = factorial.multiply(BigInteger.valueOf(i + 1));
      }

      for (Map.Entry<Character, Integer> repeatEntry : repeats.entrySet()) {
        if (repeatEntry.getValue() <= 1) {
          continue;
        }

        BigInteger factorialR = BigInteger.ONE;
        for (int i = 0; i < repeatEntry.getValue(); i++) {
          factorialR = factorialR.multiply(BigInteger.valueOf(i + 1));
        }

        factorial = factorial.divide(factorialR);
      }

      System.out.println(factorial);
    }
  }
}
