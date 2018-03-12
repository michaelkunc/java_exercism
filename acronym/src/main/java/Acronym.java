class Acronym {
    private final String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String result = "";
        String[] splitPhrase = this.phrase.split("[-\\s]");
        for (String s:  splitPhrase){
            result += Character.toUpperCase(s.charAt(0));
        }
        return result;
    }

}
