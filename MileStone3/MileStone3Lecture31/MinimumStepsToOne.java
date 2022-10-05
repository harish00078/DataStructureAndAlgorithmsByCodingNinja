package MileStone3.MileStone3Lecture31;

import java.util.Scanner;

public class MinimumStepsToOne {

    public static int minStepToOne(int n){

        // here we are solving this problem using recursion: 

        // here we firslty have base case:
        if(n == 1){ // if (n) check one:
            return 0; // then we can return zero:
        }

        int ans1 = minStepToOne(n - 1); //  here we are doing the first step:
        // here we are doing the second step:
        int ans2 = Integer.MAX_VALUE;// here second step also had its base value:
        //  if there is no value  present for the step(2): then it had a default value of (infinite):
        if((n%2) == 0){  // here we are doing that if (n) had its value: then we doing that: if  n will divided by 2 and gets a remainder as zero:
            ans2 = minStepToOne(n/2); // then we have to explore further value of (n);
        }
        int ans3 = Integer.MAX_VALUE; // same as a step(2):// step three also had its base case:
        //  if there is no value  present for the step(3): then it had a default value of (infinite):
        if((n%3) == 0){ // here we are doing that if (n) had its value :then we are doing that:if n will divided by 3 and gets a reaminder of zero:
            ans3 = minStepToOne(n/3); // then we have to explore further value of (n):
        }

        // after doing all that: we have to find the min value from all the steps: 
        // and simply add that value with one: because  we also had to count the top most value in the result:
        // thats why we are adding (1) in result:
        int myAns = Math.min(ans1,Math.min(ans2, ans3)) + 1;
        return myAns;// and return that value: because those are our minimun step from (n) to one:
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your number here: ");
        int n = s.nextInt();
        System.out.println(minStepToOne(n));

    }
}
