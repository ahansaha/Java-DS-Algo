package souvik.lvlone.recursion1.sumOfDigits;


public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input < 10) {
            return input;
        }
        int sa = sumOfDigits(input / 10);
        int lastDigit = input % 10;
        return sa + lastDigit;
	}
}
