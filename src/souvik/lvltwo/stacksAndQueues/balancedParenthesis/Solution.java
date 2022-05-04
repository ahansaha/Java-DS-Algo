package souvik.lvltwo.stacksAndQueues.balancedParenthesis;

import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String str) {
    	
    	if(str.charAt(0) == ')') {
    		return false;
    	}
    	
    	Stack<String> stack = new Stack<>();
    	
    	for(int i = 0; i < str.length(); i++) {
    		
    		if(str.charAt(i) == '(') {
    			stack.push(str.charAt(0) + "");
    		}
    		else if(str.charAt(i) == ')' && !stack.empty()) {
    			stack.pop();
    		}
    		else {
    			return false;
    		}
    		
    	}
    	
    	return stack.empty();
    }
}