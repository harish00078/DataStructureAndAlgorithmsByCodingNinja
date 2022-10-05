package milestone1lecture3;



public class DataTypeConversions {

    public static void main(String[] args) {

        System.out.println(4 + 4); // int + int = int
        System.out.println(4 + 4.5);// int + double = double
        System.out.println(4.1 + 4.4);//double + double = double
        // there are three ways of doing a division.
        // one way is 2/5 = this will gave us a answer as a integer.this will not show the correct if the output have a float number in it.
        System.out.println(2/5);
        // second way is to convert any one of the value into the double. this will gave us a correct answer. if we have flaot or double in the output.
        System.out.println((double)2/5);
        // this will also gave us a correct answer because one have are in the form of the float value or number.
        System.out.println(2.0/5);


        float f = 1.7f; //why we use the f in last of the value.what is the need of that.
        /*
         * 1. because in the system the decimal numbers values (1.7) are automatically store in the double system.
         * 2. that why we have to put the f in the lasat of the decimal number value.for converting that value from double to the float.
         * 3. there are two ways to do that;
         * one way is simply put f in the last of the value.like
         * float f = 1.7f; this is the better way for the doing the conversion if this is direct conversion 
         * second way of doing this conversion is explicit conversion;like:
         * float f = (float)1.7; if it is the reverse conversion then explicit conversion is the better way of doing the reverse conversion
         * 
         */


        // we can use this converion for the other values.
        int i = (int)10.6; // IN this way we can convert the float or double value in the integer value.




        // this is the way of converting the short into the integer.
        // short s = 17;
        // int i = s;
        // but we did not do that for the integer. because we did not convert the integer into the short because the interger have a bigger value then the short.
        // but if we have to it any way we can use the explicit conversion.
        // s = (short)i; //this way we can convert any small into the bigger value storage.
        
        // char ch =  'a'; // this gave us a ASCII value of the character 'a'.
        // int i = ch;

        // if we want to do the reverse of this technique we did not do that directly. we interger have bigger value range then a char.
        // but if we want to do it any way we can use the explicit conversion.
        // ch = (char)i; // this is called the explicit conversion.

        // ch = ch + 1; we did not found the ASCII value of this ch because it did not have a integer variable. it had a ch variable means character variables.
        // and we know that we can not add the character and integer directly.
        // here we also use the explicit conversion like this.
        // ch = (char)(ch + 1);
    
        System.out.println(i);
        
        
    }

   
    
    
}
