import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/different/
 *
 * @author brunovolpato
 */
public class Different {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      if (line.isEmpty()) {
        break;
      }

      String[] lineParts = line.split("\\s");
      long num1 = Long.valueOf(lineParts[0]);
      long num2 = Long.valueOf(lineParts[1]);

      System.out.println(Math.abs(num2 - num1));

    }
  }
}
