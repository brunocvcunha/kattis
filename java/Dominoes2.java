import java.util.Scanner;

/**
 * https://open.kattis.com/problems/dominoes2/
 *
 * @author brunovolpato
 */
public class Dominoes2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int t = 0; t < T; t++) {

      int n = sc.nextInt();
      int m = sc.nextInt();
      int l = sc.nextInt();

      boolean[][] D = new boolean[n][n];
      boolean[] dropped = new boolean[n];

      for (int i = 0; i < m; i++) {
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;

        D[x][y] = true;
      }

      for (int i = 0; i < l; i++) {
        int z = sc.nextInt() - 1;
        if (!dropped[z]) {
          dropped[z] = true;
          dfs(D, dropped, z);
        }
      }


      int knocked = 0;
      for (int i = 0; i < n; i++) {
        if (dropped[i]) {
          knocked++;
        }
      }
      System.out.println(knocked);

    }
  }

  private static void dfs(boolean[][] d, boolean[] dropped, int node) {

    for (int j = 0; j < d.length; j++) {
      if (d[node][j] && !dropped[j]) {
        dropped[j] = true;
        dfs(d, dropped, j);
      }
    }

  }
}
