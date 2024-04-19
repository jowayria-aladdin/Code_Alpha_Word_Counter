
package wordcounterfinal;

import javax.swing.SwingUtilities;

public class WordCounterFinal {

  public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WordCounter wordCounter = new WordCounter();
                wordCounter.setVisible(true);
            }
        });
    }
}
