import java.util.HashMap;
import java.util.Map;

public class WordCount{
    public Map<String, Integer> phrase(String words){
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] wordArray = words.split("\\s+");
        for (String word : wordArray) {
            Integer count = wordCounts.containsKey(word) ? wordCounts.get(word) : 0;
            wordCounts.put(word, count += 1);
        }
        return wordCounts;
    }
}
