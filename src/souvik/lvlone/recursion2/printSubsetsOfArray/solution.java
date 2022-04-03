package souvik.lvlone.recursion2.printSubsetsOfArray;

public class solution {
	
    public static void printSubsets(int input[], int si, int output[]) {
        if(si == input.length) {
            for(int i = 0; i < output.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        int[] newOutput = new int[output.length + 1];
        for(int i = 0; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[newOutput.length - 1] = input[si];
        printSubsets(input, si + 1, newOutput);
        printSubsets(input, si + 1, output);
    }

	public static void printSubsets(int input[]) {
		int[] output = {};
	    printSubsets(input, 0, output);	
	}
}

