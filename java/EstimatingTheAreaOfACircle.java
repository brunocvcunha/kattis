import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/estimatingtheareaofacircle/
 *
 * @author brunovolpato
 */
public class EstimatingTheAreaOfACircle {
  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String problem;
    while ((problem=in.readLine()) != null) {

      String[] tokens = problem.split("\\s");

      double r = Double.valueOf(tokens[0]);
      int m = Integer.valueOf(tokens[1]);
      int c = Integer.valueOf(tokens[2]);

      if (r == 0 && m == 0 && c == 0) {
        return;
      }

      double probPi = 4.0 * c/(double) m;

      double area = Math.PI * r * r;
      double probArea = probPi * r * r;

      System.out.println(area + " " + probArea);

    }
  }
}
