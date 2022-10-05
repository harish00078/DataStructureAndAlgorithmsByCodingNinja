package MileStone1Lecture9;

import java.util.Scanner;

public class MovingIntoFunctions {


    // how to use arrays in the function.








    public static int [] takeInput(){  // here we create the takeinput array function.  
        // [] -> these square brackets represent that this is array .
        // always remember this when we  create array function we use the square brackets []  with function datatypes.


    

    // firstly we have  to create the function . were we have the array input from the user.

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int arr [] = new int[n];  // here we created our array acc to the user input.

    for(int i = 0; i < n; i++){
        System.out.println("enter the element of" + i +"th index"); 
        arr[i] = scn.nextInt(); // here we have the all  inputs from the user and  stored  all array values in the arr variable.
    }
    return arr; // here we have the output of all that array values.only having the value not printing that array values.
    }

        // secondly we have to create the array function were we print the user array input:

    public static void printArray(int [] arr){ // here we print the user array values.     
        // int [] arr define here that the int arrary list that have  the given values of the user.
        // arr is retrun statements variable of the takeinput function.
        // that why arr have the all user input arr values.
        int n = arr.length; // here we define the (n) beacuse in this function we did not define the (n) variable.
        // now (n) varaible have the size or lenght of the array.
        // this way we can use our loop till last values will we printed of the array . beacuse now (n) varaibles have the size of the array.
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]); // here we print all the user array values.
            //arr[i] this represent here were we store all values of the user input.in the (takeInput) function.
            }
        }
    public static void main(String[] args) {
        
        int  arr [] = takeInput(); // here we define that we use the (takeinput) function for take imput values from the user.

        printArray(arr); // here we define that here we use the printArray function . for having output of the input values.
    }


    
}
