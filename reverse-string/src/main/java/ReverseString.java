class ReverseString {

    String reverse(String inputString) {
        StringBuilder result = new StringBuilder();
        result.append(inputString);
        return result.reverse().toString();
    }
  
}