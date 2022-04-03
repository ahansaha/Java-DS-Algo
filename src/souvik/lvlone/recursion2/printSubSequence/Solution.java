package souvik.lvlone.recursion2.printSubSequence;

class Solution {

    public static void subsequences(String input, String output) {
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        subsequences(input.substring(1), output);
        subsequences(input.substring(1), output + input.charAt(0));
    }

    public static void subsequences(String str) {
    	subsequences(str, "");
    }
}
