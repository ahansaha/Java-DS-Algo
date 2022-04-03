package souvik.lvlone.recursion2.returnAllCodesString;

public class solution {

	public static  String[] getCode(String input) {
	    if(input.length() == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }

        String[] arr1 = getCode(input.substring(1));
        String[] arr2 = new String[0];
        
        String str1 = ((char) (Integer.parseInt(input.substring(0, 1)) + 'a' - 1)) + "";
        String str2 = "";
        if(input.length() >= 2 && Integer.parseInt(input.substring(0, 2)) >= 1 && Integer.parseInt(input.substring(0, 2)) <= 26) {
            str2 = ((char) (Integer.parseInt(input.substring(0, 2)) + 'a' - 1)) + "";
            arr2 = getCode(input.substring(2));
        }
        String[] output = new String[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            output[i] = str1 + arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            output[arr1.length + i] = str2 + arr2[i];
        }
        return output;
	}
}