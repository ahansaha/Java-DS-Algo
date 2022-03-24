package souvik.lvlone.recursion1b.replacePi;

public class solution {

    public static String replace(String input) {
        if(input.length() <= 1) {
            return input;
        }
        
        String str;
        if(input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            str = "3.14" + replace(input.substring(2));
        }
        else {
            str = input.charAt(0) + replace(input.substring(1));
        }
        return str;

    }
    
}
