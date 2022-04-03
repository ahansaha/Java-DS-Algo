package souvik.lvlone.recursion2.binarySearch;

public class solution {
	
    public static int binarySearch(int[] input, int si, int ei, int x) {
        if(si > ei) {
            return -1;
        }
        
        int midIdx = (si + ei) / 2;
        
        if(input[midIdx] == x) {
            return midIdx;
        }
        else if(input[midIdx] < x) {
            return binarySearch(input, midIdx + 1, ei, x);
        }
        else if(input[midIdx] > x) {
            return binarySearch(input, si, midIdx - 1, x);
        }

        return -1;
    }

	public static int binarySearch(int input[], int element) {
        return binarySearch(input, 0, input.length - 1, element);
	}
}

