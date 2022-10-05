package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class MinSquareToRepresentNWithIterativeDP{

    public static int minSquaresToRepresentNUsingIterative(int n){

        int [] dp = new int[n+1];
        dp[0] = 0;

        for(int i = 1; i <=n; i++){
            int minAns = Integer.MAX_VALUE;
            for(int j = 1; j *j <= i; j++){
                int currAns = dp[i-(j*j)];
                if(minAns > currAns){
                    minAns = currAns;
                }
            }
            dp[i] = 1 + minAns;

        }
        return dp[n];
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the number here:");
        int n = s.nextInt();

        int dp[] = new int[n + 1];
        for(int i = 0; i < dp.length;i++){
            dp[i] = -1;
        }
        int ans =  minSquaresToRepresentNUsingIterative(n);
        System.out.println(ans);
    }
     
    
}
