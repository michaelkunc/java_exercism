import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public Anagram(String word){
        this.word = word;
    }

    public List<String> match(List<String> possibleMatches) {
        List<String> anagrams = new ArrayList<String>();
        char[] charArray = this.word.toCharArray();
        Arrays.sort(charArray);

        for (String word : possibleMatches){
            char[] letters = word.toCharArray();
            Arrays.sort(letters);

            boolean sameLetters = Arrays.equals(charArray, letters);

            if (sameLetters){
                anagrams.add(word);
            }
        }
        return anagrams;
    }
}
