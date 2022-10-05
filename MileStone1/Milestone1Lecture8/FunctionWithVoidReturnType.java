package Milestone1Lecture8;



public class FunctionWithVoidReturnType {

     // create division function using void method.
     // beacuse in void method we can use the return method. but it will not gave us any value.
    public static void PrintDivisionResult(int num, int deno){
        if(deno == 0){
            System.out.println("division by zero is not allowed"); // we can also write the this types of massege with return method when we use the void method.
            // this statement will gave better understanding to the user. why he did not have any value in it output.
            return;// use exit the function.
            // but in void method we did not gave any value to the return method.

            // that why we use print statement in void method.
            // we can also use the print statement in any datatype.
        }

        System.out.println(num / deno);
    }
    
        public static void main(String[] args) {
    
            int num = 8;
            int deno = 0;

            PrintDivisionResult(num, deno);

            // we did not use the other variables to store the value here beacuse we use the void method here:
            // also did not  use the statements and other to print because we use the void method in the function.
            // void method will only gave us a output.did not store tha output value in any were.
            // for example:

            // we did not use these things in the void method.

            // int result = PrintDivisionResult(num, deno);
            // if(result > 0){


            // }else{


            // }
    
            
    
    
        }
    //     // we can simpliy divide the numenator with denomenator;
    //     if(deno == 0){
    //         return  Integer.MIN_VALUE; // here it will do that if the denominator is 0. then it will return or exit the code.
    //         // integer.MIN_VALUE also show us a value.that beacause of this denominator value exit the function.
    //     }
    //     System.out.println("inside division function");
    //     return num/ deno;

    // }

    // public static void main(String[] args) {

    //     int num = 8;
    //     int deno = 4;

    //     int result = DivideNumbers(num, deno);

    //     System.out.println(result);
        


    // }
    
}
