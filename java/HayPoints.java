import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

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
        jobSalary += Stream.of(line.split("\\s")).mapToInt(word -> dictionary.getOrDefault(word, 0)).sum();
      }

      System.out.println(jobSalary);
    }
  }
}
