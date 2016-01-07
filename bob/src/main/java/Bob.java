
public class Bob {
    private String statementToBob;

    public String hey(String statementToBob ) {
        String response = new String("Whatever.");
        String lastCharacter = statementToBob.substring(statementToBob.length() - 1);
        String exclamationPoint = String.valueOf('!');
        if (lastCharacter.equals(exclamationPoint)){
            response = "Whoa, chill out!";
            return response;
        }
        return response;
    }
}
