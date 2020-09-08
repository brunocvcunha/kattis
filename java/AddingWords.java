import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://open.kattis.com/problems/addingwords/
 *
 * @author brunovolpato
 */
public class AddingWords {
  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    Map<String, Integer> map = new HashMap<>();
    Map<Integer, String> revMap = new HashMap<>();

    String line;
    while ((line=scan.readLine()) != null) {

      String[] tokens = line.split("\\s");

      if (tokens[0].equals("clear")) {
        map.clear();
        revMap.clear();
        continue;
      }

      if (tokens[0].equals("def")) {

        String word = tokens[1];
        int val = Integer.valueOf(tokens[2]);

        if (revMap.containsKey(val)) {
          map.remove(revMap.get(val));
        }
        if (map.containsKey(word)) {
          revMap.remove(map.get(word));
        }
        map.put(word, val);
        revMap.put(val, word);

      } else if (tokens[0].equals("calc")) {

        char op = '+';
        int total = 0;
        boolean unknown = false;

        for (String token : line.substring(5).trim().split("\\s")) {

          if (token.equals("=")) {
            break;
          }

          if (token.equals("+")) {
            op = '+';
          } else if (token.equals("-")) {
            op = '-';
          } else {

            if (!map.containsKey(token)) {
              unknown = true;
              break;
            }

            if (op == '+') {
              total += map.get(token);
            } else if (op == '-') {
              total -= map.get(token);
            }

          }
        }

        String word = revMap.get(total);

        if (unknown || word == null) {
          System.out.println(line.substring(5).trim() + " unknown");
        } else {
          System.out.println(line.substring(5).trim() + " " + word);
        }
      }
    }
  }
}
