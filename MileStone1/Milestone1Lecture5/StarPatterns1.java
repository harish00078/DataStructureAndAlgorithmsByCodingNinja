package Milestone1Lecture5;

import java.util.Scanner;

public class StarPatterns1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n;
        
        n = s.nextInt();

        int i = 1; // (i) represent here the rows. like we have to start making the pattern from the row. because we working from left to right.

        while(i <= n){ // here we firstly check about the rows. acc to the (n)numbers. that how many rows we have to print.

            int j = 1;   // after checking the row we have to gave the starting variable to the column. that where did you start from.
            while(j <= n){  // here we check the columns.acc to the (n) number. that how many patterns of row we have to print.
                System.out.print('*'); // here it print the pattern .that we want to print.
                // after the cheking the both rows and columns.
                j = j + 1; // here it do the column sequence.

            }
            System.out.println();
            i = i + 1;// here it do the row squence.
        }

        


    }
    
}
