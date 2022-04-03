package souvik.lvlone.recursion2.replaceCharacter;

import java.util.*;

public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length() < 1) {
            return input;
        }
        if(input.charAt(0) == c1) {
            input = c2 + input.substring(1);
        }
        input = input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
        return input;
	}
}

