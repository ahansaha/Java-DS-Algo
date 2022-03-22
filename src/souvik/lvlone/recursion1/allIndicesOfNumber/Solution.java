package souvik.lvlone.recursion1.allIndicesOfNumber;


public class Solution {
    
    public static int[] allIndexes(int input[], int si,  int x) {
		
        if(si == input.length) {
            int output[] = {};
            return output;
        }
        
        int output[] = allIndexes(input, si + 1, x);
        
        if(input[si] == x) {
            int outputNew[] = new int[output.length + 1];
        	
            for(int i = 0; i < output.length; i++) {
                outputNew[i + 1] = output[i];
            }
            
            outputNew[0] = si;
            return outputNew;
        }
        
        return output;
	}

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, 0, x);
	}
	
}