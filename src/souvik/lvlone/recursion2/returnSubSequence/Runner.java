package souvik.lvlone.recursion2.returnSubSequence;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> result = Solution.subsequences(str);
        
        for(int i = 0; i < result.size(); i++) {
        	System.out.println(result.get(i));
        }
        
        sc.close();
    }
}
