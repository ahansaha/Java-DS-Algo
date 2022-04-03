package souvik.lvlone.recursion2.removeDuplicates;

import java.util.*;

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
	    if(s.length() == 1) {
            return s;
        }
        String sa = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == sa.charAt(0)) {
            s = sa;
        } 
        else {
            s = s.charAt(0) + sa;
        }
        return s;
	}

}
