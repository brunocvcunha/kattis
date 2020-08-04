import java.util.Scanner;

/**
 * https://open.kattis.com/problems/apaxiaaans/
 *
 * @author brunovolpato
 */
public class Apaxiaaans {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();


    String line = sc.next();

    char lastChar = '\0';
    for (char c : line.toCharArray()) {
      if (c != lastChar) {
        sb.append(c);
        lastChar = c;
      }
    }
    System.out.println(sb.toString());
  }
}
