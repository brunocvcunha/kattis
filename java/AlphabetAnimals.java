import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * https://open.kattis.com/problems/alphabetanimals/
 *
 * @author brunovolpato
 */
public class AlphabetAnimals {

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String play = in.readLine();

    Map<Character, List<String>> firstChar = new LinkedHashMap<>();

    int n = Integer.valueOf(in.readLine());

    for (int i = 0; i < n; i++) {
      String dictionaryWord = in.readLine();

      char first = dictionaryWord.charAt(0);
      char last = dictionaryWord.charAt(dictionaryWord.length() - 1);

      firstChar.putIfAbsent(first, new ArrayList<>());
      firstChar.get(first).add(dictionaryWord);
    }

    char lastWordPlay = play.charAt(play.length() - 1);
    List<String> possiblePlays = firstChar.get(lastWordPlay);

    if (possiblePlays == null) {
      System.out.println("?");
      return;
    }

    for (String possiblePlay : possiblePlays) {
      char last = possiblePlay.charAt(possiblePlay.length() - 1);
      List<String> possibleSecond = firstChar.get(last);
      if (possibleSecond == null || (possibleSecond.size() == 1 && last == lastWordPlay)) {
        System.out.println(possiblePlay + "!");
        return;
      }
    }

    System.out.println(possiblePlays.get(0));

  }
}
