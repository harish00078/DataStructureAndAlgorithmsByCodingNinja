package MileStone1lecture6;

import java.util.Scanner;

public class ParallelogramPatternassignmnetProblem {

    public static void main(String[] args) {
        
                
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            for(int a = 0; a < i; a++)
            {
                System.out.print(" ");
                
            }
            for(int j=0; j < n; j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

    }
    
}
