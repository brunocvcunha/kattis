import java.util.Scanner;

/**
 * https://open.kattis.com/problems/reversebinary/
 *
 * @author brunovolpato
 */
public class ReverseBinary {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();

    String intStr = Integer.toBinaryString(sc.nextInt());
    int i = Integer.parseInt(new StringBuilder(intStr).reverse().toString(), 2);

    System.out.println(i);
  }
}
