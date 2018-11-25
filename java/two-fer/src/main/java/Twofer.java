class Twofer {
    String twofer(String name) {
        String answer;

        if (name != null) {
            answer = name;
        } else {
            answer = "you";
        }

        return "One for " + answer + ", one for me.";
    }
}
