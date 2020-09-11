import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * https://open.kattis.com/problems/namethatpermutation/
 *
 * @author brunovolpato
 */
public class NameThatPermutation {
  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = scan.readLine()) != null && !line.equals("")) {

      String[] tokens = line.split("\\s");
      int n = Integer.valueOf(tokens[0]);
      BigInteger k = new BigInteger(tokens[1]);

      Integer[] arr = new Integer[n];
      for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
      }

      List<Integer> elems = new ArrayList<>();
      elems.addAll(Arrays.asList(arr));

      System.out.println(perms(k, elems).trim());
    }
  }

  public static String perms(BigInteger n, List<Integer> elems) {

    //System.out.println("Calling perms for " + n + ", elems: " + elems);

    if (elems.size() == 1) {
      return String.valueOf(elems.get(0));
    }

    BigInteger factorial = factorial(elems.size()-1);
    //System.out.println("\tFactorial for " + (elems.size()-1) + ": " + factorial);

    BigInteger[] divideAndRemainder = n.divideAndRemainder(factorial);
    //System.out.println("\tN " + n + " divmod " + (factorial) + ": " + divideAndRemainder[0] + ", " + divideAndRemainder[1]);

    int num = elems.get(divideAndRemainder[0].intValue());
    //System.out.println("\tPicked " + num);
    elems.remove(Integer.valueOf(num));

    return num + " " + perms(divideAndRemainder[1], elems);
  }

  public static BigInteger factorial(int n) {
    BigInteger factorial = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      factorial = factorial.multiply(BigInteger.valueOf(i + 1));
    }

    return factorial;
  }

}
