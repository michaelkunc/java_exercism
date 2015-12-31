import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Anagram {

    private String givenWord;

    public Anagram(String givenWord){
        this.givenWord = givenWord;
    }

    public List<String> match(List<String> possibleMatches){
        List<String> anagrams = new ArrayList<String>();
        char[] givenWordLetters = this.givenWord.toCharArray();
        Arrays.sort(givenWordLetters);

        for (String possibleMatch : possibleMatches) {
            char[] possibleMatchLetters = possibleMatch.toCharArray();
            Arrays.sort(possibleMatchLetters);

            boolean sameLetters = Arrays.equals(givenWordLetters, possibleMatchLetters);

            if (sameLetters) {
                anagrams.add(possibleMatch);
            }
        }
        return anagrams;

    }
}
