import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/areyoulistening/
 *
 * @author brunovolpato
 */
public class AreYouListening {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int cx = sc.nextInt();
    int cy = sc.nextInt();
    int n = sc.nextInt();

    int[] maxRanges = new int[n];
    for (int i = 0; i < n; i++) {
      int dx = sc.nextInt();
      int dy = sc.nextInt();
      int r = sc.nextInt();

      // distance: sqrt((dx-cx)^2 - (dy-cy)^2) - r
      int distance = (int) Math.sqrt(Math.pow(dx - cx, 2) + Math.pow(dy - cy, 2)) - r;
      maxRanges[i] = distance;
    }

    Arrays.sort(maxRanges);

    if (maxRanges[2] < 0) {
      System.out.println(0);
    } else {
      System.out.println(maxRanges[2]);
    }
  }
}
