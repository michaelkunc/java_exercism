public class Bob {
    private String statementToBob;

    public String hey(String statementToBob ) {
        String response = new String("Whatever.");
        String questionMark = String.valueOf('?');
        String lastCharacter = String.valueOf("");
        boolean containsLetters = statementToBob.matches(".*[a-zA-Z]+.*");
        boolean notEmpty = statementToBob.length() == 0;

        if (!notEmpty){
            lastCharacter = statementToBob.substring(statementToBob.length() - 1);
        }

        if (statementToBob.equals(statementToBob.toUpperCase()) && containsLetters){
            response = "Whoa, chill out!";
        } else if (lastCharacter.equals(questionMark)){
            response = "Sure.";
        } else if ((statementToBob.length() == 0) || isWhitespace((statementToBob))){
            response = "Fine. Be that way!";
        }
        return response;
    }

    private static boolean isWhitespace(String phrase){
        for (char x : phrase.toCharArray()){
            if (!Character.isWhitespace(x)) {
                return false;
            }
        }
    return true;
    }
}
