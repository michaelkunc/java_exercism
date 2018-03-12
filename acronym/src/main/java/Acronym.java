class Acronym {
    private final String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder result = new StringBuilder("");
        String[] splitPhrase = this.phrase.split("[-\\s]");
        for (String s:  splitPhrase){
            result.append(Character.toUpperCase(s.charAt(0)));
        }
        return result.toString();
    }

}
