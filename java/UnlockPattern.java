import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * https://open.kattis.com/problems/unlockpattern/
 *
 * @author brunovolpato
 */
public class UnlockPattern {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    Map<Integer, Point2D> map = new TreeMap<>();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        map.put(sc.nextInt(), new Point2D(i, j));
      }
    }

    double distance = 0;
    Iterator<Point2D> it = map.values().iterator();
    Point2D prev = it.next();
    while (it.hasNext()) {
      Point2D curr = it.next();

      distance += prev.dist(curr);
      prev = curr;
    }

    System.out.println(distance);
  }

  static class Point2D {
    int row;
    int column;

    public Point2D(int row, int column) {
      this.row = row;
      this.column = column;
    }

    public double dist(Point2D other) {
      return Math.sqrt(Math.pow(row - other.row, 2) + Math.pow(column - other.column, 2));
    }
  }
}
