import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/haypoints/
 *
 * @author brunovolpato
 */
public class HayPoints {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    Map<String, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < m; i++) {
      dictionary.put(sc.next(), sc.nextInt());
    }

    for (int i = 0; i < n; i++) {

      int jobSalary = 0;

      String line;
      while (!(line = sc.nextLine()).equals(".")) {

        for (String word : line.split("\\s")) {
          int wordWorth = dictionary.getOrDefault(word, 0);
          jobSalary += wordWorth;
        }
      }

      System.out.println(jobSalary);
    }
  }
}
