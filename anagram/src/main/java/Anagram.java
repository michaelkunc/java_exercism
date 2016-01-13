import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String givenWord;
    private String sortedGivenWord;

    public Anagram(String givenWord) {
        this.givenWord = givenWord;
        sortedGivenWord = sortLetters(givenWord);
    }

    private String sortLetters(String word){
        char[] charArray = word.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    private boolean sameLetters(String possibleMatch){
        return sortedGivenWord.equals(possibleMatch);
    }

    private boolean sameWord(String possibleMatch){
        return this.givenWord.toLowerCase().equals(possibleMatch.toLowerCase());
    }

    public List<String> match(List<String>possibleMatches){
        List<String> anagrams = new ArrayList<String>();


        for (String possibleMatch : possibleMatches) {
            String sortedPossibleWord = sortLetters(possibleMatch);
            if (sameLetters(sortedPossibleWord) && !sameWord(possibleMatch)){
                anagrams.add(possibleMatch);
            }
        }
    return anagrams;
    }

}
