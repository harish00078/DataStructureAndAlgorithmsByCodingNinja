package Milestone1Lecture5;

import java.util.Scanner;

public class Characterpattern2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i= 1;
        // in this pattern our all loop varaibles will work on a different function.so that we can print this pattern.
        // we did not use the  one variable for the two functions. that,s why we use both the variables.
        while(i <= n){
            char p = (char)('A' + i -1); // here we convert the values for the row. for printing this pattern.
            // because in every row starting we have a change values.
            int j = 1;
            while(j <= n){
                System.out.print(p);
                p = (char)(p+1); // here we add other values in the pattern.
                // because our starting value will we cmae from the ith loop.
                j++;
            }
            System.out.println();
            i++;
        }
        

    }
    
}
