import java.util.Scanner;

/**
 * https://open.kattis.com/problems/pizza2/
 *
 * @author brunovolpato
 */
public class Pizza2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int R = sc.nextInt();
    int C = sc.nextInt();

    double totalArea = Math.PI * Math.pow(R, 2);
    double cheeseArea = Math.PI * Math.pow(R-C, 2);

    System.out.printf("%.6f\n", (cheeseArea / totalArea)*100);
  }
}
