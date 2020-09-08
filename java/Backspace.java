import java.util.Scanner;

/**
 * https://open.kattis.com/problems/backspace/
 *
 * @author brunovolpato
 */
public class Backspace {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();
    StringBuilder sb = new StringBuilder();

    for (char c : line.toCharArray()) {
      if (c == '<') {
        if (sb.length() > 0) {
          sb.deleteCharAt(sb.length()-1);
        }
      } else {
        sb.append(c);
      }
    }

    System.out.println(sb.toString());
  }
}
