package Milestone1Lecture7;

public class ForLoopVariations {

    public static void main(String[] args) {
        // int n = 5;

        // // here we learn different variations of the for loop:
        

        // // this is the first variation of the for loop
        // // for example:
        
        // for(int i = 1, j = 100; i <= n && j <= 200; i++, j += 20){
        //     System.out.println(i + " " + j);
        // }

        /*
           1.important point = In for loop we can only use the three semi colon for each three function: 
           // like: initialization, function, loop sequnce. thats why we can only use three semicolons for each three function.
         * 2. if In for loop we want to create a multiple variables  we can create them with first variable using(,) coma.
         *   // for example (int i = 1, j = 100)in this way we can create a multiple variables in the forloop.
         * 3. if we want to create a multiple function for the loop. we can use the logical operators:
         * f // for example(i <= n && j <= 200):
         * 4. if we want to create a multiple loop sequnces we can use (,) coma like this:
         *   // for example( i++,  j += 40).
         */

         // this is the second variation of the  for loop:

         // if we want to write the nested for loops . means multiple loop:
         // we can use nested loop or multiple loops in this way:
        
         // for example:
         // in this way we can create a multiple for loops. if we want to execute a multiple varaibles we can use the multiple for loops.

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 4; j++){
                System.out.println("i " + i + " j "+ j);
            }
        }
         
    }
    
}
