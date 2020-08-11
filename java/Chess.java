import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/chess/
 *
 * @author brunovolpato
 */
public class Chess {

  static class Position {
    int x;
    int y;

    public Position(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public List<Position> getAllPossibleMoves() {

      List<Position> allowed = new ArrayList<>();

      int[][] pairs = new int[][] { { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

      for (int[] pair : pairs) {
        int diffX = pair[0];
        int diffY = pair[1];

        for (int moves = 1; moves < 7; moves++) {
          int movex = x + moves*diffX;
          int movey = y + moves*diffY;

          if (movex >= 0
                  && movex < 8
                  && movey >= 0
                  && movey < 8) {
            allowed.add(new Position(movex, movey));
          }
        }
      }

      return allowed;
    }


    @Override
    public String toString() {
      char c = (char) (x + 'A');
      return c + " " + (y + 1);
    }

    @Override
    public boolean equals(Object other) {
      return this.x == ((Position) other).x && this.y == ((Position) other).y;
    }
  }

  private static boolean isWhite(int x, int y) {
    return (y % 2 == 0 && x % 2 == 0) || (y % 2 != 0 && x % 2 != 0);
  }

  private static int column(char c) {
    return (int) (c - 'A');
  }


  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int cases = sc.nextInt();

    for (int i = 0; i < cases; i++) {

      int xFrom = column(sc.next().charAt(0));
      int yFrom = sc.nextInt() - 1;

      int xTo = column(sc.next().charAt(0));
      int yTo = sc.nextInt() - 1;

      if (isWhite(xFrom, yFrom) != isWhite(xTo, yTo)) {
        System.out.println("Impossible");
        continue;
      }

      Position positionFrom = new Position(xFrom, yFrom);
      Position positionTo = new Position(xTo, yTo);

      List<String> steps = new ArrayList();
      steps.add(positionFrom.toString());

      if (!positionFrom.equals(positionTo)) {

        List<Position> possibleMoves = positionFrom.getAllPossibleMoves();
        if (possibleMoves.contains(positionTo)) {
          steps.add(positionTo.toString());
        } else {
          for (Position possibleFirstMoves : possibleMoves) {
            List<Position> possibleSecondMoves = possibleFirstMoves.getAllPossibleMoves();
            if (possibleSecondMoves.contains(positionTo)) {
              steps.add(possibleFirstMoves.toString());
              steps.add(positionTo.toString());
              break;
            }
          }
        }

      }

      System.out.println((steps.size()-1) + " " + String.join(" ", steps));
    }
  }
}
