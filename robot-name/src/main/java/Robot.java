import java.util.Random;

public class Robot {
    String name;

    public Robot(){
        name = createName();
    }

    public String getName(){
        return name;
    }

    public String createName(){
        String name = String.valueOf(new StringBuilder().append('A').append('B').append(randomNumber()));
        return name;
    }

    public void reset(){
        this.name = "";
    }
    public static int randomNumber(){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt((999 - 100) + 1) + 0;
        return randomNumber;
    }

}
