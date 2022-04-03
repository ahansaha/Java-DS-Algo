package souvik.lvlone.recursion2.printSubSetsSumToK;

public class solution {

    public static void printSubsetsSumTok(int[] input, int si, int[] output, int k) {
        if(si == input.length) {
        	if(k == 0) {
        		for(int i = 0; i < output.length; i++) {
                    System.out.print(output[i] + " ");
                }
                System.out.println();
                return;
        	}
        	else {
        		return;
        	}
        }

        int[] newOutput = new int[output.length + 1];
        for(int i = 0; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[output.length] = input[si];

        printSubsetsSumTok(input, si + 1, newOutput, k - input[si]);
        printSubsetsSumTok(input, si + 1, output, k);   
    }

	public static void printSubsetsSumTok(int input[], int k) {
	    printSubsetsSumTok(input, 0, new int[0], k);	
	}
}
