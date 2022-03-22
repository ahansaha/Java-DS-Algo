package souvik.lvlone.recursion1.printNumbers;

public class Solution {

	public static void print(int n){
		//Write your code here
        if(n < 1) {
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
}
