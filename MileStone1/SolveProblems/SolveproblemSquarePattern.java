package SolveProblems;

import java.util.Scanner;

public class SolveproblemSquarePattern {
    
    public static void main(String[] args) {

        // if we to print the same number pattern.
        

        Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int i = 1;  
        while(i <= n){  
            int j = 1; 
            while(j <= n){ 
                System.out.print(n); 
                j++;


            
            }
            System.out.println(); 
            i++;  

        }
    }
    
}
