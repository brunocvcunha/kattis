import java.util.Scanner;

/**
 * https://open.kattis.com/problems/speedlimit/
 *
 * @author brunovolpato
 */
public class SpeedLimit {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (sc.hasNextInt()) {
      int n = sc.nextInt();
      int t = 0;

      if (n == -1) {
        break;
      }

      int distance = 0;

      for (int i = 0; i < n; i++) {
        int speed = sc.nextInt();
        int time = sc.nextInt();

        distance += speed * (time - t);
        t = time;
      }

      System.out.println(distance + " miles");

    }
  }
}
