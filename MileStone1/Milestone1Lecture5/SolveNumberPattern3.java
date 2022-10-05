package Milestone1Lecture5;

import java.util.Scanner;

public class SolveNumberPattern3 {

    public static void main(String[] args) {

        // * 3.>  4 3 2 1  //  we can also say that this pattern is the reverse pattern  of the 2nd pattern.
        // *      4 3 2 1
        // *      4 3 2 1
        // *      4 3 2 1

        
        // IMPORTANT => this pattern uses the formula is (n-j+1). this pattern is also the reverse of the 2nd pattern.(-j)
      
        Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int i = 1;  // (i) represent here the rows. i = 1 tells that we are  in the first row.
        while(i <= n){  // // this is the loop squance of the row.
            int j = 1; // (j) represent here the columns . j = 1 tells that we are in the first columns.
            while(j <= n){ // this is the sequnce of the columns
                System.out.print(n-j+1); // we printing  this pattern.we use (n-j+1) here to print this pattern beacuse the (j) loop does no exit until the it matches the (n) number.
                j++; // here it increment the value bby one for completing the loop sequnce .


            
            }
            System.out.println(); //after completing the  4 3 2 1   sequnce then it jump on the  4 3 2 1   sequnce or soon.
            i++;  // here it increment the (i).

        }
        

    }
    
}
