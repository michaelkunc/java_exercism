public class Pangrams {

    public static boolean isPangram(String phrase){
        for (char a = 'a'; a <= 'z'; a++)
            if ((phrase.toLowerCase().indexOf(a) < 0))
                return false;
        return true;
    }

}
