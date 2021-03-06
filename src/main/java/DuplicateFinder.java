import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFinder {

    private final List<String> words;
    private final Map<String, Long> repository = new HashMap<>();

    public DuplicateFinder(List<String> words) {
        this.words = words;
    }


    public long findAmount(String word) {

        if(word == "" || word == null){
            return 0;
        }

        if(!repository.isEmpty()){
            return repository.get(word);
        }

        for (String oneWordFromList : words) {
            if (!repository.containsKey(oneWordFromList)) {
                repository.put(oneWordFromList, 1L);
            }

                long count = repository.get(oneWordFromList);
                repository.put(oneWordFromList, count + 1);
        }

        if(!repository.containsKey(word))
            return 0;

        return repository.get(word);
    }
}