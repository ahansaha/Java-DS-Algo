package souvik.lvlone.timeAndSpaceComplexity.pairSum;

import java.util.Arrays;

public class Solution {

	//HASH MAPS WILL BE FASTER HERE
	public static int pairSum(int[] arr, int num) {
		
		Arrays.sort(arr);
		int si = 0, ei = arr.length - 1, ans = 0;
		
		while(si < ei) {
			
			if(arr[si] + arr[ei] == num) {
				
				if(arr[si] != arr[ei]) {
					
					int lc = 1, rc = 1;
					
					while(arr[si + 1] == arr[si]) {
						lc++;
						si++;
					}
					while(arr[ei - 1] == arr[ei]) {
						rc++;
						ei--;
					}
					
					ans += lc * rc;
					si++;
					ei--;
				}
				else if(arr[si] == arr[ei]) {
					
					int n = ei - si + 1;
					ans += (n * (n - 1)) / 2;
					return ans;
				}
			}
			else if(arr[si] + arr[ei] != num) {
				
				if(arr[si] + arr[ei] > num) {					
					ei--;
				}
				else if(arr[si] + arr[ei] < num) {
					si++;
				}
			}			
		}
		
		return ans;
	}
}
