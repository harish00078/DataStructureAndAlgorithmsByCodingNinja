package milestone1lecture4;

import java.util.Scanner;

public class BasicsOfConditionals {
    public static void main(String[] args) {

        
        Scanner s = new Scanner(System.in);

        int a, b;
     
        a = s.nextInt();
        b = s.nextInt();

        
        if(a > b){    // in java we use brackets () to write our conditions for code. 
            System.out.println("first number is greator");
        }else{   // basically this is not the right way to check that the (b>a).we learn this concept in the nested if code file.
            System.out.println("first number is not greator than second number");
        }


        // important => the important thing about the conditional statement is that they follow the sequence.
        /*
         * 1. like they did not direclty jump one the statements.
         * for example:
         * if.
         * else if.
         * else.
         * these are the two statements.we did not jump directly from if to else. between when we have else if.
         * 2. they work in sequence pattern.
         * 
         * 3. the most important thing is that:
         * when conditons are follow the sequence .they also follow there values.
         * like if we change the value in between the conditional statement. they will also follow that value not only the squence.
         * if the value is change between the statement squence then we have to think in the pattern of that value not the value that are given why us or user.
         * 
         */

        //  for example:

        // this program will gave us a no output.
        // beacuse this program change the value between the conditonal statement sequence:

        // int a=50,b=20;
        // if(a>b)
        // {
        //     if(a>100)
        //     System.out.println("ace");
        //     if(b<100)
        //     b=50;     // here it change the value in between the statment sequence.
        // }else if(a==b)
        // {
        //     System.out.println("king");
        // }
        // else{
        //     System.out.println("queen");
        // }

    }
    


  

       
        
}
    

