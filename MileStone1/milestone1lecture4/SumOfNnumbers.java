package milestone1lecture4;

import java.util.Scanner;

public class SumOfNnumbers {

    public static void main(String[] args) {
        
        int n;

        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        // we use this addition sequence to perform this program like:
        /*
         * 1. we can add the sum of the two nautral number in our natural number sequence.
         * 2. in this way we have the sum of the natural numbers and also cover all the natural numbers.
         */
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum = sum + i;  // this sequence work on the ouput of the program.
            i = i+1;   // this sequence is work on the user input.
        }
        System.out.println(sum);
    }
    
}
