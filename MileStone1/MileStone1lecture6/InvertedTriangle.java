package MileStone1lecture6;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {

        /*   this is the pattern that we want to print.
         *      * * * * 
         *      * * * 
         *      * * 
         *      *
         */

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n-i+1){ // here we created the method that is used for printing this pattern.
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }

    }
    
}
