package Milestone1Lecture7;

public class BitwiseOperators1 {


    public static void main(String[] args) {
        
        //  Bitwise Operator :- bitwise operator means:
        /*
         *  1. firstly it will convert data type variable values in the form of binary number system
         *  2. after that it will perform the function.using that binary number values.
         *  3. after performing the function. we have our output in the form of the binary number.
         *  4. will convert that binary number output in the form user input data type . and gave tha value to the user as output.  
         */
        
        int a = 10, b = 2;

        // these are four type of bitwise operator.
        System.out.println(a & b);  // bitwise AND operator.

        System.out.println(a | b);  // bitwise OR operator.

        System.out.println(a ^ b);  // bitwise XOR operator.

        System.out.println(~a); // bitwise complement Operator.

        // we have other two important  types of the bitwise operators.
        // 1. left shift bitwise operator.
        // 2. right shift bitwise operator.
        
        // 1. left shift bitiwise operator.
        // operator will left shift the value of the binary number system. with one byte. and in that free we can store zero binary number.
        // also working acc to the binary value like if the value is positive or negative.
        
        // for example:

        System.out.println(a << 1);// this will left shift the binary number of the data type value by one .and that free space in the last we have.
        // we will fill it with (0).
        // and our hole output will we change.
        // (1) => the meaning of the one here is that shift the binary number value by one. we can change this value  acc to our perfernces. we can shift it to (3) and other values.
        // like this way:
        System.out.println(a << 3);
        
        // 2. right shift bitwise operator. // this will right shift the binary number of the data type value by one .and that free space in the front  we have.
        // In right shift bitwise operator we did not put any value in the front free space.
        // ( important note)  => we can put the value in the front space acc to the -ve or +ve positive value that we have.
        
        System.out.println(a >> 1);



    }
    
}
