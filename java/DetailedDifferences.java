import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/detaileddifferences/
 *
 * @author brunovolpato
 */
public class DetailedDifferences {
  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int comparisons = Integer.valueOf(in.readLine());

    for (int i = 0; i < comparisons; i++) {

      String line1 = in.readLine();
      char[] chars1 = line1.toCharArray();
      String line2 = in.readLine();
      char[] chars2 = line2.toCharArray();

      System.out.println(line1);
      System.out.println(line2);

      for (int j = 0; j < chars1.length; j++) {
        if (chars1[j] == chars2[j]) {
          System.out.print('.');
        } else {
          System.out.print('*');
        }
      }

      System.out.println();
      System.out.println();

    }

  }
}
