package Milestone1Lecture8;


public class HowFunctionCallingWorks {

    // another example of how stack calling or function system works.

    /*
     * 1. firstly it will have the value from the main function.
     * 2. and then go on the created function.
     * 3. and implement the value of the main method in the created function.
     * 4. after having the solution from the created function it will jump on the main function and print the value.
     * 5. when we jumping on the function the call stack will only focus on the working function . the other function will we paused.
     * 
     */

     // for example:
     public static void b(){
        System.out.println("inside b"); // secondly it will put that value on the created function .for having the output.
     }

     public static void a(){
        b();
        System.out.println("inside a"); // thirdly it will jump on the other created function if we created and get the output.
     }

     public static void main(String[] args){ // 4. then after all these this will  gave all the output to the main function.
        //  and main function provide that all output values to the user.
         a();
         System.out.println("inside main");  // In fucntion sequnce: it will firslty have the input from the main function.
     }







    // // Role of Stack in function calling(call Stack):
    // /*
    //  * A call stack is the storage area that stores information about the active function and paused function.
    //  * // HOW CALL STACK WORK: i write down on the copy and also having a coding ninjas notes.
    //  */

    // // here we created a add two number function for better understanding that how function calling or use works.

    // public static int sum(int a,int b){
    //     int result = a + b;
    //     return result;
    // }

    

    // /// IN calling fucntin we have two functions.
    // // 1. caller function = caller is that function which calls the function in it . that we created.
    // // the caller function is (main) function.
    // // 2. callee fucntion = callee function is that we created for some work or use .it is the function that is call or used by caller function .means (main) function.
    // public static void main(String[] args) {  // in this code (main) function is our caller function

    //     int a = 10;
    //     int b = 5;
    //     int result = sum(a, b);  // In this code (sum) is our callee function.
    //     System.out.println(result);


        


    // }
    
}
