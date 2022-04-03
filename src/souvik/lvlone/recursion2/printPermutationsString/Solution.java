package souvik.lvlone.recursion2.printPermutationsString;

public class Solution {

    public static void FindPermutations(String input, String output) {
		if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        
		for(int i = 0; i <= output.length(); i++) {
            String str = output.substring(0, i) + input.charAt(0) + output.substring(i);
            FindPermutations(input.substring(1), str);
        }
	}
    
	public static void FindPermutations(String str) {
		FindPermutations(str, "");
	}
}


