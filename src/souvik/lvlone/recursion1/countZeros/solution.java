package souvik.lvlone.recursion1.countZeros;


public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        if(input < 10) {
            if(input == 0) return 1;
            else return 0;
        }
        
        int sa = countZerosRec(input / 10);
        
        int lastDigit = input % 10;
        if(lastDigit == 0) {
            sa += 1;
        }
        return sa;
        
	}
}
