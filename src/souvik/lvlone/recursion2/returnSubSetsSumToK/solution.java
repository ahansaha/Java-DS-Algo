package souvik.lvlone.recursion2.returnSubSetsSumToK;

public class solution {

	public static int[][] subsetsSumK(int input[],int si, int k) {
	   
        if(si == input.length) {
            if(k == 0) {
                int[][] output = new int[1][0];
                return output;
            }
            else {
                int[][] output = new int[0][0];
                return output;
            }
        }

        int[][] arr1 = subsetsSumK(input, si + 1, k);
        int[][] arr2 = subsetsSumK(input, si + 1, k - input[si]);

        int[][] output = new int[arr1.length + arr2.length][];

        for(int i = 0; i < arr1.length; i++) {
            output[i] = new int[arr1[i].length];
            for(int j = 0; j < arr1[i].length; j++) {
                output[i][j] = arr1[i][j];
            }
        }

        for(int i = 0; i < arr2.length; i++) {
            output[arr1.length + i] = new int[arr2[i].length + 1];
            output[arr1.length + i][0] = input[si];
            for(int j = 0; j < arr2[i].length; j++) {
                output[arr1.length + i][j + 1] = arr2[i][j];
            }
        }

        return output;
	}

    public static int[][] subsetsSumK(int input[], int k) {
        return subsetsSumK(input, 0, k);
    }
}

