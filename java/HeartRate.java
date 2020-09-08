import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://open.kattis.com/problems/heartrate/
 *
 * @author brunovolpato
 */
public class HeartRate {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int b = sc.nextInt();

      double p = sc.nextDouble();

      double bpm = (60*b)/p;
      double diff = 60.0 / p;

      System.out.printf("%.4f %.4f %.4f\n", bpm-diff, bpm, bpm+diff);
    }
  }
}
