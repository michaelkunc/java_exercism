import java.util.Random;
import java.util.Set;
import java.util.HashSet;


public class Robot {
    String name = new String("");
    private static Set<String> namesCurrentlyUsed = new HashSet<String>();


    public Robot(){
        reset();
    }

    public String getName(){
        return name;
    }

    public String createName(){
        String name = String.valueOf(new StringBuilder().append(randomLetter()).append(randomLetter()).append(randomNumber()));
        return name;
    }

    public void reset(){
        String oldName = this.name;
        while (this.name.isEmpty() || namesCurrentlyUsed.contains(this.name)){
            this.name = createName();
        }
        namesCurrentlyUsed.add(this.name);
        namesCurrentlyUsed.remove(oldName);
    }

    private static int randomNumber(){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt((999 - 100) + 1) + 0;
        return randomNumber;
    }

    private static String randomLetter(){
        Random rnd = new Random();
        char c = (char)(rnd.nextInt(26) + 'A');
        return String.valueOf(c);
    }

}
