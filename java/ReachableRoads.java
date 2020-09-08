import java.util.Scanner;

/**
 * https://open.kattis.com/problems/reachableroads/
 *
 * @author brunovolpato
 */
public class ReachableRoads {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int T = 0; T < n; T++) {

      int c = sc.nextInt();

      boolean[][] D = new boolean[c][c];
      boolean[] visited = new boolean[c];
      int clusters = 0;
      int left = c;

      int r = sc.nextInt();
      for (int k = 0; k < r; k++) {
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        D[c1][c2] = true;
        D[c2][c1] = true;
      }


      for (int i = 0; i < visited.length; i++) {
        if (!visited[i]) {
          dfs(D, visited, i);
          clusters++;
        }
      }

      System.out.println(clusters-1);
    }
  }

  private static void dfs(boolean[][] d, boolean[] visited, int node) {

    for (int j = 0; j < d.length; j++) {
      boolean hasPath = d[node][j];
      if (hasPath && !visited[j]) {
        visited[j] = true;
        dfs(d, visited, j);
      }
    }
  }
}
