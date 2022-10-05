package MileStone1lecture6;

import java.util.Scanner;



public class IsoscelesTriangle {

    public static void main(String[] args) {
        
        // here we print the isoceles triangle. or this is the shape of the isosceles triangle

        /*
         *    _ _ _ 1
         *    _ _ 2 1
         *    _ 3 2 1 2 1
         *    4 3 2 1 3 2 1   
         */

         // for printing this pattern we to create a three loops or three functions.
         /*
          * 1.> create a loop for the spaces sequnce 
            2.> create a loop for the number sequnce
            3.> create a loop for the reverse number sequnce.
          */

        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();

        int i = 1;
        while(i <= n){

            int spaces = 1; //this is the loop  for the spaces sequnce.
            while(spaces <= n - i){
                System.out.print(' ');
                spaces = spaces + 1;
            }

            int num = 1; // this loop is for the number sequnce.
            while(num <= i){
                System.out.print(num);
                num = num + 1;

            }

            int decnum = i - 1; // this loop is used for the reverse number sequnce
            while(decnum >= 1){
                System.out.print(decnum);
                decnum = decnum - 1; // always remember that when ever we reverse our number sequnce we use the decrement operator to decrement the number value by one.

            }
            
            System.out.println();
            i++;

        }
       
    }
    
}
