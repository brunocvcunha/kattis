import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://open.kattis.com/problems/plantingtrees/
 *
 * @author brunovolpato
 */
public class PlantingTrees {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int seeds = sc.nextInt();


    int[] days = new int[seeds];

    for (int i = 0; i < seeds; i++) {
      days[i] = sc.nextInt();
    }

    Arrays.sort(days);

    int max = 0;
    int start = 1;
    for (int i = days.length - 1; i >= 0; i--) {
      max = Integer.max(max, start++ + days[i]);
    }
    System.out.println(max + 1);
  }
}
