class RaindropConverter {

    String convert(int number) {
        String answer = "";

        if (number % 3 == 0)
                answer += "Pling";

        if (number % 5 == 0)
            answer += "Plang";

        if (number % 7 == 0)
            answer += "Plong";

        if (answer.equals(""))
            answer = Integer.toString(number);

        return answer;
    }

}
