package Milestone1Lecture7;

import java.util.Scanner;

public class NthFibonacciNumbers {

    public static void main(String[] args) {

        // important question.
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int a = 0; 
        int b = 1;
        int  c;
        for(int i = 0; i < n; i++){
            c= a + b ;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
    
}
