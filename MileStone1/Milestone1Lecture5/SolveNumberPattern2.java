package Milestone1Lecture5;

import java.util.Scanner;

public class SolveNumberPattern2 {

    public static void main(String[] args) {
        
        // * 2.>   1 2 3 4 
        //  *      1 2 3 4
        //  *      1 2 3 4
        //  *      1 2 3 4

        // IMPORTANT => this pattern uses the column sequnce value to print this pattern.
      
        Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int i = 1;  // (i) represent here the rows. i = 1 tells that we are  in the first row.
        while(i <= n){  // // this is the loop squance of the row.
            int j = 1; // (j) represent here the columns . j = 1 tells that we are in the first columns.
            while(j <= n){ // this is the sequnce of the columns
                System.out.print(j); // we printing  this pattern.we use (j) here to print this pattern beacuse the (j) loop does no exit unti the it matches the (n) number.
                j++; // here it increment the value bby one for completing the loop sequnce .


            
            }
            System.out.println(); //after completing the  1 2 3 4  sequnce then it jump on the  1 2 3 4  sequnce or soon.
            i++;  // here it increment the (i).

        }


    }
    

}
    

