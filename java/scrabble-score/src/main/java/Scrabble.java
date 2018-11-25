import java.util.*;

class Scrabble {

    private String word;
    private int charValue;
    private HashMap values;

    Scrabble(String scrabbleWord) {
        word = scrabbleWord;
        int charValue = 0;
        HashMap<Integer, String> values = new HashMap<Integer, String>();
        values.put(1, "AEIOULNRST");
        values.put(2, "DG");
        values.put(3, "BCMP");
        values.put(4, "FHVWY");
        values.put(5, "K");
        values.put(8, "JX");
        values.put(10, "QZ");
    }

    int getScore() {
        if (word.equals(""))
            return 0;

//        int result = 2;
        getLetterValue();
        return charValue;
    }

    public void getLetterValue() {
        charValue = 0;

        if(values.values().contains(word)) {
            charValue = 4;
        }

//        charValue = 0;
    }
}

