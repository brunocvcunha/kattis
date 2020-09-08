import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/nodup
 *
 * @author brunovolpato
 */
public class NoDup {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    Set<String> words = new HashSet<>();

    String line = in.readLine();

    String[] tokens = line.split("\\s");
    for (String token : tokens) {
      if (words.contains(token)) {
        System.out.println("no");
        return;
      }
      words.add(token);
    }
    System.out.println("yes");
  }

}
