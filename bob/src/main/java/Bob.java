public class Bob {
    private String statementToBob;

    public String hey(String statementToBob ) {
        String response = new String("Whatever.");

        String questionMark = String.valueOf('?');

        String lastCharacter = String.valueOf("");

        if (!isWhitespace(statementToBob)){
            lastCharacter = statementToBob.substring(statementToBob.length() -1);
        }

        if(isWhitespace((statementToBob))){
            response = "Fine. Be that way!";
        }
        if (compareLastCharacter(lastCharacter, questionMark)) {
            response = "Sure.";
        }
        if (isUpperCase(statementToBob) && isAlpha(statementToBob)){
            response = "Whoa, chill out!";
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

    private static boolean isAlpha(String phrase){
        return phrase.matches(".*[a-zA-Z]+.*");
    }

    private static boolean compareLastCharacter(String lastCharacter, String comparedCharacter){
        return lastCharacter.equals(comparedCharacter);
    }

    private static boolean isUpperCase(String phrase){
        return phrase.equals(phrase.toUpperCase());
    }
}
