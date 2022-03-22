package souvik.lvlone.recursion1.numberOfDigits;

public class Solution {

	public static int count(int n){
		//Write your code here
        if(n < 10) {
            return 1;
        }
        int sa = count(n / 10);
        return sa + 1;
    }
}
