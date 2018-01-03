import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Guest on 1/3/18.
 */
public class WordGameTest {



    @Test
    public void getWords_doIHaveWords_StringArray() {
        WordGame testWord = new WordGame();
        String[] expected = {"moon", "sun", "dog"};
        assertEquals(expected, testWord.getWords());
        System.out.println(testWord.getWords()[0]);
    }

}


//    @Test
//    public void newWord_picksAWord() {
//        WordGame testWord = new WordGame();
//        assertEquals(true, testWord instanceof WordGame);
//    }
//
//    @Test
//    public void isLetter_returnsALetter() {
//        WordGame testWord = new WordGame();
//        //simulate user input by r
//        String fakeUserInput = "a";
//        testWord.userGuessed(fakeUserInput);
//        assertEquals("a", "a");
//    }