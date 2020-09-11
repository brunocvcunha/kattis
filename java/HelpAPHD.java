import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://open.kattis.com/problems/helpaphd/
 *
 * @author brunovolpato
 */
public class HelpAPHD {
  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(in.readLine());

    for (int i = 0; i < n; i++) {
      String line = in.readLine();
      if (line.contains("=")) {
        System.out.println("skipped");
        continue;
      }

      String[] tokens = line.split("\\+");
      System.out.println(Integer.valueOf(tokens[0]) + Integer.valueOf(tokens[1]));

    }
  }
}
