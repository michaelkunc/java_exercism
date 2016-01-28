public class PhoneNumber {
    String inputNumber;
    String outputNumber = "";
    String zeroes = "0000000000";

    public PhoneNumber (String inputNumber){
        this.inputNumber = inputNumber;
    }

//not crazy about this particular flow. seems like it could be split out more
    public String getNumber(){
        for (char y : this.inputNumber.toCharArray()) {
            if (Character.isDigit(y)){
                outputNumber += y;
            }
        }
        if (isValidLength(outputNumber)){
            return outputNumber;
        } else if (startsWith11(outputNumber)){
            return outputNumber.substring(1,11);
        }
        else {
            return zeroes;
        }
    }

    public String getAreaCode(){
        String areaCode = inputNumber.substring(0,3);
        return areaCode;
    }

    public String pretty(){
        if (startsWith11(inputNumber)){
            return createPrettyNumber(1,4,7,11);
        }
        return createPrettyNumber(0,3,6,10);
    }

    private boolean isValidLength(String phoneNumber){
        return (phoneNumber.length() == 10);
    }

//    not crazy about this method name
    private boolean startsWith11(String phoneNumber){
        return (phoneNumber.length() == 11) && (phoneNumber.substring(0,1).equals(String.valueOf("1")));
    }

    private String createPrettyNumber(int firstIndex, int secondIndex, int thirdIndex, int fourthIndex){
        String pretty =  "(".concat(inputNumber.substring(firstIndex,secondIndex)).concat(")")
                .concat(" ").concat(inputNumber.substring(secondIndex,thirdIndex).concat("-")
                        .concat(inputNumber.substring(thirdIndex,fourthIndex)));
        return pretty;
    }

}
