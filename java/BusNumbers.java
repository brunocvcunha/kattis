import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/busnumbers/
 *
 * @author brunovolpato
 */
public class BusNumbers {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] lines = new int[n];

    for (int i = 0; i < n; i++) {
      int line = sc.nextInt();
      lines[i] = line;
    }

    Arrays.sort(lines);

    List<Integer> backoff = new ArrayList<>();

    for (int line : lines) {

      if (backoff.size() == 0 || line == backoff.get(backoff.size() - 1) + 1) {
        backoff.add(line);
        continue;
      }

      print(backoff);

      backoff.add(line);
    }

    print(backoff);
  }

  private static void print(List<Integer> backoff) {
    if (backoff.size() > 2) {
      System.out.print(backoff.get(0) + "-" + backoff.get(backoff.size() - 1) + " ");
      backoff.clear();
    } else if (!backoff.isEmpty()) {
      for (Integer backedOff : backoff) {
        System.out.print(backedOff + " ");
      }
      backoff.clear();
    }
  }
}
