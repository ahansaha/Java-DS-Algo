package souvik.lvlone.recursion2.printSubSequence;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.subsequences(str);
        sc.close();
    }
}
