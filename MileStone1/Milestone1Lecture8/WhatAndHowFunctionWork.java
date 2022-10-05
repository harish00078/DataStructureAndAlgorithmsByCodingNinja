package Milestone1Lecture8;

import java.util.Scanner;

public class WhatAndHowFunctionWork {

       // function = IN simple words function is a collection of statement design or code lines to perform a specific task.
        
        // for example if we want to create a function for factorail.

    public static int factorail(int num) {   // firstly we have to create a function:

        int fact = 1;

        for(int i = 1;  i <= num; i++){
            fact = fact * i ;
          
        
        }
        return fact;
    
    }
    // when we create the main method. we should create it after the function method is ended.
    // we did not create the main method under the function method.  


    // here In main method we use our function that we create to find out the factorial value.

    // for example:  if i want to calculate the ncr value .
    // for calculating ncr we have to calculate the factorials acc to the ncr formula.
    // that why here we use our created fucntion factorail.
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
         

        // here we use our factorial function to calulate the ncr value:
        int factN = factorail(n); // here factorail represent our function.
        int factR = factorail(r);
        int factNR = factorail(n-r);

        int result = factN / (factR * factNR); // here we created a ncr formula to calculate our ncr value;
        System.out.println(result);



        
    }
    
}
