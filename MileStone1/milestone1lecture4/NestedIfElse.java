package milestone1lecture4;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        
        // here we learn about Nested if else and if-else if-else
        // Nested If =>  nested-if: A nested if is an if statement that is the target of another if or else. Nested if statements mean an if statement inside an if statement.
        // Yes, java allows us to nest if statements within if statements. 
        //i.e, we can place an if statement inside another if statement. 

        Scanner s = new Scanner(System.in);

        int a, b;

        a = s.nextInt();
        b = s.nextInt();

             
        
        
        // this best of using nested if .because here we use the (ElseIf) statement.
        // more important is that . we can add many  more (else if) statements.
        // because the else if statements does not gave us a error.
        // and it more broadly used in the conditional statements.
        // we also skip the else . if we use the else if statements.
        
              if(a > b){
                System.out.println("first number is greator");
            }else if(b > a) // here we use the else if.this is the best way to gave the condition to system in between the statement.
            {
                System.out.println("second number is greator");
            }else{
                System.out.println("both are equal");
            }

              
        


        // In this way we can write the nestesd if:

        if(a > b){
            System.out.println("first number is greator");
        }else{
            if(b > a){
                System.out.println("second number is greator");
            }else{
                System.out.println("both are equal");
            }
        }
        
  
        

        // if we use nested if in this way  we may face the error.
        
        // if(a > b){
            // System.out.println("first number is greator");
            
        // }
        
        // here it will gave me the Error.
        // beacuse if the the fisrt if was executed. and then it try to check the another if. and it will change its value with another if.
        // if(b > a){
        //     System.out.println("second number is greator");
        // }else{
        //     System.out.println("both are equal");
        //     }
        // }


    }
}
    

