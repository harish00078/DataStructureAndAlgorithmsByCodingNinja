package milestone1lecture2;

public class Arithmeticoperatorsandprecedence {

    public static void main(String[] args) {
        
        // these operators i study from the [code with harry] youtube channel.
    /*
         *  Operators in java:
         * 
         * operand + operators + operand = result.
         *  ||          ||          ||
         *  4           +            7     = 11
         * 
         * Types of operators in java:
         * 1.> arithmetic operators
         * 2.> unary operators 
         * 3.> assignment operators
         * 4.> logical operators
         * 5.> comparison operators
         */
        
        //arithmetic operators:

        //rules of the arithemtic operator.
        //rule1:
        int y = 3 + 2 / 5; 
        System.out.println(y);
        /* 
         * then what function of the arithemtic operator is perform firstly.
         * => In arithmetic operators [/,*,%] having a more precedence or more priority as campare to the [+ or -].
         * => that why in this function the system will firstly use divided operator and then use the + operator. 
         * => this function is also called a BODMAS function.
         */
        //rule2:
        int x = 3 * 2 / 5;
        System.out.println(x);
        /*
         * what function of the arithmetic operator will perform firstly here.
         * beacuse here we have same priority type arithmetic operators like[* or /].
         * here the arithmetic operator will firstly operate the multiplication function.
         * beacuse this the basic rule of the arihtmetic operators that they are starting working from left side of the program if they have a same priority or precedence arithmetic operators.
         */
        // rule3:
        int  a = 3,  b = 10;
        // i want that this function will work as a mathematical equation.what this particular function gave me a error of wrong solution.
        // this function gave me the wrong solution beacuse of the its pattern .
        // beacuse this function not write in the way of the mathimatical equation. that why this will gave me wrong answer.
        //int c = b / 2 * a;
        // the write way of writing this function in the mathimatical equation. we have to use the brackets. beacuse brackets have a more priority or precedence than the arithmetic operators. 
        // it will help us  to convert a simple function into the mathimatical equation by breaking it into the parts using brackets.
        // It will firstly solve the bracket function beacuse brackets have a more priority then the arithmetic operators.
        // and that will gave us a freedom of that which function we want solve firslty.if we want our answer in equation system.
        int c = b / (2 * a);
        System.out.println(c);
        /*
         * if we want to solve the mathemtical equation in arithmetic operators. then what we will do.
         * 
         */
        


        //int num1 = 45, num2 = 78;
        // float num1 = 45, num2 = 78; we can use float if we want the result of decimal numbers.
        //num1 += 3; // thses both are uses the assignment operators.
        //num2 -= 8;
        //System.out.print("the value of the num1 + num2 is ");
        //System.out.println(num1 + num2);

        //System.out.print("the value of the num1 - num2 is ");
        //System.out.println(num1 - num2);

        //System.out.print("the value of the num1 * num2 is ");
        //System.out.println(num1 * num2);

        //System.out.print("the value of the num1 / num2 is ");
        //System.out.println(num1 / num2);

        //System.out.print("the value of the num1 % num2 is ");
        //System.out.println(num1 % num2);   // % this sign is known as  module .it is used for finding a remainder of values or operands

        //unary operators:. Unary Operators: Unary operators need only one operand. They are used to increment, decrement or negate a value. 
        
        // increment or decrement operators.
        // increment operators: used for incrementing the value by 1.
        //System.out.println(num1++);
        //System.out.println(++num1);
        // decrement operators: used for decrementing the value by 1. 
        //System.out.println(num1--);
        //System.out.println(--num1);

      // assignment operators: Assignment operator is used to assigning a value to any variable.if we want to add a more value in the particular variable value. there we use the assignment operaotors.
      
      // example of the assignment operators:
      // int num1 = 45; if we want to add more value in this variable then we use the assignment operators.
      // we can add more value in this way:
      /*
       * int num1 = 45,
       * num1 += 3;
       * this will gave me the value of the num1 is 48.
       * In this we can also use other assignment operators.
       */
      /*
       * types of the assignment operators:
        1.> +=, for adding left operand with right operand and then assigning it to the variable on the left.
        2.> -=, for subtracting right operand from left operand and then assigning it to the variable on the left.
        3.> *=, for multiplying left operand with right operand and then assigning it to the variable on the left.
        4.> /=, for dividing left operand by right operand and then assigning it to the variable on the left.
        5.> %=, for assigning modulo of left operand by right operand and then assigning it to the variable on the left.
       */


      /*
       * comparison operators or Relational Operators:
       * 1.> == : checks if two values are equal.
       * 2.> != : checks if two values are not equal.
       * 3.> (<) : use for which value is less then.
       * 4.> (>) : use for which value is greator than
       * 5.> (<=) : use for finding out which value is less than or equal to
       * 6.> (>=) : use for finding out which value is greator than or equal to.
       * 
       */


    }
}

    

