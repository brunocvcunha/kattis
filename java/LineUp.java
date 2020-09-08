import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://open.kattis.com/problems/lineup/
 *
 * @author brunovolpato
 */
public class LineUp {
  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(scan.readLine());

    List<String> names = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String line = scan.readLine();
      names.add(line);
    }

    List<String> sorted = names.stream().sorted().collect(Collectors.toList());

    if (sorted.equals(names)) {
      System.out.println("INCREASING");
    } else {
      Collections.reverse(sorted);
      if (sorted.equals(names)) {
        System.out.println("DECREASING");
      } else {
        System.out.println("NEITHER");
      }
    }
  }
}
