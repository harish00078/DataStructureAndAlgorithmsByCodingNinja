package Milestone1Lecture8;


public class WritingMoreFunctions {

       //we create a new function for findind the even numbers between start to end numbers.

    public static void FindEvenNumber(int start, int end){ // firstly we have  to check that the start number is even or odd.

        if(start %2 != 0){ // if the number is starting from the odd . we had to convet that number in the even number.

            start++; // for exmple if number is (3) it will become here (4).
        
        }
        for(int i = start; i <= end; i +=2){
            System.out.println(i);
        }

        
    }

    public static void main(String[] args) {

        FindEvenNumber(3, 15);

 
        
    
        
    }

    //    //we create a new function for finding between 1 to 100 even numbers.

    // public static void printEvenNumber(){ // (void) is use when we do not want to gave any input to the function and do not want any output from the function.
    //     for(int i = 2; i <= 100; i += 2){
    //         System.out.println(i);
    //     }

        
    // }
    
    
    // public static void main(String[] args) {



    //     printEvenNumber(); // here it directly gave us a output.we only had to call the Function<T,R>.class


    //     // printEvenNumber(10.20); /// we can also did not gave him a value becasue we did not gave any input variables.

    //     // int a = printEvenNumber(); // we can also did not store the output the void fucntion that why it gave us a error here.
    //     // because in fucntion we use the void method to create the output.




        
    
        
    // }
  



    
    // //we create a new function for adding three numbers with different data types.

    // public static double SUM(int a, int b, double c){  /// we can use different data input types in the function.
    //     //but we have to carefull with this when we use different datatypes.
    //     // because  in this way our output datatypes will we affected.
    //     // when we use different datatype we should also focus on our output datatype.

    //     // but we have to focus on the function sequnce system like.
    //     // if we add int + double we do not use the int method as our output storage.
    //     // beacuse this will through our error.that why we have to focus on datatypes and operators while use the different datatypes and different things in fucntion.
    //     // more basically focus on there working with each other.
    //     double ans = a + b + c;

    //     return ans; //we  can also write here return a + b;
    // }

    // public static void main(String[] args) {

    //     int num1 = 10;
    //     int num2 = 16;


    //     // we can also direclty use the function: without saving the output in any variable. like::

    //     SUM(num1, num2, 10.5); // this is correct in syntax way . but did not correct in logic way.
    //     // because here we only direclty call the fucntion and gave arguments and have a output.
    //     // but we did not store our output.that why we did we did not use this output anywhere in the code beacuse it is not stored in the code.

    //     // double ans = SUM(num1,num2,10.5); // like here we use the double because we use double in our function.
    //     // when we call our function for usage we have to carefull with its varible datatypes.
    //     // the types we use in the function .that should we same in the function calling or using Time.
    //     // otherwise it will through us a error.
    //     // System.out.println(ans);
        
    
        
    // }

    
    // //we create a new function for adding two numbers

    // public static int SUM(int a, int b){
    //     int ans = a + b;

    //     return ans; //we  can also write here return a + b;
    // }

    // public static void main(String[] args) {

    //     int num1 = 10;
    //     int num2 = 16;

    //     int ans = SUM(num1,num2);
    //     System.out.println(ans);
        
    
        
    // }

   


    
}
