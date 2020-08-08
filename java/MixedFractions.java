import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://open.kattis.com/problems/mixedfractions/
 *
 * @author brunovolpato
 */
public class MixedFractions {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      String line = scan.readLine();
      String[] parts = line.split(" ");
      int numerator = Integer.parseInt(parts[0]);
      int denominator = Integer.parseInt(parts[1]);
      if (numerator == 0 && denominator == 0) {
        break;
      }

      int div = numerator / denominator;
      int leftover = numerator % denominator;

      System.out.println(div + " " + leftover + " / " + denominator);


    }
  }
}
