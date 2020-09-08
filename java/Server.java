import java.util.Scanner;

/**
 * https://open.kattis.com/problems/server/
 *
 * @author brunovolpato
 */
public class Server {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int T = sc.nextInt();

    int tasks = 0;


    for (int n = 0; n < N; n++) {
      int time = sc.nextInt();

      T -= time;
      if (T >= 0) {
        tasks++;
      }
    }

    System.out.println(tasks);
  }
}
