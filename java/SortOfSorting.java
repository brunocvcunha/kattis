import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://open.kattis.com/problems/sortofsorting/
 *
 * @author brunovolpato
 */
public class SortOfSorting {
  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      int n = Integer.valueOf(in.readLine());
      if (n == 0) {
        break;
      }

      Set<String> names =
          new TreeSet<>(
              new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                  int compare = o1.substring(0, 2).compareTo(o2.substring(0, 2));
                  if (compare == 0) {
                    return 1;
                  }
                  return compare;
                }
              });

      for (int i = 0; i < n; i++) {
        names.add(in.readLine());
      }

      for (String name : names) {
        System.out.println(name);
      }
      System.out.println("");
    }
  }
}
