package Milestone1Lecture5;
import java.util.Scanner;

public class CharacterPatternProblem2 {

    //problem:
    /*
     *  A
     *  B C
     *  C D E
     *  D E F G
     */

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int i = 1;
        while(i <= n ){
            char p = (char)('A' + i -1);// here crated the first value for the row. or created the changing values acc to the pattern that we want to print.
            int j = 1;
            while(j <= i){  // for printing this patter we were one change the n value to the ith value.
                System.out.print(p);
                p = (char)(p + 1); // here it added the other values or characters in the after first charcater.
                // that we will have from the ith loop.
                j++;
            }
            System.out.println();
            i++;
            
        }
    }
    
}
