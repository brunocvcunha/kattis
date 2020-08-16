import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * https://open.kattis.com/problems/8queens/
 *
 * @author brunovolpato
 */
public class EightQueens {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    Set<Point> queensAll = new HashSet<>();
    Set<Integer> takenFiles = new HashSet<>();
    Set<Integer> takenRanks = new HashSet<>();

    char[][] board = new char[8][8];

    // read, and check lines
    for (int i = 0; i < 8; i++) {
      board[i] = in.readLine().replaceAll("\\s", "").toCharArray();
    }

    for (int file = 0; file < 8; file++) {
      for (int rank = 0; rank < 8; rank++) {

        if (board[file][rank] == '*') {

          if (takenFiles.contains(file)) {
            System.out.println("invalid");
            return;
          }
          takenFiles.add(file);

          if (takenRanks.contains(rank)) {
            System.out.println("invalid");
            return;
          }
          takenRanks.add(rank);

          for (int offset = 0; offset < 8; offset++) {

            if (queensAll.contains(new Point(file + offset, rank + offset))) {
              System.out.println("invalid");
              return;
            }
            if (queensAll.contains(new Point(file + offset, rank - offset))) {
              System.out.println("invalid");
              return;
            }
            if (queensAll.contains(new Point(file - offset, rank + offset))) {
              System.out.println("invalid");
              return;
            }
            if (queensAll.contains(new Point(file - offset, rank - offset))) {
              System.out.println("invalid");
              return;
            }
          }

          queensAll.add(new Point(file, rank));
        }
      }
    }

    if (queensAll.size() != 8) {
      System.out.println("invalid");
      return;
    }

    System.out.println("valid");
  }
}

class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
