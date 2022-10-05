package milestone1lecture4;

import java.util.Scanner;

public class ConditionalsAndOperators {

    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        int a, b;
        a = S.nextInt();
        b = S.nextInt();

        // if(a == b){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }

        // // if you want check in the reverse action.we can use (!=)
        // if(a != b){
        //     System.out.println("not equal");
        // }else{
        //     System.out.println("equal");
        // }


        //we are checking that both the numbers are negative or positive.
        // here we use the AND relational operator.
        if(a > 0 && b > 0){
            System.out.println("both the numerbs are postive");
        }else{
            System.out.println("boht the numbers are not positive");
        }

        // // here we use the OR relational operator.
        // if(a > 0 || b > 0){
        //     System.out.println("one is postive");
        // }else{
        //     System.out.println("one is negative");
        // }

       

    }
    
}
