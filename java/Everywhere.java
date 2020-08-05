import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://open.kattis.com/problems/everywhere/
 *
 * @author brunovolpato
 */
public class Everywhere {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();

      Set<String> cities = new HashSet<>();

      for (int j = 0; j < n; j++) {
        cities.add(sc.next());
      }

      System.out.println(cities.size());
    }
  }
}
