package souvik.lvlone.recursion1.firstIndexOfNumber;


public class Solution {

    public static int firstIndex(int input[], int si, int x) {
        if(input.length == si) {
            return -1;
        }
        if(input[si] == x) {
            return si;
        }
        return firstIndex(input, si + 1, x);
    }
    
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, 0, x);	
	}
	
}