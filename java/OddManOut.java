import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://open.kattis.com/problems/oddmanout/
 *
 * @author brunovolpato
 */
public class OddManOut {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      Set<Integer> set = new HashSet<>();

      int c = sc.nextInt();
      int[] gs = new int[c];

      for (int j = 0; j < c; j++) {
        int num = sc.nextInt();
        if (set.contains(num)) {
          set.remove(num);
        } else {
          set.add(num);
        }
      }

      System.out.println("Case #" + (i + 1) + ": " + set.iterator().next());
    }
  }
}
