package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class FibonacciWithIterativeDP {

    // here we are writing code for the  fibonaccci number problem : In Iterative way using Dp:
    public static int fibbIterative(int n){

        // here we have base case: for given input value:
        if(n == 0 || n ==1){
            return n;
        }

        //  here we create array with the length of (n+1):
        // means one Index bigger than the input value:
        // because we also use 0th index number:
        int dp [] = new int[n +1];
        // here we have base case for our output:
        // here the 0th index or 1th Index  will have already its values acc to the problem logic:
        dp[0] = 0; // here 0th Index of the array will have value of Zero: acc to problem logic:
        dp[1] = 1; // here 1th Index of the array will have value of one; acc to problems logic:

        // here we calculating the fibonacci number from 2 to n:
        // because we aleardy solve 0 or 1 IndeX in the base case:
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i -1 ] + dp[i - 2]; // here we are finding the fibonacci number:
        }

        return dp[n]; //and here we are returning the Nth array value as a result of fibonacci Number:
        // because that is our fibonacci number:

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number here :");
        int  n = s.nextInt();
        System.out.println(fibbIterative(n));
    }
    
}
