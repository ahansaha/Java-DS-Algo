package souvik.lvlone.recursion2.checkAB;

public class Solution {

	public static boolean checkAB(String input) {
	    if(input.length() <= 0) {
            return false;
        }

        if(input.charAt(0) == 'a') {
            if(input.length() == 1) {
                return true;
            }
            else if(input.charAt(1) == 'a') {
                return checkAB(input.substring(1));
            }
            else if(input.length() >= 3 && input.charAt(1) == 'b' && input.charAt(2) == 'b') {
                if(input.length() == 3) {
                    return true;
                }
                else if(input.charAt(3) == 'a') {
                    return checkAB(input.substring(3));
                }
            }
        }
        return false;
	}
}
