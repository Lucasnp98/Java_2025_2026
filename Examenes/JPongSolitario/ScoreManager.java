import java.util.Collections;
import java.util.TreeSet;

public class ScoreManager {

  private TreeSet<Integer> topScores = new TreeSet<>(Collections.reverseOrder());

  public void addScore(int seconds) {
    topScores.add(seconds);
    while (topScores.size() > 3) {
      topScores.pollLast();
    }
  }

  public String getTopScoresText() {
    String texto = "";
    int pos = 1;
    for (int score : topScores) {
      texto += pos + ". " + score + " segundos\n";
      pos++;
    }
    return texto;
  }
}