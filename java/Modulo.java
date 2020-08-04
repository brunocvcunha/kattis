import java.util.Scanner;

/**
 * https://open.kattis.com/problems/modulo/
 *
 * @author brunovolpato
 */
public class Modulo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean[] bit = new boolean[42];
    short nBits = 0;

    for (int i = 0; i < 10; i++) {
      int n = sc.nextInt() % 42;
      if (!bit[n]) {
        bit[n] = true;
        nBits++;
      }
    }

    System.out.println(nBits);
  }
}
