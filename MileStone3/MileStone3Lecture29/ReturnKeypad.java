package MileStone3.MileStone3Lecture29;

import java.util.Scanner;


public class ReturnKeypad {
    // here we  create function of get keypad values acc to the input values:
    // we are basically create this fucntion for the last value that we have given:
    public static String getOptions(int digit){
        if(digit == 2){
            return "abc";
        }
        if(digit == 3){
            return "def";
        }
        if(digit == 4){
            return "ghi";
        }
        if(digit == 7){
            return "pqrs";
        }
        return "";
    }

    public static String[] keypadCombination(int input){
        if(input == 0){ // here we have our base case:if given input check zero:
            String [] output = new String[1]; // here we create array with variable name output:
            // we use array to return our output in form of array string: 
            output[0] = ""; // here we are doing that:if output variable have zero value then we simply return null:
            return output; // here we are returning the output varaible value:
        }

        // here we are calling recurison on the first given values:
        // here we are ignoring the last given value that we will handle later:
        String [] smallOutput = keypadCombination(input/10); // thats why here we divide our input value with 10:
        int lastDigit = input % 10; // here we get out last given value: why using the module function:
        /// here we use call recursion on our last digit:
        // this recursion will we only get us the values of our last digit:
        String lastDigitOptions = getOptions(lastDigit);
        ///  here we create other array with varaible name output:
        //  this array will have a length of acc to the smalloutput array or with lastDigitOptions variables value length combine:
        String [] output = new String[smallOutput.length * lastDigitOptions.length()];

        int k = 0; // here we use (k) for having value sequnce in the output variables:
        // because here we use two for loops with different vairbles name:
        for(int i = 0; i < smallOutput.length; i++){ // here we are having the values of the smalloutput array:
            for(int j = 0; j < lastDigitOptions.length(); j++){ // here we are having the values of the lastDigitOptions variable:
                output[k] = smallOutput[i] + lastDigitOptions.charAt(j); // here we are adding those values with each other:
                // and store those values in the output varaible name array:
                k++; // here we are incrementing the output array index using (K) varaible:
                //while inserting the values in the output array:
            }
        }
        return output;// after that here we are returning our output:



    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();
        String [] output = keypadCombination(input);
        for(String outputString: output){
            System.out.println(outputString);
        }
    }
    
}
