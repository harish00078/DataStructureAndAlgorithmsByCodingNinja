package Milestone1Lecture7;

import java.util.Scanner;

public class AssignmentQuestion3ReverseTheNumber {

    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rn = 0; 
        while(n > 0) 
        { 
            rn = rn * 10 + n% 10; 
            n = n/ 10; 
        } 
        System.out.print(rn);
	}
    
    
}
