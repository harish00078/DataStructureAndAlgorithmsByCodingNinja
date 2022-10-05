package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class MinimumStepsToOneWithIterativeDP {


    
	public static int MinStepsToOneWithIterativeDP(int n) {
        if(n==1)
           return 0;
      
       int[] dp=new int[n+1];
       int a=Integer.MAX_VALUE,b,c;
       dp[0]=0;
       dp[1]=0;
       dp[2]=1;
       for(int i=3;i<=n;i++){
           a=dp[i-1];
           b=Integer.MAX_VALUE;
          if(i%3==0)
           b=dp[i/3];
           c=Integer.MAX_VALUE;
          if(i%2==0)
             c=dp[i/2];
          dp[i]=1+Math.min(a,Math.min(b,c)); 
           
       }
       return dp[n];
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the Number here:");
        int n = s.nextInt();

        int dp[] = new int[n + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }
        int ans = MinStepsToOneWithIterativeDP(n);
        System.out.println(ans);
    }
    
}
