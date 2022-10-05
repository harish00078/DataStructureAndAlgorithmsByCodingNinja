package milestone1lecture2;


public class VariablesandDataTypes {

    public static void main(String[] args) {
        /*  for learning variables and data types.
        we take a example of (AddTwoNumbers).
        */
        int a = 45, x = 55;
        int c = a+x;
        System.out.println(c);

        // data type examples:
        //=> these four types is use to store the integer values.like(1,2,3,45,5666757)
        //byte b = 11;// => one having only one byte.
        //short s = 15; //=> short having a two bytes in it.
        //int i = 111; //=> int have a 4 bytes in it.
        //long l = 11232; //=> long have a 8 bytes in  it.

        // => these two types is used to store the decimal numbers.(12.3,22.2,232332.5545)
        //float f = 12.55f; //=> float stores a 4 bytes in it.
        //double d = 14445.66; //=> double storse a 8 bytes in it.

        // => we have (char) datatype to store the characters. like(a,b,etc).
        //char ch = 'a'; //this is a character.
        // => we have string data types if we want to write a long line of something in our code. like("this is the sum of the two numbers: "c=a+b).
        //String S = "harish";//this is string.(the combination of the characters is called a string).
        // => if we only want to show that the value is true or false we use the boolean data types.
        //boolean b1 = true; // this only have a one bit in it.

        
        /*
         * rules for constructing name of variables in java
         * 1. can contain digits, underscore, dollar signs, letters
         * 2. we hould begin with a letter, and then we can use $ or _
         * 3. java is case sensitive language which means that harry and Harry are two different variables altogether        
         * 4. should not contain whitespaces -> already know about \n ,\t ,\r and space.
         * 5. you cannot use reserved keywords from java. example of the reserved keyword in java is 
         *  function java() {
          alert("This function can not be called");
          }
          6. we did not print output  before we did not created a variable or value for that output. 
            for example we did not do this thing in java.
            system.out.prinln(a);
            int a = 44;
         */


        
        /*
        in java we have a two types of data types:
        1. primitive data types  --> (define = primitive data typese are those data types who are already define) In primivite data types we have a limitation.( because we can only stores data in primitive data types acc to there types and there range(range means how much we can go -ve to how much positive we can go + ve))
        => the primitive data types are:
        a. byte = only have one byte(1byte) => (8bits)->[one byte have a 8bits in it] range of byte(-128 to +127 this means we can only stores negative 128 to positive 128 numbers in bytes)
        b. short = only have two bytes(2bytes)
        c. int = only have four bytes(4bytes) => (32bits)->[beacuse 1 bytes have a 8bits in it.]
        d. long = only have eight bytes(8bytes)
        e. float = only have four bytes(4bytes)
        f. double = only have eight bytes(8bytes)
        g. boolean = only have on bit(1bit)
        h. char = only have two bytes(2bytes)
        */

        /*
        2. non - primitive or reference data types  --> (define = non primitive data types those who are not already define.we have d to define them with our self)
        -> defination =  Non-primitive data types or reference data types refer to instances or objects. They cannot store the value of a variable directly in memory. They store a memory address of the variable. Unlike primitive data types, which are defined by Java, non-primitive data types are user-defined. They are created by programmers and can be assigned with null. All non-primitive data types are of equal size.
        -> example of non primitive data type are or we can use these types as non primitive data types:
        a. string
        b. array
        c. interfaces
        d. enum
        e. class
        */

        //



    
        
    }
    
}
