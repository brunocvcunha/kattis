import java.io.IOException;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/planina/
 *
 * @author brunovolpato
 */
public class Planina {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Math.round(Math.pow(Math.pow(2, n) + 1, 2)));
  }
}
