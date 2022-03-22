package souvik.lvlone.recursion1.geometricSum;


public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0) {
            return 1;
        }
        
        double sa = findGeometricSum(k - 1);
        return sa + (1 / Math.pow(2, k));
	}
}
