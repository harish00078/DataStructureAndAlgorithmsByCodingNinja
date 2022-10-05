package Milestone1Lecture7;



public class ContinueKeyword {

    public static void main(String[] args) {

        // continue KEyword:structures. Inside the loop, when a continue statement is encountered the control directly jumps to the beginning of the loop for the next iteration instead of executing the statements of the current iteration.
        //  The continue statement is used when we want to skip a particular condition and continue the rest execution. 
        // Java continue statement is used for all type of loops but it is generally used in for, while, and do-while loops.
        

        // simple while loop:

        // int i = 1;
        // int n = 5;
        // while(i <= n){
        //     i++;
        //     System.out.println(i);
        // }

        // while loop with continue statement:

        // int i = 1;
        // int n = 5;
        // while(i <= n){
        //     i++;
        //     if(i == 4){
        //         continue; // continue statement will only cut the value that we gave him in statement. the other loop will continue in same pattern.
        //         // basically continue will skip the value that we gave him in continue statement. and all the other values of the loop will we printed.
        //     }
        //     // i++; //  if we write (i++) here then our loop will we work as inifinteloop.
        //     System.out.println(i);
        // }

        /// continue statement for the FOR LOOP:

        int n = 5;

        for(int i = 1; i <= n; i++){// differnce between the while loop and for loop in the continue statement is that.
            // in for loop we always have(i++) loop sequnce because acc to the for loop format we did not change its position but in while loop we will change its postion.  
            // that why some it is risky to use continue statement the while loop.
            if(i == 4){
                continue;
            }
            // i++; // the same thing in for loop and while loop is that with in the continue statement we did not write the (i++) loop sequnce outside the continue statement beacuse it will gave us a infinite loop. 
            System.out.println(i);
        }



    }
    

}
