import java.util.Random;



public class WordGame {

    //you need a constructor!
    private String[] words = {"moon", "sun", "dog"};
    private Random myRandomGenerator = new Random();
    private Integer randomWord = myRandomGenerator.nextInt(words.length);
    private String currentWord;
    private String emptyWord;
    private String userGuessed;


        public WordGame(){
            this.currentWord = words[randomWord];
        }

//        public emptyOutTheArray(){
//            this.emptyWord = currentWord;
//        }
//
//        public playerOneGuess(){
//            this.userGuessed = userGuessed;
//        }

//        public String isLetter(){
//                return "a";
//        }
//        public static String[] wordSplit(){
//            String splitWord = pickRandomWord();
//            String[] splitArray = splitWord.split("");
//            return splitArray;
//        }
    public String[] getWords(){
            return words;
    }

}







