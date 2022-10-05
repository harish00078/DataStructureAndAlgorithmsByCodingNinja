package Milestone1Lecture8;

import java.util.Scanner;

public class CalculateNCR {

    public static void main(String[] args) {
       
        
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();  // n variable is used for n! value

    int r = scn.nextInt(); // r variable is used for r! value.

    // 1.firslty we have to found n!:  acc to the ncr formula

    int facN = 1; // firsly we have to create a variable for the n!. that represent that from were the factorial starts. 
   
    for(int i = 1; i <= n; i++){  // here we creatad a loop for n!.to do the multiple sequnce.
        facN = facN *i; // here it do the multiple sequnce for the n! value.like: facN varaible will we one and i varaible will multiply all the values with in it until.
        // the i is less than or equal to the user n! value. 
        // in this way we found out the n!
    }

    // 2.secondly we have to found out r!: acc to the ncr formula

    // it will we same as the n! only the value changes.

    int facR = 1;
    for(int i = 1; i <= r; i++){
        facR = facR * i;  // here we have the r! value.
    }

    // 3. thirdly we have to find out the (n-r)! values. acc to the ncr formula.

    // / it will we same as the n! only the value changes.

    int facNR = 1;
    for(int i = 1; i <= n - r; i++){ // In this loop we will calculate n-r value.
        facNR = facNR * i; // here we have the factorial (n-r)! value.

    }

    // 4. we have to create a variable were we store value value or create formula of ncr.

    int result = facN / (facR * facNR); /// here we use bracket beacuse of the operator sequnce. beacuse firstly it will solvw the bracket and then solve the division.
    // that why is sequnce will gave us a correct output.

    // 5. after all these we print our value;

    System.out.println(result);




    
    }


    
}
