package MileStone1Lecture9;

import java.util.Scanner;

public class TakingInputAndPrintingArray {

    public static void main(String[] args) {

        // how we take input from the user for the array and how to print that array input.

        // for  having user input and printing that user input in array have to created a two for loops;
        // 1. in first loop we are having a input from the user.beacuse we can only created the array.
        // for having the values in that array from the user we have to created the loop.
        //2. in second loop we can print that values those were given bu user. 

        // create first loop for having the values from the user.

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n]; // here we created the array that have the array value from the user.

        for(int i = 0; i < n; i++){ // here we created loop that will have the array value from the user.
            System.out.println("enter the element of" + i + "th index" ); // here they will gave us a values of the array.
            arr [i] = scn.nextInt(); // here it will store the array value that is given by the user.
        }
        

        // second loop for printing the array values that is given by user.
        for(int i = 0; i < n; i++){ 
            System.out.println(arr[i]); // here it print all values of the array.that is given by user.
        }
        

    }
    
}
