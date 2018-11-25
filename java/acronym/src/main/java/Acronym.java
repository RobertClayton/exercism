class Acronym {

    private char[] phraseCharArray;

    Acronym(String phrase) {
        phraseCharArray = phrase.toCharArray();
    }

    String get() {
        String acronym = "";

        acronym += phraseCharArray[0];

        for (int i = 0; i < phraseCharArray.length; i++) {
            if (!Character.isLetterOrDigit(phraseCharArray[i]))
                acronym += phraseCharArray[i + 1];
        }

        return acronym.toUpperCase().replaceAll("\\s+","");

    }

}