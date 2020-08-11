import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://open.kattis.com/problems/alphabetspam
 *
 * @author brunovolpato
 */
public class AlphabetSpam {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String line = in.readLine();

    int whitespace = 0;
    int lowercase = 0;
    int uppercase = 0;
    int symbol = 0;

    char[] chars = line.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];

      if (c == '_') {
        whitespace++;
      } else if (c >= 'a' && c <= 'z') {
        lowercase++;
      }  else if (c >= 'A' && c <= 'Z') {
        uppercase++;
      } else {
        symbol++;
      }
    }

    double length = chars.length;

    System.out.println(whitespace / length);
    System.out.println(lowercase / length);
    System.out.println(uppercase / length);
    System.out.println(symbol / length);
  }

}
