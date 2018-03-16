class RaindropConverter {

    String convert(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0){
            result.append("Pling");
        } else if (number % 5 == 0){
            result.append("Plang");
        } else if (number % 7 == 0){
            result.append("Plong");
        } else {
            result.append(String.valueOf(number));
        }
        return result.toString();
    }

}
