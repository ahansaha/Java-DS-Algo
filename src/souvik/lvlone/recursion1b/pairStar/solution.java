package souvik.lvlone.recursion1b.pairStar;

import java.util.*;

public class solution {

	public static String addStars(String s) {
       if(s.length() <= 1) {
           return s;
       }
       
       String sa = addStars(s.substring(1));
       if(s.charAt(0) == sa.charAt(0)) {
           s = s.charAt(0) + "*" + sa;
       }
       else {
           s = s.charAt(0) + sa;
       }

       return s;
	}
}

