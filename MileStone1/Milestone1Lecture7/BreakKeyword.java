package Milestone1Lecture7;


public class BreakKeyword {

    public static void main(String[] args) {

        // breakkeyword:Break keyword is often used inside loops control structures and switch statements. 
        // It is used to terminate loops and switch statements in java. When the break keyword is encountered within a loop, the loop is immediately terminated and the program control goes to the next statement following the loop. 
        // When the break keyword is used in a nested loop, only the inner loop will get terminated. 
        // Even it is used with if statement to terminated when a certain condition is met.

       // The break keyword has special usage inside the switch statement. 
       // Every case in the switch statement is followed by a break keyword, such that whenever the program control jumps to the next case, it wouldn’t execute subsequent cases. 


       // simple  while loop:

    //    int n = 5;
    //    int i = 1;
    //    while(i <= n){
    //        System.out.println(i);
    //        i++;
    //    }
    //    System.out.println("outside while loop");
    
       // while loop with breakkeyword.

       // break keyword :- only break the current loop sequnce not the hole loop sequnce like return keyword.

       
    //    int n = 5;
    //    int i = 1;
    //    while(i <= n){
    //        if(i == 4){
    //            break;// breakkeyword is used for if we want to break the cuurent sequne of loop or switch statement we can use the break keyword.
    //         //    System.out.println(i); we did not use the output statement inside the break statement.
    //        }
    //        System.out.println(i); // when ever we use the break keyword. we write our output statement outside the break statement.
    //        i++;
           
    //    }
    //    System.out.println("outside while loop");

       // for loop with break keyword:

    //    int n = 5;

    //    for(int j = 1; j <= n; j++){
    //        if(j == 4 ){
    //            break;
    //        }
    //        System.out.println(j);

    //    }
    //    System.out.println("outside the loop ");

    // Nested for loop with break keyword:
    // when we have a loop under the loop that is called a nested loop.

    int n = 5;

    for(int i = 1; i <= n; i++){ /// here we created two loops.
        for(int j = 1; j <= n; j++){
            if(i + 1 == j ){

                return; // check what return keyword do inseated of using the break keyword.


                // break;// in nested loop the break keword will only break the jth loop .
                     // not the ith loop. beacuse the keyword only break the current loop sequnce.
                     // not the all loop sequnces

            }
            System.out.print(j + " ");


        }
        System.out.println();
    }
    System.out.println("outisde the loop");


        

    }
    
}
