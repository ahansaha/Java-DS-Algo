package souvik.lvlone.recursion1.lastIndexOfNumber;


public class Solution {
    
    public static int lastIndex(int input[], int si, int x) {
        
        if(input.length == si) {
            return -1;
        }
        
        int ans = lastIndex(input, si + 1, x);
        
        if(ans != -1) {
            return ans;
        }
        
        else if(ans == -1 && input[si] == x) {
            return si;
        }
        
        return -1;
    }

	public static int lastIndex(int input[], int x) {
		return lastIndex(input, 0, x);
	}
	
}
