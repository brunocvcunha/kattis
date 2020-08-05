import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/cd/
 *
 * @author brunovolpato
 */
public class CD {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      String line = scan.readLine();
      String[] parts = line.split(" ");
      int n = Integer.parseInt(parts[0]);
      int m = Integer.parseInt(parts[1]);
      if (n == 0 && m == 0) {
        break;
      }

      Set<String> set = new HashSet<>();

      for (int i = 0; i < n; i++) {
        String cd = scan.readLine();
        set.add(cd);
      }

      int count = 0;
      for (int i = 0; i < m; i++) {
        String cd = scan.readLine();
        if (set.contains(cd)) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
