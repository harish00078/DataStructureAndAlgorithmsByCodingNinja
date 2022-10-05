package MileStone1Lecture11;

import java.util.Scanner;


public class LargestColumnSum {

    // here we find the largest sum of column

    // firsrlty we have to create a  main file:

    public static void main(String[] args) {
        
        int arr [][] = takeInput();
        int larcolmSum = largestcolm(arr);
        System.out.println(larcolmSum);
    }

    // secondly we take input from the user .here we create function for taking input from the user.

    public static int [][] takeInput() {
        
        //IN this program we can leaern that how we can take input and print output of the 2d array.

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows"); 
        int rows = scn.nextInt(); // here we enter the number of rows
        System.out.println("enter the number columns");
        int colm = scn.nextInt(); // here we enter the number of columns

        int [][] arr = new int [rows][colm];  // here we enter our rows and colmn criteria that is given by the user.
        // for creating the 2d array.

        // after having the array we have to ask the user for entering the elements in the 2d arrays.

        // for having the 2d array element input from the user we can use the for loop. like this:
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colm; j++){
                System.out.println("enter the element at" + i + "row" + j + "column");
                arr[i][j] = scn.nextInt(); //here we have the all the elements from user  for our 2darray.
            }
       }
       return arr;
    }
    // here we create the function for finding the largest sum of the column.

    public static int largestcolm(int [][] arr){

        // here we calculate the  largest sum of the column.

        int rows = arr.length; // firslty we have to define row length of the array
        int colm = arr[0].length;  // secondly we have to define the column length of the array.
        int largest = Integer.MIN_VALUE; // here we define our largest number . for run the loop sequnce.and also define some limit to the function sequnce.

        for(int j = 0; j < colm; j++){ // here we firstly check the column.
            int sum = 0; // in column our sum will we zero:
            for(int i = 0; i < rows; i++){ // here we  go through all the row elements of that column.
                sum = sum + arr[i][j]; // here we have the sum  of all the elements.
            }
            if(sum > largest){  // here check that if our sum have largest value then the largest
                largest = sum; //then our largest will equal to sum.

                // basically here we convert the sum into largest . because that we want to print;
            }
        }
        return largest;
            

    }   
           
  
}

    


