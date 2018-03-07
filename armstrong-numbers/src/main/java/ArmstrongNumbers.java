import java.util.LinkedList;
import java.lang.Math;

class ArmstrongNumbers {
	static int power(int n, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++) 
         p = p*n;
 
      return p;
	}
	boolean isArmstrongNumber(int numberToCheck) {
		int sum = 0, temp, remainder, digits = 0;
		temp = numberToCheck;

		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		temp = numberToCheck;

		while (temp != 0) {
			remainder = temp % 10;
			sum = sum + power(remainder, digits);
			temp = temp / 10;
		}
		return sum == numberToCheck;
	}

}
