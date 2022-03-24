package souvik.lvlone.recursion1b.removeX;

import java.util.*;

public class solution {

	public static String removeX(String input){
        if(input.length() < 1) {
            return input;
        }
        if(input.charAt(0) == 'x') {
            input = removeX(input.substring(1));
        }
        else {
            input = input.charAt(0) + removeX(input.substring(1));
        }
        return input;
	}
}

