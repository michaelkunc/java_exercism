public class PhoneNumber {
    String inputNumber;
    String outputNumber = "";
    String zeroes = "0000000000";

    public PhoneNumber (String inputNumber){
        this.inputNumber = inputNumber;
    }

    public String getNumber(){
        for (char y : this.inputNumber.toCharArray()) {
            if (Character.isDigit(y)){
                outputNumber += y;
            }
        }
        if (isValidLength(outputNumber)){
            return outputNumber;
        } else {
            return zeroes;
        }
    }

    public String getAreaCode(){
        String areaCode = new String("areaCode");
        return areaCode;
    }

    public String pretty(){
        String pretty = new String("Prettyfy");
        return pretty;
    }

    private boolean isValidLength(String number){
        return number.length() == 10;
    }

//    private boolean startsWith11(String number){
//        return
//    }
}
