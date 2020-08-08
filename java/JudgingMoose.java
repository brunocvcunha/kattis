import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://open.kattis.com/problems/judgingmoose/
 *
 * @author brunovolpato
 */
public class JudgingMoose {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int left = sc.nextInt();
    int right = sc.nextInt();

    if (left == 0 && right == 0) {
      System.out.println("Not a moose");
      return;
    }

    if (left == right) {
      System.out.println("Even " + (left+right));
    } else {
      System.out.println("Odd " + (Math.max(left, right) * 2));
    }
  }
}
