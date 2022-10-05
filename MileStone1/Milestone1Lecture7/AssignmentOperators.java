package Milestone1Lecture7;

public class AssignmentOperators {
    public static void main(String[] args) {
        // assignment operators:
        // 3. Assignment Operator:  Assignment operator is used to assigning a value to any variable. 
        // It has a right to left associativity, 
        // i.e. value given on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant

        // assignment operator types:
        /*
         * 1.> +=, for adding left operand with right operand and then assigning it to the variable on the left.
           2.> -=, for subtracting right operand from left operand and then assigning it to the variable on the left.
           3.> *=, for multiplying left operand with right operand and then assigning it to the variable on the left.
           4.> /=, for dividing left operand by right operand and then assigning it to the variable on the left.
           5.> %=, for assigning modulo of left operand by right operand and then assigning it to the variable on the left.
         */

            int a = 10;
        
            // a += 10;  // it will add( 10) to the (a) variable.
            // a -= 5; // it will (-5) from the current value of the a.
            // a /= 5 // it will divide the a with 5.
            // a *= 5 // it will multiply the a with 5.
            // a ^= 1 // it will XOR the value of a.
            // we can also left shift or right shift bitwise operators.
            // like:
            // (a >> 1); right  shift.
            // (a << 1): left shift.
            System.out.println(a);


        
    }
    
}
