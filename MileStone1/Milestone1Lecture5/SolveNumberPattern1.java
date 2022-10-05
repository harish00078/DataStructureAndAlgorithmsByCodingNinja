package Milestone1Lecture5;

import java.util.Scanner;

public class SolveNumberPattern1 {

    public static void main(String[] args) {

        // IMPORTANT => this pattern uses the row sequnce value to print this pattern.
      
        // * 1.>   1 1 1 1 // this is the first pattern.
        // *       2 2 2 2 
        // *       3 3 3 3
        // *       4 4 4 4 
        Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int i = 1;  // (i) represent here the rows. i = 1 tells that we are  in the first row.
        while(i <= n){  // // this is the loop squance of the row.
            int j = 1; // (j) represent here the columns . j = 1 tells that we are in the first columns.
            while(j <= n){ // this is the sequnce of the columns
                System.out.print(i); // we printing  this pattern.we use (i) here to print this pattern beacuse the (j) loop does no exit unti the it matches the (n) number.
                j++; // in this program how (j) program did not add any thing until the one squence is not fully completed.


            
            }
            System.out.println(); //after completing the  1 1 1 1 sequnce then it jump on the  2 2 2 2  sequnce or soon.
            i++;  // here it increment the (i).

        }


    }
    
}
