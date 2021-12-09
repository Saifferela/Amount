import java.util.List;

public class AmountApp {

    public static void main(String[] args) {

        List<String> words = List.of("Java", "JavaScript", "Python", "C", "Ruby", "Java");
        String word = "Java";

        long amount = new DuplicateFinder(words).findAmount(word);
        System.out.printf("word %s appears %d times in list %s%n", word, amount, words);


        String word1 = "Ruby";
        long amount1 = new DuplicateFinder(words).findAmount(word1);
        System.out.printf("word %s appears %d times in list %s%n", word1, amount1, words);
    }
}