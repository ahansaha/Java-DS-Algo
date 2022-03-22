package souvik.lvlone.recursion1.power;

public class Solution {

	public static int power(int x, int n) {
		
		if(n == 0 || x == 0) {
            return 1;
        }
        int sa = power(x, n - 1);
        return sa * x;
	}
}
