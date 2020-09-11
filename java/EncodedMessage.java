import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/encodedmessage/
 *
 * @author brunovolpato
 */
public class EncodedMessage {
  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(scan.readLine());

    for (int i = 0; i < n; i++) {
      String line = scan.readLine();
      int code = (int) Math.sqrt(line.length());

      StringBuffer sb = new StringBuffer();

      for (int j = code-1; j >= 0; j--) {

        int k = j;
        while (k < line.length()) {
          sb.append(line.charAt(k));
          k += code;
        }
      }

      System.out.println(sb.toString());
    }
  }
}
