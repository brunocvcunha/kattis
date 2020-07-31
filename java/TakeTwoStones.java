import java.util.Scanner;

/**
 * https://open.kattis.com/problems/twostones/
 *
 * @author brunovolpato
 */
public class TakeTwoStones {
  public static void main(String[] args) {
    System.out.println(new Scanner(System.in).nextInt() % 2 == 1 ? "Alice" : "Bob");
  }
}
