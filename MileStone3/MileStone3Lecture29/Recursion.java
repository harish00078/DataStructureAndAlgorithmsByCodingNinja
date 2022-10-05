package MileStone3.MileStone3Lecture29;

import java.util.Scanner;

public class Recursion {

    public static String[] subsequences(String input){
        // here we have our base case:
        if(input.length() == 0){ // if the input.length check zero:
            // here we create one array with variable name output:
            String [] output = new String[1]; // here we gave (one) lenght to the array:because we want to gave our output in the form of the array:
            output[0] = "";  // here we gave have value of the zero in the varaible (output) that is (null):
            return output; // here we are returing that value:
        }

        // here we are dealing with the input string values from index(1 to last):

        // here we create the array with varaible name smalloutput:
        // and we call recursion here on the String input from its index(1) substring to the last substring  of the input String:
        // here we use recursion for creating the subsequnces of the input string from the index(1 to last):
        //because we handle the (0)th index later:
        String [] smallOutput = subsequences(input.substring(1));
        //here we create other array with  variable name (output):which has  double the  lenght as compare with our other array:
        // that  we create with varaible name (smalloutput): or we can say that were we call the recusrion: 
        // we create this array: with double the length of small output array:
        String []  output = new String[smallOutput.length * 2];
        // because in this double lenght array:
        // 1: firsty we store all the values of the smalloutput array:
        // here we are using the for loop to store the values of the smalloutput array into the double lenght array name (output):
        for(int i = 0; i < smallOutput.length; i++){
            output[i] = smallOutput[i]; // here we store all the values of the smalloutput array into the double lenght array output:

        }

        // here we are now working on the string value of the 0th index:
        //after creating the subsequences of the input string value from the index(1 to last) using recursion:
        // here we simply add the 0th index value with the other subsequnce values that we have created using recursion:
        // and while adding that value with 0th index: we also have to store that values in the double length array (output):
        // here we have to care full when we are giving adding criteria to the 0th index value for while:
        // adding in the double length output array:
        // because we already have other smalloutput array values in it:
        // so we have to add the(0th index +subsequnce value) after the smalloutput array subsequnce values in the double length array output:
        for(int i = 0; i < smallOutput.length;i++){

            // here we are adding the 0th index value with all the smalloutput array subsequences values:
            // also after adding that values: we have to store that values in the double length array name as  output:
            // we have to store them into the output array:after the smalloutput array values:
            // because we already have smalloutput array value in the output array:
            output[smallOutput.length + i] = input.charAt(0) + smallOutput[i];
        }
        return output;
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String input = s.next(); // here we have string values from the user: in the input variables:
        // here we create array with varaible name output:
        // in that array we store our subsequence input variable values that we get from our sequences function:
        String [] output = subsequences(input); 
        // here after that we simply print our output array values using the for loop:
        for(String outputString: output){
            System.out.println(outputString);
        }
    }
    
}
