package MileStone1lecture6;

import java.util.Scanner;

public class IsoscelesTriangleNumberPatternProblem2 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int i = 1;
        while(i <= n){
            
            int spaces = 1;
            while(spaces <= n - i){
                System.out.print(" ");
                spaces = spaces + 1;
                
            }
            
            int p = 0;
            // int num = 1;
            while(p < i){
                System.out.print(i+p);
                p = p + 1;
                // num = num + 1;
                
            }
            
            p = i+p-1;
            while (p > i){
                p--;
               
                System.out.print(p);
            
            }
            i++;
            System.out.println();
        }


    }
    
}
