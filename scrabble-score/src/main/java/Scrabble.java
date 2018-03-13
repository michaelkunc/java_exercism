import java.util.HashMap;

class Scrabble {
    private HashMap<Character, Integer> scoreMap = new HashMap<Character, Integer>();
    private char[] letters;

    Scrabble(String word) {
        this.letters = word.toLowerCase().toCharArray();
        scoreMap.put('a', 1);
        scoreMap.put('e', 1);
        scoreMap.put('i', 1);
        scoreMap.put('o', 1);
        scoreMap.put('u', 1);
        scoreMap.put('l', 1);
        scoreMap.put('n', 1);
        scoreMap.put('r', 1);
        scoreMap.put('s', 1);
        scoreMap.put('t', 1);
        scoreMap.put('d', 2);
        scoreMap.put('g', 2);
        scoreMap.put('b', 3);
        scoreMap.put('c', 3);
        scoreMap.put('m', 3);
        scoreMap.put('p', 3);
        scoreMap.put('f', 4);
        scoreMap.put('h', 4);
        scoreMap.put('v', 4);
        scoreMap.put('w', 4);
        scoreMap.put('y', 4);
        scoreMap.put('k', 5);
        scoreMap.put('j', 8);
        scoreMap.put('x', 8);
        scoreMap.put('q', 10);
        scoreMap.put('z', 10);

    }

    int getScore() {
        Integer score = 0;
        for (Character c: this.letters )
        score += scoreMap.get(c);
        return score;
    }

}
