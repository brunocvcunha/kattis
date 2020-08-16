import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/musicalchairs/
 *
 * @author brunovolpato
 */
public class MusicalChairs {

  public static int solve(InputStream is) {
    Scanner sc = new Scanner(is);

    int n = sc.nextInt();
    List<Professor> professors = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
      Professor professor = new Professor();
      professor.id = i + 1;
      professor.opus = sc.nextInt();

      professors.add(professor);
    }

    int pos = 0;
    while (professors.size() > 1) {

      Professor current = professors.get(pos % professors.size());
      int opus = current.opus;

      pos = (pos + opus - 1) % professors.size();
      professors.remove(pos);
    }

    return professors.get(0).id;
  }

  public static void main(String[] args) {
    System.out.println(solve(System.in));
  }
}

class Professor {
  int id;
  int opus;
}
