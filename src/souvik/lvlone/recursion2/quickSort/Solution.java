package souvik.lvlone.recursion2.quickSort;

public class Solution {
	
	public static void swap(int[] input, int idxOne, int idxTwo) {
		int t = input[idxTwo];
		input[idxTwo] = input[idxOne];
		input[idxOne] = t;
	}

    public static int partition(int[] input, int si, int ei) {
        int count = 0;
        for(int i = si + 1; i <= ei; i++) {
            if(input[si] > input[i]) {
                count++;
            }
        }

        swap(input, si, si + count);
        int pivotIdx = si + count;

        int i = si, j = ei;
        while(i < pivotIdx && j > pivotIdx) {
            if(input[i] < input[pivotIdx]) {
                i++;
            }
            else if(input[j] >= input[pivotIdx]) {
                j--;
            }
            else {
                swap(input, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }
	
    public static void quickSort(int[] input, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int pivotIdx = partition(input, si, ei);
        quickSort(input, si, pivotIdx - 1);
        quickSort(input, pivotIdx + 1, ei);
    }

	public static void quickSort(int[] input) {
	    quickSort(input, 0, input.length - 1);	
	}
	
}
