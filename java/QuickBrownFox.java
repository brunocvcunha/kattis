import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://open.kattis.com/problems/quickbrownfox/
 *
 * @author brunovolpato
 */
public class QuickBrownFox {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(in.readLine());

    for (int i = 0; i < n; i++) {
      String line = in.readLine();

      String missing = missingChars(line.toLowerCase());
      if (missing.isEmpty()) {
        System.out.println("pangram");
      } else {
        System.out.println("missing " + missing);
      }
    }
  }

  private static String missingChars(String line) {
    boolean[] letters = new boolean[26];
    int offset = 97;

    for (char c : line.toCharArray()) {
      if (c >= offset /*a*/ && c <= 122 /*z*/) {
        letters[c - offset] = true;
      }
    }

    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < letters.length; i++) {
      if (!letters[i]) {
        sb.append((char) (i + offset));
      }
    }

    return sb.toString();
  }
}
