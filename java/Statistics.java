import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://open.kattis.com/problems/statistics/
 *
 * @author brunovolpato
 */
public class Statistics {
  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int c = 0;


    while (true) {

      Scanner sc = new Scanner(scan.readLine());

      int n = sc.nextInt();

      List<Integer> nums = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        nums.add(sc.nextInt());
      }

      IntSummaryStatistics stats = nums.stream().mapToInt(i -> i).summaryStatistics();
      System.out.printf("Case %d: %d %d %d\n", ++c, stats.getMin(), stats.getMax(), stats.getMax() - stats.getMin());

      if (!scan.ready()) {
        break;
      }
    }

  }
}
