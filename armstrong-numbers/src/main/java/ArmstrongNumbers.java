
class ArmstrongNumbers {
	boolean isArmstrongNumber(int numberToCheck) {
		int sum = 0;
		int remainder = 0;

		int digits = Integer.valueOf(numberToCheck).toString().length();
		int temp = numberToCheck;

		while (temp != 0) {
			remainder = temp % 10;
			sum += Math.pow(remainder, digits);
			temp = temp / 10;
		}
		return sum == numberToCheck;
	}

}
