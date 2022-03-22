package souvik.lvlone.recursion1.checkPalindrome;


public class solution {
    
    public static boolean isStringPalindrome(String input, int si, int ei) {
        if(si >= ei) {
            return true;
        }
        boolean sa = isStringPalindrome(input, si + 1, ei - 1);
        if(sa) {
            if(input.charAt(si) == input.charAt(ei)) {
                return true;
            }
        }
        return false;
	}

	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, 0, input.length() - 1);
	}
}
