import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        System.out.println(betterWord("Geras", "Geresnis",(x,y)->x.length() <y.length()));

    }




    public static String betterWord(String firstWord, String secondWord, BiPredicate<String, String> betterWord) {
        return (betterWord.test(firstWord, secondWord)) ? firstWord : secondWord;
    }
}
