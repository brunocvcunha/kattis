import java.util.Scanner;

/**
 * https://open.kattis.com/problems/bookingaroom/
 *
 * @author brunovolpato
 */
public class BookingARoom {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int booked = sc.nextInt();

    boolean[] rooms = new boolean[r];

    for (int n = 0; n < booked; n++) {
      rooms[sc.nextInt()-1] = true;
    }


    for (int n = 0; n < r; n++) {
      if (!rooms[n]) {
        System.out.println(n+1);
        return;
      }
    }

    System.out.println("too late");
  }
}
