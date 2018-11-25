class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numberToString = Integer.toString(numberToCheck);
		Integer numberLength =  numberToString.length();

		if (numberLength.equals(1)) {
            return true;
        } else {
            Integer armstrongResult = calculateArmstrongResult(numberToString, numberLength);

            return (numberToCheck == armstrongResult);
        }
	}

    Integer calculateArmstrongResult(String numberToString, Integer numberLength) {
        final Integer[] totalSum = {0};

        numberToString.chars()
                .mapToObj(i -> (char)i)
                .forEach(
                        digit -> {
                            Integer digitValue = Character.getNumericValue(digit);
                            totalSum[0] += (int) Math.pow(digitValue, numberLength);
                        }
                );

        return totalSum[0];
	}

}
