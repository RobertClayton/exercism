class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] chars = dnaStrand.toCharArray();
        StringBuilder transcribedDna = new StringBuilder();

        System.out.println(chars);
        for (char ch : chars) {
            String chString = Character.toString(ch);

            switch (chString) {
                case "G":
                    transcribedDna.append("C");
                    break;
                case "C":
                    transcribedDna.append("G");
                    break;
                case "T":
                    transcribedDna.append("A");
                    break;
                case "A":
                    transcribedDna.append("U");
                    break;
            }
        }
        return transcribedDna.toString();
    }

}