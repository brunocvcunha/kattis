import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/crosscountry/
 *
 * @author brunovolpato
 */
public class CrossCountry {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    int t = sc.nextInt();


    int[][] D = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        D[i][j] = sc.nextInt();
      }
    }


    // Floyd-Warshall Algorithm
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (D[i][j] > D[i][k] + D[k][j]) {
            D[i][j] = D[i][k] + D[k][j];
          }
        }
      }
    }

    System.out.println(D[s][t]);

  }
}
