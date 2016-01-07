import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String givenWord;

    public Anagram(String givenWord) {
        this.givenWord = givenWord;
    }

    private char[] charArray(String word){
        char[] charArray = word.toLowerCase().toCharArray();
        return charArray;
    }

    public List<String> match(List<String>possibleMatches){
        List<String> anagrams = new ArrayList<String>();
        char[] givenWordLetters = charArray(this.givenWord);
        Arrays.sort(givenWordLetters);

        for (String possibleMatch : possibleMatches) {
            char[] possibleMatchLetters = charArray(possibleMatch);
            Arrays.sort(possibleMatchLetters);

            boolean sameLetters = Arrays.equals(givenWordLetters, possibleMatchLetters);
            boolean sameWord = this.givenWord.toLowerCase().equals(possibleMatch.toLowerCase());

            if (sameLetters && !sameWord){
                anagrams.add(possibleMatch);
            }
        }
    return anagrams;
    }

}
