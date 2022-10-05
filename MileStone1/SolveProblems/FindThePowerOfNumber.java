package SolveProblems;

import java.util.Scanner;

public class FindThePowerOfNumber {

    public static void main(String[] args) {
        
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = (int)Math.pow(x,n); // for finding out the power of the number. we can use the (math.pow) function.
        // this is used for if we want to perform a power number method.
        System.out.print(ans);
        
    }
}
    
    

