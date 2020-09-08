import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/addingwords/
 *
 * @author brunovolpato
 */
public class Porpoises {

  static BigInteger mod = BigInteger.valueOf(1_000_000_000L);
  static Map<Long, BigInteger> memo = new HashMap<>();

  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(scan.readLine());

    String line;
    while ((line = scan.readLine()) != null) {
      int c = Integer.valueOf(line.split(" ")[0]);
      long num = Long.valueOf(line.split(" ")[1]);

      System.out.println(c + " " + fib(num));
    }
  }

  public static BigInteger fib(long N) {

    if (N == 0) {
      return BigInteger.ZERO;
    }

    if (N == 1 || N == 2) {
      return BigInteger.ONE;
    }

    if (memo.get(N) != null) {
      return memo.get(N);
    }

    long kth;
    if (N % 2 == 0) {
      kth = N / 2;
      memo.put(
          N, (fib(kth).multiply(fib(kth).add(BigInteger.TWO.multiply(fib(kth - 1))))).mod(mod));
    } else {
      kth = (N + 1) / 2;
      memo.put(N, (fib(kth).multiply(fib(kth)).add(fib(kth - 1).multiply(fib(kth - 1)))).mod(mod));
    }

    return memo.get(N);
  }
}
