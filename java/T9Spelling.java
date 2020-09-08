import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/t9spelling/
 *
 * @author brunovolpato
 */
public class T9Spelling {

  public static Map<Character, String> map = new HashMap<>();
  static {
    map.put('a', "2");
    map.put('b', "22");
    map.put('c', "222");
    map.put('d', "3");
    map.put('e', "33");
    map.put('f', "333");
    map.put('g', "4");
    map.put('h', "44");
    map.put('i', "444");
    map.put('j', "5");
    map.put('k', "55");
    map.put('l', "555");
    map.put('m', "6");
    map.put('n', "66");
    map.put('o', "666");
    map.put('p', "7");
    map.put('q', "77");
    map.put('r', "777");
    map.put('s', "7777");
    map.put('t', "8");
    map.put('u', "88");
    map.put('v', "888");
    map.put('w', "9");
    map.put('x', "99");
    map.put('y', "999");
    map.put('z', "9999");
    map.put(' ', "0");
  }
  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.valueOf(scan.readLine());

    for (int n = 0; n < N; n++) {
      String line = scan.readLine();
      System.out.printf("Case #%d: %s\n", n+1, explode(line));
    }
  }

  public static String explode(String line) {

    StringBuilder sb = new StringBuilder();

    char lastChar = '\0';

    for (int i = 0; i < line.length(); i++) {
      char c = line.charAt(i);

      String word = map.get(c);

      if (lastChar == word.charAt(0)) {
        sb.append(' ');
      }

      sb.append(word);

      lastChar = word.charAt(0);
    }

    return sb.toString().trim();
  }
}
