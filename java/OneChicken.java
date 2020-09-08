import java.util.Scanner;

/**
 * https://open.kattis.com/problems/onechicken/
 *
 * @author brunovolpato
 */
public class OneChicken {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    if (m >= n) {
      int leftover = m-n;
      String word = leftover == 1 ? "piece" : "pieces";

      System.out.println("Dr. Chaz will have " + (leftover) + " " + word + " of chicken left over!");
    } else {
      int missing = n-m;
      String word = missing == 1 ? "piece" : "pieces";

      System.out.println("Dr. Chaz needs " + (missing) + " more " + word + " of chicken!\n");
    }
  }
}
