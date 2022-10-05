package Milestone1Lecture5;

import java.util.Scanner;

public class TriangleNumberpatternproblem {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
 
        int n;

        n = s.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){   // here we compare j with i for completing our star triangle pattern
                // always focus on the loop working pattern.
                 
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
