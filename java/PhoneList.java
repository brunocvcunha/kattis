import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * https://open.kattis.com/problems/phonelist/
 *
 * @author brunovolpato
 */
public class PhoneList {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.valueOf(in.readLine());

    for (int i = 0; i < t; i++) {

      int n = Integer.valueOf(in.readLine());

      TreeSet<String> prefix = new TreeSet<>();

      boolean consistent = true;

      for (int j = 0; j < n; j++) {

        String num = in.readLine();

        String floor = prefix.floor(num);
        if (floor != null
            && floor.length() < num.length()
            && floor.equals(num.substring(0, floor.length()))) {
          consistent = false;
        }

        String ceil = prefix.ceiling(num);
        if (ceil != null
                && ceil.length() > num.length()
                && num.equals(ceil.substring(0, num.length()))) {
          consistent = false;
        }

        prefix.add(num);
      }

      if (consistent) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
