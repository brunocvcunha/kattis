import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://open.kattis.com/problems/character/
 *
 * @author brunovolpato
 */
public class CharacterProblem {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int powerSet = 1<<n;
    System.out.println(powerSet-n-1);
  }

}
