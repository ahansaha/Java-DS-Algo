package souvik.lvlone.recursion2.returnSubsetsOfArray;

public class solution {

	public static int[][] subsets(int input[], int si) {
	    if(input.length == si) {
            int[][] output = new int[1][0];
            return output;
        }
        
        int[][] so = subsets(input, si + 1);
        int[][] output = new int[so.length * 2][];

        for(int i = so.length; i < output.length; i++) {
        	output[i - so.length]= new int[so[i - so.length].length];
        	output[i] = new int[so[i - so.length].length + 1];
            output[i][0] = input[si];
            for(int j = 1; j < output[i].length; j++) {
            	output[i - so.length][j - 1] = so[i - so.length][j - 1];
                output[i][j] = output[i - so.length][j - 1];
            }
        }

        return output;
	}
	
	public static int[][] subsets(int[] input) {
		return subsets(input, 0);
	}
}

