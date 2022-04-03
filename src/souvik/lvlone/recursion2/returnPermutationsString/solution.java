package souvik.lvlone.recursion2.returnPermutationsString;

public class solution {
	
	public static String[] permutationOfString(String input){
	    if(input.length() == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        
        String[] so = permutationOfString(input.substring(1));
        String[] output = new String[so.length * input.length()];

        for(int i = 0; i < input.length(); i++) {
            for(int j = 0; j < so.length; j++) {
                output[i * so.length + j] = so[j].substring(0, i) + input.charAt(0) + so[j].substring(i);
            }
        }

        return output;
	}
}

