import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

  @Test
  public void testGiven1() {
    assertEquals(1, printers(1));
  }

  @Test
  public void testGiven2() {
    assertEquals(4, printers(5));
  }
}
