package souvik.lvlone.recursion2.printKeypadCombinationsCode;

public class solution {

    public static String keypadCode(int n) {
        String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return codes[n];
    }

    public static void printKeypad(int n, String str) {
        if(n <= 1) {
            System.out.println(str);
            return;
        }
        
        int lastDigit = n % 10;
        String lastDigitStr = keypadCode(lastDigit);

        for(int i = 0; i < lastDigitStr.length(); i++) {
            printKeypad(n / 10, lastDigitStr.charAt(i) + str);
        }
    }

	public static void printKeypad(int input){
	    printKeypad(input, "");
    }
}
