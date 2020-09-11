import java.io.IOException;
import java.util.Scanner;


/**
 * https://open.kattis.com/problems/3dprinter/
 *
 * @author brunovolpato
 */
public class ThreeDPrinter {

  public static int printers(int n) {
    if (n < 2) {
      return n;
    }

    return (int) (1 + Math.ceil(Math.log(n) / Math.log(2)));
  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println(printers(sc.nextInt()));
  }

}
