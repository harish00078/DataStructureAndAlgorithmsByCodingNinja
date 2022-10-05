package MileStone1lecture6;
import java.util.Scanner;

public class InvertedTriangleNumberPatternProblem {

    public static void main(String[] args) {

        /* this is the pattern that we have to print.
         *    4 4 4 4
         *    3 3 3
         *    2 2 
         *    1
         */
        // for printing this pattern we have to use the one function for two times.
        // 1. one is for printing the structure of the pattern.
        // 2. second for printing the number sequnce of the pattern.

        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int i =1;
        while(i <= n){
            
            int j = 1;
            while(j <= n - i + 1 ){ // here it printing the structure of the pattern
                // int num = n - i +1;
                System.out.print(n - i + 1); // here it printing the number sequnce for the pattern.
                // n--;
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
    
}
