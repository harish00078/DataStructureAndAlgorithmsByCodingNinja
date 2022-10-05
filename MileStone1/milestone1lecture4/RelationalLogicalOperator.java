package milestone1lecture4;



public class RelationalLogicalOperator {

    // relational and logical operators

    public static void main(String[] args) {

        //relational operator is used to define the relationship between the two values or more.
        // -> relational operator is basically used for the find or check the relationsgip between the two values.

        // what if boht the integer have a same value.
        int a = 10 , b = 10;


        System.out.println(a>b); // (>) this sign is used to define that this value is greatar than or not.

        System.out.println(a<b); // (<) this sign is used to define that this value is less than or not.

        System.out.println(a == b); // (==) double equalto sign is used for camparing the value. or check the two values that they are equal to each other or not.

        System.out.println(a != b); // (!=) this sign used for checking that these two values are not equalto each other.

        System.out.println(a >= b); // (>=) this used for that one value is greatar than or equalto the other value.

        System.out.println(a <= b); // (<=) this used for that one value is less than or equalto the other value.

        // => logical operators.

        // there are three types of logical operators.
        /*
         * 1. AND operator. symbol of AND is   (&&)
         * 2. OR operator. symbol of OR is     (||)
         * 3. NOT operator. symbol of NOT is   (!)
         */
        //  AND operator. syntax = THIS AND THIS
        /*
         * 1. if we have TRUE AND fALSE = false.
         * 2. if we have FALSE AND TRUE = FALSE.
         * 3. if we have TRUE AND TRUE = TRUE.
         * 4. if we have FALSE AND FALSE = FALSE.
         */
        // OR operator. syntax = THIS OR THIS.
        /* 1. if we have TRUE OR fALSE = TRUE.
        * 2. if we have FALSE  OR TRUE = TRUE.
        * 3. if we have TRUE  OR TRUE = TRUE.
        * 4. if we have FALSE  OR FALSE = FALSE.
        */
        //AND operator.
        /*
         * 1. if value is ture then the output value is FALSE.
         * 2. if value is false then the output value is TRUE.
         */

         
        System.out.println(a >= 10 && b > 10);// example of AND operator.

        System.out.println(a >= 10 || b > 10); //example of OR operator.
        
        System.out.println(!(a>b));// example of NOT operator



        
        
    }
    
}
