import java.util.List;

public class AmountApp {

    public static void main(String[] args) {

        List<String> words = List.of("Java", "JavaScript", "Python", "C", "Ruby", "Java");
        String word = "Java";

        DuplicateFinder duplicateFinder = new DuplicateFinder(words);

        long amount = duplicateFinder.findAmount(word);
        System.out.printf("word %s appears %d times in list %s%n", word, amount, words);
    }
}