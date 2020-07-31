import java.util.Scanner;

/**
 * https://open.kattis.com/problems/carrots/
 * @author brunovolpato
 */
public class Carrots {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int participants = sc.nextInt();
    int carrots = sc.nextInt();

    for (int i = 0; i <= participants; i++) {
      sc.nextLine();
    }

    System.out.println(carrots);
  }
}
