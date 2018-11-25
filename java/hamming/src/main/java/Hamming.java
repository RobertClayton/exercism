class Hamming {

    private String left;
    private String right;

    Hamming(String leftStrand, String rightStrand) {
        left = leftStrand;
        right = rightStrand;

        if (left.length() != right.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    int getHammingDistance() {
        char[] leftCharArray = left.toCharArray();
        char[] rightCharArray = right.toCharArray();
        int diffCount = 0;

        for(int i = 0; i < leftCharArray.length; i++) {
            if (leftCharArray[i] != rightCharArray[i]) {
                diffCount += 1;
            }
        }

        return diffCount;
    }

}
