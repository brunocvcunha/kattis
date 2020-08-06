import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://open.kattis.com/problems/conundrum/
 *
 * @author brunovolpato
 */
public class Conundrum {

  private static final char[] GOAL = new char[] {'P', 'E', 'R'};

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line = in.readLine().toUpperCase();

    int changes = 0;
    char[] chars = line.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != GOAL[i % GOAL.length]) {
        changes++;
      }
    }

    System.out.println(changes);
  }
}
