package milestone1lecture4;

import java.util.Scanner;

public class EvenOddQustions {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);



        int a;
        a = s.nextInt();
        // here we create the process to check the user input is even or false.
        int rem = a % 2; // (%) => Java Modulo operator or modulus operator is used to getting the remainder when we divide an integer with another integer.
        boolean result = rem == 0; // => (==) double equalto sign is for checking the equation is true or false.
        // one way to get the output.
        if(rem == 0){

            System.out.println(a +  "is even");
        }else{
            System.out.println(a +  "is odd");
        }

        // second way of getting the output.
        if(result){
            
            System.out.println(a +  "is even");
        }else{
            System.out.println(a +  "is odd");
        }

        // third way of getting the output.
        // here is my mistake that i am doing to find out the even number . 
        // here i use the (/) division operator to find out the result of even number.
        // but i did not realise that the division operator does not gave us a remainder and this will through error in our program.
        // beacuse we did not able to check that what is our remainder in division operator.
        if(a / 2 == 0){     
            
            System.out.println(a +  "is even");
        }else{
            System.out.println(a +  "is odd");
        }







        // the conditonal statements only do two things like.
        /*
         * 1. firstly they check the condition acc to the code we write.
         * 2. after that they print the output acc to the result of the contition.
         * like:
         * a.> if the value is true it will gave the result that "the value is true"
         * b.> if the value is false it will gave the result that "the value is false"
         */
        
        
    }
    
}
