package milestone1lecture4;

import java.util.Scanner;

public class ReturnKeyword {

    public static void main(String[] args) {

        // here we use the Return keyword.very important keyword.
        // return keyword => In Java, return is a reserved keyword.
        //  i.e, we can’t use it as an identifier. 
        // It is used to exit from a method, with or without a value. 
        // Usage of return keyword as there exist two ways as listed below as follows: 

        // Case 1: Methods returning a value
        // Case 2: Methods not returning a value

        // for example we use (check prime number program) to see how the return keyword works.
        /*
         * 1. like if i want to check that particular number that this number is prime or not.
         * 2. then we can use the return keyword.
         * 3. we use return keyword because we did not want that our loop will go from 1 to n(user input) number to check that the number is prime or not.
         * 4. that why we use return keyword.
         * 5. this will also work better in term of the space and time complexity. 
         * 6. beacuse it will directly check that the number is prime or not and end the code. 
         */

        Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int div = 2;
        while(div <= n/2){  // we can also use here (n-1) if the value of the (n) is small. 
            // meaning of (n/2) here is that it will do it two time faster as compare to (n-1).
            if(n % div == 0){
                System.out.println("composite");
                return; // we use return here beacuse we directly want to check that the number is prime or not
                // return will direclty check that number is prime then print prime.
                // if it is not then print composite.
                // it will check the number from the start to end.
                // this method is basically use for the bigger values like = 1000
            }
            div = div + 1;

        }
        System.out.println("prime"); // if the (if statement gets wrong then the return method directly print that the number is prime.)


        

    }
    
}
