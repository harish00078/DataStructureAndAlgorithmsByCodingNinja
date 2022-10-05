package milestone1lecture4;

import java.util.Scanner;

public class AsssignmentQuestionFindPowerOfNumber {

    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = (int)Math.pow(x,n);
        System.out.print(ans);
    }
    
}
