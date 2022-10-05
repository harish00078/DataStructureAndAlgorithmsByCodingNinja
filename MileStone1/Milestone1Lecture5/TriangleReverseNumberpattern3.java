package Milestone1Lecture5;

import java.util.Scanner;

public class TriangleReverseNumberpattern3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int i = 1;
        
 
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(n-j+1);
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
    
}
