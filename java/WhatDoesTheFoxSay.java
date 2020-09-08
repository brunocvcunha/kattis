import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://open.kattis.com/problems/whatdoesthefoxsay/
 *
 * @author brunovolpato
 */
public class WhatDoesTheFoxSay {

  public static void main(String[] args) throws IOException {

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.valueOf(scan.readLine());

    for (int n = 0; n < N; n++) {
      String phrase = scan.readLine();

      while (true) {
        String goes = scan.readLine();

        if (goes.equals("what does the fox say?")) {
          System.out.println(phrase.replaceAll("\\s+", " ").trim());
          break;
        }

        String reserved = goes.split("\\s")[2];
        phrase = phrase.replaceAll("\\b" + reserved + "\\b", "");
      }
    }
  }
}
