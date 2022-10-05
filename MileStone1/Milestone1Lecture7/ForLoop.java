package Milestone1Lecture7;

public class ForLoop {

    public static void main(String[] args) {

        // => important things that we need for the loops.
        /*
         *  1.> firslyy we have to check the initialization for the loop.
         *  2.> seconldy we have to check the condition that we given to the loop.
         *  3.> third is the loop sequnce step for completing the loop.
         */
        
        // firstly we have to check while loop.

        // int n = 5;
        // int i = 1;  // firstly we have to check the initialization.
        // while(1 <= n){ // secondly we have to check the condition that we given to the loop.
            // System.out.println(i);
            // i++; // third is that the loop sequnce step for completing our loop.
        // }

        // how do we approach for loop.

        // first way of writing for loop.this is the best way of writing for loop.
        
        // int n = 5;


        // for(int i = 1; i <= n; i++){  // for loop also have a same approach as while loop.
        //     // only the differnce is that syntax formation.
        //     // like in while loop we write all the things in the different lines. (things = initialization, condition, loop sequnce)
        //     // but in for loop we write all things in the one line.(things = initialization, condition, loop sequnce)
        //     System.out.println(i);
        // }
        // other way we can write the loop.
        // wr can also use for loop in this way.

        int n = 5;
        int i = 1; // In other way of writing for loop we can print the (i) variables value outside the condition brackets.( ) 
        for(; i <= n;){ // (important point) if we are doing this we have to put a semicolon on the space of the int (i) variables value.
            System.out.println(i);
            i++;
        }
        

           
        
    }
    
}
