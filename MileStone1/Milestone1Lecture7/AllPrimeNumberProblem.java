package Milestone1Lecture7;

import java.util.Scanner;

public class AllPrimeNumberProblem {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for( int i  = 2; i<= n; i++){
            boolean check = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    check = false;
                    break;
                }
            }
            if(check == true){
                System.out.println(i + " ");
            }
        }

  
        
    }
    
}
