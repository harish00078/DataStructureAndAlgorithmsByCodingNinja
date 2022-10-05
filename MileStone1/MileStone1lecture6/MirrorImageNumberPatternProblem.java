package MileStone1lecture6;
import java.util.Scanner;

public class MirrorImageNumberPatternProblem {

    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;
        
        while(i <= n){

            int spaces = 1; // here we create another variable for the printing spaces in the pattern
            while(spaces <= n - i ){  // here we create the sequnce or method for the spaces.
                System.out.print(' ');
                spaces = spaces + 1;
            }

            int num = 1; // here we create a another variables for the printing stars in the pattern.
            while(num <= i){ // here we create the sequnce for the printing stars in the pattern.
                System.out.print(num);// for this problem we use the  num variable to print this pattern.
                // beacuse every time the loop come from the top to down the num will we started form value = 1.
                // this why it print the problem pattern.
                num = num + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
    
}
