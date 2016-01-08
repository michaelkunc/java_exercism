
public class Bob {
    private String statementToBob;

    public String hey(String statementToBob ) {
        String response = new String("Whatever.");
        String lastCharacter = statementToBob.substring(statementToBob.length() - 1);
        String exclamationPoint = String.valueOf('!');
        String questionMark = String.valueOf('?');

        boolean containsLettes = statementToBob.matches(".*[a-zA-Z]+.*");

        if (statementToBob.equals(statementToBob.toUpperCase()) && containsLettes){
            response = "Whoa, chill out!";
        } else if (lastCharacter.equals(questionMark)){
            response = "Sure.";
        }
        return response;
    }
}
