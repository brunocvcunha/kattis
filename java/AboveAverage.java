import java.util.Scanner;
import java.util.TreeSet;

/**
 * https://open.kattis.com/problems/aboveaverage/
 *
 * @author brunovolpato
 */
public class AboveAverage {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int C = sc.nextInt();

    for (int c = 0; c < C; c++) {
      int N = sc.nextInt();

      double sum = 0.0;
      double[] nums = new double[N];
      for (int n = 0; n < N; n++) {
        nums[n] = sc.nextDouble();
        sum += nums[n];
      }

      int higher = 0;

      double avg = sum / N;
      for (int n = 0; n < N; n++) {
        if (nums[n] > avg) {
          higher++;
        }
      }
      System.out.printf("%.3f%%\n", ((double) higher/ (double) N) * 100.0);
    }
  }
}
