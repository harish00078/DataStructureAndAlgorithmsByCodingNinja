package milestone1lecture4;

public class ScopeOfVariables {

    public static void main(String[] args) {
        
        // scope of variables = Scope of a variable is the part of the program where the variable is accessible.
        //  Like C/C++, in Java, all identifiers are statically scoped, 
        // i.e.scope of a variable can determined at compile time and independent of function call stack. 
        // Java programs are organized in the form of classes. Every class is part of some package. 
        
        // Java scope rules can be covered under following categories:
        /*
         * 1. Member Variables (Class Level Scope) => These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class.
         * 2. Local Variables (Method Level Scope) => Variables declared inside a method have method level scope and can’t be accessed outside the method.
         * 3. Loop Variables (Block Scope) => A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.
         */

         int a = 10;


         // int a = 100; we did not create a local variable twice. this will through us a  error.

         // double a = 100; we can also did not use local variable twice with other data types.
         
         // a = 100; but we can gave him a other value.like this. because here we did not create a variable.we were only gave him a new value.
         


         // => how the scope of variable system work for the (if statements)
         a = 100;
         int b = 10; // if we use the (b) we can use it any were. because now this is lies under the class. now we can access it any were in the class.

         if(a >= 100){
            //  int b = 10; // we did not  print out the output of the local variable (b) beacuse it lies under the method level scope.
             // because when the method will end the variable will automatically terminated. and he did not reach the ouptut function of the (b) varaiable.
             System.out.println(b); // here we can print the (b). because here the (b). will lies under the method.
         }else{
             int c = 20;
             System.out.println(c);
         }

        //  System.out.println(b);   here we have the error related to the (b) variable because we did not have the output of the variable. were lie in between method level scope. 
         System.out.println(a);

         // how the scope of variables work for the (loop system).

         int i = 1;
         int j = 10; // if the value of the (j) are in the class level variable scope .then the (j++) function works.every thing works when it in the class level varaiable scope.
         while(i <= 5){
            //  int j = 10;
             System.out.println(j);
             i++;
             j++;// if we add the addition sequence here or incremental unary operator here we are not able to add the the any addition.
             //value in the (j). because the (j) lies in the method level scope.it value will we end under the method level scope. 
         }
         System.out.println(i);
        //  System.out.println(j); we did not print the output of the (j) here. because he did not lies to the class.


    }
    
}
