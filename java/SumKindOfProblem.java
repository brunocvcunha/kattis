import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/sumkindofproblem/
 *
 * @author brunovolpato
 */
public class SumKindOfProblem {
  public static void main(String[] args) throws IOException {
    KattisIO io = new KattisIO(System.in);

    int n = io.nextInt();
    for (int i = 0; i < n; i++) {
      int set = io.nextInt();
      long num = io.nextLong();

      long s1 = 0;
      for (int j = 1; j <= num; j++) {
        s1 += j;
      }
      long s2 = ((s1*2)-num);
      long s3 = ((s1*2));

      io.printf("%d %d %d %d\n", set, s1, s2, s3);
    }

    io.close();
  }


  static class KattisIO extends PrintWriter {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    public KattisIO() {
      this(System.in, System.out);
    }

    public KattisIO(InputStream in) {
      this(in, System.out);
    }

    public KattisIO(InputStream in, OutputStream out) {
      super(new BufferedOutputStream(out));
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = new StringTokenizer("");
    }

    public String next() throws IOException {
      while (!tokenizer.hasMoreTokens()) {
        tokenizer = new StringTokenizer(nextLine());
      }
      return tokenizer.nextToken();
    }

    public String nextLine() throws IOException {
      return reader.readLine();
    }

    public long nextLong() throws IOException {
      return Long.parseLong(next());
    }

    public int nextInt() throws IOException {
      return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
      return Double.parseDouble(next());
    }
  }
}
