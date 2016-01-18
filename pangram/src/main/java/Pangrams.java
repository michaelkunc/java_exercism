//package src.main.java;

public class Pangrams {

    public static boolean isPangram(String phrase){
        String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
        char[] letterArray = phrase.toLowerCase().toCharArray();
        String sortedPhrase = String.valueOf(letterArray);
        return sortedPhrase == alphabet;
    }
}
