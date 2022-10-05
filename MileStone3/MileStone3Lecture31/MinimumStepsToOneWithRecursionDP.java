package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class MinimumStepsToOneWithRecursionDP {

    public static int minStepToOneWithRecursionDP(int n, int dp[]){

        // here we are solving this problem using recusrion with DP:
        // because when we are simply solve this problem using recursion it has the (overlapping sub problem):

        // here we firslty have base case:
        if(n == 1){ // if (n) check one:
            return 0; // then we can return zero:
        }

        int ans1;
        if(dp[n-1] == -1){

           ans1 =  minStepToOneWithRecursionDP(n - 1,dp); 
           dp[n-1] = ans1;
        }else{
            ans1 = dp[n-1];
        }
        // here we are doing the second step:
        int ans2 = Integer.MAX_VALUE;// here second step also had its base value:
        //  if there is no value  present for the step(2): then it had a default value of (infinite):
        if((n%2) == 0){ // here we are doing that if (n) had its value :then we are doing that:if n will divided by 2 and gets a reaminder of zero:
            if(dp[n/2] == -1){
                
                ans2 = minStepToOneWithRecursionDP(n/2,dp); 
                dp[n/2] = ans2;
            }else{
                ans2 = dp[n/2];
            }
        }
        int ans3 = Integer.MAX_VALUE; // same as a step(2):// step three also had its base case:
        //  if there is no value  present for the step(3): then it had a default value of (infinite):
        if((n%3) == 0){ // here we are doing that if (n) had its value :then we are doing that:if n will divided by 3 and gets a reaminder of zero:
            if(dp[n/3] == -1){
                ans3 = minStepToOneWithRecursionDP(n/3,dp); 
                dp[n/3] = ans3;
            }else{
                ans3 = dp[n/3];
            }
        }

        // after doing all that: we have to find the min value from all the steps: 
        // and simply add that value with one: because  we also had to count the top most value in the result:
        // thats why we are adding (1) in result:
        int myAns = Math.min(ans1,Math.min(ans2, ans3)) + 1;
        return myAns;// and return that value: because those are our minimun step from (n) to one:
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the Number here:");
        int n = s.nextInt();

        int dp[] = new int[n + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }
        int ans = minStepToOneWithRecursionDP(n,dp);
        System.out.println(ans);
    }
    
}
