package souvik.lvlone.timeAndSpaceComplexity.findTheUniqueElement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

	public static int findUnique(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		return 0;
		
	}
}
