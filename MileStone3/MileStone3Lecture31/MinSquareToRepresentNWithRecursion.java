package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class MinSquareToRepresentNWithRecursion{

    // here we are using the simple recursion to solve this problem:
    public static int minSquaresToRepresentNUsingRecursion(int n){

        // here we have base case:
        if(n == 0){
            return 0;
        }

        int minAns = Integer.MAX_VALUE; // here we are created the minAns varaible:
        // and we gave him a default value as a (Integer.MAX_VALUE):
        for(int i = 1; i*i <= n; i++){ // here we are finding the minimum square from 1 to (n) number values:
            // here we basically gave them a lenght:like at which number we have to stop squaring the number:
            // and that is the util the square number are less then equal to the (n) value:
            
            int currAns = minSquaresToRepresentNUsingRecursion(n-(i*i));// here in (currAns) variable:
            // we are findind the all the possible squares: and comparing them and find out the minimum amongs them:
            if(minAns > currAns){ // here we are doing that if minAns variable have greater value then the currAns;
                minAns = currAns; // then the MinAns variable  will have  currAns variable value:
            }
        }
        // after all that be simple add 1 with the minAns varaible value:
        int myAns = 1 + minAns;
        return myAns; // and return that value:
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the number here:");
        int n = s.nextInt();
        int ans = minSquaresToRepresentNUsingRecursion(n);
        System.out.println(ans);

    }
    
}
