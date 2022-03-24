package souvik.lvlone.recursion1b.stringToInteger;

import java.util.*;

public class solution {

	public static int convertStringToInt(String input){
       if(input.length() == 1) {
           int num = (int) input.charAt(0) - '0';
           return num;
       }
       int sa = convertStringToInt(input.substring(0, input.length() - 1));
       int lastDigit = (int) input.charAt(input.length() - 1) - '0';
       return sa * 10 + lastDigit;
	}
}

