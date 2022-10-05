package Milestone1Lecture7;

import java.util.Scanner;

public class AssignmentQuestionTermsOfAp {

    public static void main(String[] args) {
        
                
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();

        
        
        int count = 1;
        int current = 1;
        
          
        while(count <= n){
            int term = 3* current + 2;
            if(term  % 4 != 0){
                System.out.print(term + " ");
                count++;
            }
            current++;
        }
   
        
    
        
    
        
        
       
    }
    
}
