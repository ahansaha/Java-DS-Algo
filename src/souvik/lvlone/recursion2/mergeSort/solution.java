package souvik.lvlone.recursion2.mergeSort;

import java.util.*;

public class solution {

    public static void mergeTwoSortedArrays(int input[], int arr1si, int arr1ei, int arr2si, int arr2ei) {
        int arr3[] = new int[arr2ei - arr1si + 1];
        int i = arr1si, j = arr2si, k = 0;

        while(i <= arr1ei && j <= arr2ei) {
            if(input[i] <= input[j]) {
                arr3[k++] = input[i++];
            }
            else {
                arr3[k++] = input[j++];
            }
        }

        while(i <= arr1ei) {
            arr3[k++] = input[i++];
        }
        while(j <= arr2ei) {
            arr3[k++] = input[j++];
        }

        k = 0;
        for(int idx = arr1si; idx <= arr2ei; idx++) {
            input[idx] = arr3[k++];
        }
    }

    public static void mergeSort(int input[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int midIdx = (si + ei) / 2;
        mergeSort(input, si, midIdx);
        mergeSort(input, midIdx + 1, ei);
        mergeTwoSortedArrays(input, si, midIdx, midIdx + 1, ei);
    }

	public static void mergeSort(int[] input){
	    mergeSort(input, 0, input.length - 1);	
	}
}

