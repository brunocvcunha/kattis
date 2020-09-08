import java.util.Scanner;

/**
 * https://open.kattis.com/problems/soylent/
 *
 * @author brunovolpato
 */
public class Soylent {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      int calories = sc.nextInt();

      System.out.println((int) Math.ceil(calories / 400.0));
    }
  }
}
