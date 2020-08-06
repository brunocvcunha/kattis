import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/simonsays/
 *
 * @author brunovolpato
 */
public class SimonSays {

  public static final String PREFIX = "Simon says ";

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(in.readLine());

    for (int i = 0; i < n; i++) {
      String line = in.readLine();
      if (line.startsWith(PREFIX)) {
        System.out.println(line.substring(PREFIX.length()));
      }
    }
  }
}
