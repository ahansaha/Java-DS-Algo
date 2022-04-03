package souvik.lvlone.recursion2.returnSubSequence;

import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<String> subsequences(String str) {
		
	    if(str.length() == 0) {
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add(" ");
            return arrList;
        }
	    
        ArrayList<String> sa = subsequences(str.substring(1));
        int saSize = sa.size();
        for(int i = 0; i < saSize; i++) {
            sa.add(str.charAt(0) + sa.get(i));
        }   
        
        return sa;
    }
}
