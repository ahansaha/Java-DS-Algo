package souvik.lvlone.recursion1.sumOfArray;

import java.util.*;

public class Solution {
    
    public static int sum(int input[], int si) {
        if(input.length - 1 == si) {
            return input[si];
        }
        return sum(input, si + 1) + input[si];
    }

    public static int sum(int input[]) {
        return sum(input, 0);
    }
}
