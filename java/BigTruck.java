import java.util.Arrays;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/bigtruck
 *
 * @author brunovolpato
 */
public class BigTruck {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] it = new int[n];
    for (int i = 0; i < n; i++) {
      it[i] = sc.nextInt();
    }

    int m = sc.nextInt();

    int[][] D = new int[n][n];
    int[][] I = new int[n][n];

    for (int k = 0; k < n; k++) {
      Arrays.fill(D[k], 101);
    }

    for (int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      int d = sc.nextInt();

      D[a][b] = d;
      D[b][a] = d;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        I[j][i] = it[i];
      }
    }

    // Floyd-Warshall Algorithm
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int its = I[i][k] + I[k][j];
          int s = D[i][k] + D[k][j];
          if (s < D[i][j]) {
            D[i][j] = s;
            I[i][j] = its;
          } else if (s == D[i][j] && its > I[i][j]) {
            I[i][j] = its;
          }
        }
      }
    }

    if (D[0][n - 1] > 100) {
      System.out.println("impossible");
    } else {
      System.out.println((D[0][n - 1]) + " " + (it[0] + I[0][n - 1]));
    }
  }
}
