import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/lockedtreasure/
 *
 * @author brunovolpato
 */
public class LockedTreasure {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();

    for (int t = 0; t < cases; t++) {

      int n = sc.nextInt();
      int m = sc.nextInt();

      System.out.println(nChooseK(n, m-1));


    }
  }

  static BigInteger nChooseK(final int N, final int K) {

    BigInteger ret = BigInteger.ONE;
    for (int k = 0; k < K; k++) {
      ret = ret.multiply(BigInteger.valueOf(N-k))
              .divide(BigInteger.valueOf(k+1));
    }

    return ret;
  }
}
