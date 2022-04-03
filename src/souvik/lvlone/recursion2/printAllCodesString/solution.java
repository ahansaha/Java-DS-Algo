package souvik.lvlone.recursion2.printAllCodesString;

public class solution {

    public static void printAllPossibleCodes(String input, String output) {
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        
        String str1 = ((char) (Integer.parseInt(input.substring(0, 1)) + 'a' - 1)) + "";
        printAllPossibleCodes(input.substring(1), output + str1);
        
        if(input.length() >=2 && Integer.parseInt(input.substring(0, 2)) >= 1 && Integer.parseInt(input.substring(0, 2)) <= 26) {
            String str2 = ((char) (Integer.parseInt(input.substring(0, 2)) + 'a' - 1)) + "";
            printAllPossibleCodes(input.substring(2), output + str2);
        }
    }

	public static void printAllPossibleCodes(String input) {
	    printAllPossibleCodes(input, "");	
	}
}
