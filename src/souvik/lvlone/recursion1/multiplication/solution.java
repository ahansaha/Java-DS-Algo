package souvik.lvlone.recursion1.multiplication;

import java.util.Scanner;

public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m == 0 || n == 0) {
            return 0;
        }
    	int sa = multiplyTwoIntegers(m, n - 1);
        return sa + m;
	}
}