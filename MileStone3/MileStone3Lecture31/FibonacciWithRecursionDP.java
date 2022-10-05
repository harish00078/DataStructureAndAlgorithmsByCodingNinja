package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class FibonacciWithRecursionDP {

    public static int fibb(int n,int dp[]){

        if(n == 0 || n == 1){
            return n;
        }

        // here we should have to two variables acc to this problems logic:
        int ans1,ans2;
        // here we are using the dynamic programming logic that we have created for this problem:
        if(dp[n-1] == -1){ // if array index(n-1)  will  have the value of (-1):

            ans1 = fibb(n-1, dp); // then we simply call recursion on the (n-1)index value from the (n) number of given value:
            dp[n-1] = ans1; // after finding the value for that particular index:
            // we also have to update the value in the array: so we did not able to use that index again:
        }else{// if thats not the case:
            // means if array does not have (-1) value in this (n-1)index:
            // then its means that we already found value for this Index:
            ans1 = dp[n-1]; // then we simply put that value in the array:

        }

        //same as we do with the (n-1):
        if(dp[n - 2] == -1){ //if array index[n-2] check have value of (-1):
            ans2 = fibb(n-2, dp); // then we simply call recursion on the (n-2)index value from the (n) number of given values:
            // after finding the value for(n-2): we also have to update the value in the array index[n-2]:
            // so we did not able to use that index again:
            dp[n-2] = ans2;

        }else{// if that not the case:
            // it means that we already found the value for the (n-2) index:

            // then we had to update that  particular value in the array also:
            ans2 = dp[n -2];


        }

        int myAns = ans1 + ans2;

        return myAns;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // here we create array or use array for performing the dynamic programming on this problem: 
        int [] dp = new int [n + 1];  // here our array will we the size of (n + 1 ): because we are counting the  given values index values from 0 to (n-1) values form (n) size array:
        // but if we want to use the (nth) value also then we have to create the (n + 1) size of array:
        // thats why the length of the array will we (n + 1):
        
        // also the by-default the values of this array is (-1):
        // acc to logic of this problem: because we are using dynamic programming here:
        // 1: beacuse when if our any  array index will have value of (-1):
        // it means then we have to found the values for that paticular array  index using recursion:

        // 2: if it is not the case: means if instead of(-1) in array index: if we have any other value: 
        // then we did not have to  do anything for that particular array index:
        // then we can simply jump on the next index for finding  its value using recursion:
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;// by default this array will we (-1):
        }
        int ans = fibb(n,dp);
        System.out.println(ans);

    }
    
}
