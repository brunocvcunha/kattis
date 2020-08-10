import java.util.Scanner;
import java.util.Stack;

/**
 * https://open.kattis.com/problems/batterup/
 *
 * @author brunovolpato
 */
public class BatterUp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    double nominator = 0;
    double denominator = 0;

    for (int i = 0; i < n; i++) {
      int play = sc.nextInt();
      if (play != -1) {
        nominator += play;
        denominator++;
      }

    }

    System.out.println(nominator/denominator);
  }
}
