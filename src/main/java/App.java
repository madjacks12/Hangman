
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Console;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {


        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Here is your word:" + WordGame.pickRandomWord());

//            WordGame newWordGame = new WordGame();

            System.out.println("Enter your guess:");
            String guessWord = bufferedReader.readLine();
//            System.out.println(guessWord);
//            System.out.println(WordGame.wordSplit());
//            String[] newWords = newWordGame.getWords();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
