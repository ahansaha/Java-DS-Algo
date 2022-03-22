package souvik.lvlone.recursion1.checkNumber;

public class Solution {
    
    public static boolean checkNumber(int input[], int si, int x) {
        if(input.length == si) {
            return false;
        }
        if(input[si] == x) {
            return true;
        }
        return checkNumber(input, si + 1, x);
    }
	
	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input, 0, x);
	}
}