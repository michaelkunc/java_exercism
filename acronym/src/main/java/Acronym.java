class Acronym {
    private final String phrase;
    private final String[] splitPhrase;

    Acronym(String phrase) {
        this.phrase = phrase;
        this.splitPhrase = this.phrase.split("[-\\s]");
    }

    String get() {
        StringBuilder result = new StringBuilder("");
        for (String s: splitPhrase){
            result.append(Character.toUpperCase(s.charAt(0)));
        }
        return result.toString();
    }

}
