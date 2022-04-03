package souvik.lvlone.recursion2.returnKeyPadCode;

public class solution {

    public static String keypadCode(int n) {
        String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return codes[n];
    }

	public static String[] keypad(int n) {
	    if(n <= 1) {
            String[] arr = new String[1];
            arr[0] = "";
            return arr;
        }

        String[] smallOutput = keypad(n / 10);

        int lastDigit = n % 10;
        String lastDigitStr = keypadCode(lastDigit);
        
        String[] output = new String[smallOutput.length * lastDigitStr.length()];
        for(int i = 0; i < lastDigitStr.length(); i++) {
            for(int j = 0; j < smallOutput.length; j++) {
                output[(i * smallOutput.length) + j] = smallOutput[j] + lastDigitStr.charAt(i);
            }
        }

        return output;
	}
}

