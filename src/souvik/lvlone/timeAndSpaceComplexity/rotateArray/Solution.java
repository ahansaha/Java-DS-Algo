package souvik.lvlone.timeAndSpaceComplexity.rotateArray;

public class Solution {  
	
	public static void reverse(int arr[], int si, int ei) {
		
		while(si < ei) {
			int t = arr[si];
			arr[si] = arr[ei];
			arr[ei] = t;
			si++;
			ei--;
		}
	}

    public static void rotate(int[] arr, int d) {
    	
    	reverse(arr, 0, arr.length - 1);
    	reverse(arr, 0, arr.length - d - 1);
    	reverse(arr, arr.length - d, arr.length - 1);
    }

}