package milestone1lecture4;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // loops => are used for if we want to print something again and again.

        // While loops = while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
        //  The while loop can be thought of as a repeating if statement.
        //  While loop in Java comes into use when we need to repeatedly execute a block of statements. 
        // The while loop is considered as a repeating if statement. 
        // If the number of iterations is not fixed, it is recommended to use the while loop.
        

        // The basic mean of while. to do a work for sometime. or to do a work for given time or limited time.
        /*
         * 1. firstly we had to create a while loop for a statement that we want to print.
         * 2. then we had to create the condition. for the while loop.
         * 3. after that we gave the criteria to the condition.
        //  */

        // int i = 1;
        // while(i <= 5){   // here is the  condition criteria to our while loop.
        //     System.out.println("hello i am harish");
        //     i = i + 1;  // will work with condition that we gave the while loop.
        // }

        // if we want the input from the user for the while loop.

            Scanner s = new Scanner(System.in);

            int n;
    
            n = s.nextInt();
      
              
      
            int x = 1;
            while(x <= n){   // here is the  condition criteria to our while loop.
              System.out.println("hello i am harish");
              x = x + 1;  // will work with condition that we gave the while loop.
            }

            // how to print the N natural numbers using the while loop.
            
            int i = 0; // here we gave the criteria for the natural number
            while(i <= n){   // here the while compare the given criteria with the user input. that the input is less or greater then.
                // if the value is true then the loop will contine its work.
                // // if the value is not true then it will terminate the loop and end the program.
                System.out.println(i);  // here after comparing the values it will print them here.
                i = i+1; // here he add more value in the our output. to produce other values of output related our program statement.
            }

        
        
    }
    
}
