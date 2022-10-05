package MileStone1lecture6;

import java.util.Scanner;

public class MirrorImagestarPattern {

    public static void main(String[] args) {

        // int this way we can print the mirror image of the star pattern.
        /*
        n = 4:
         *          *
         *        * *
         *      * * *
         *    * * * *
         */
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;
        
        while(i <= n){

            int spaces = 1; // here we create another variable for the printing spaces in the pattern
            while(spaces <= n - i ){  // here we create the sequnce or method for the spaces.
                System.out.print(' ');
                spaces = spaces + 1;
            }

            int stars = 1; // here we create a another variables for the printing stars in the pattern.
            while(stars <= i){ // here we create the sequnce for the printing stars in the pattern.
                System.out.print('*');
                stars = stars + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
    
}
