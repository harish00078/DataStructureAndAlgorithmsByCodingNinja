package MileStone1Lecture11;

import java.util.Scanner;

public class FunctionsWith2dArrays {

    // here we create function for  the 2d array.

    // for creating fucntion for the 2d array.creating a function for the 2d array we have tO:
    // 1. frislty we have a rows and columns for the 2d array from the user.
    // 2. secondly we have to have a take element input from the user for 2d array.

    // 2. thirdly we have simply print that input in 2d form.

    

    // firstly we create a function for having input from the user.

    public static int [][] take2dArrayInput(){  // here these two square brackets represent that this is a 2d array.

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
        return arr; // here we gave the 2d array value.
    }

    // here we create a function for printing the 2d array;

    public static void print2dArray(int arr [][]){
           // we  can use for loop for printing the all  elements of the 2darray.

           // here we also define the length of the row and column for printing the 2d array.
           int rows = arr.length;
           int colm = arr[0].length; // here arr[0] basically shows a zeroth row and length will basically count its size.
           // means that are column. that why we use arr[0] for column counting.

           for(int i = 0; i< rows; i++){
            for(int j = 0; j < colm; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // here we create our main file were we use  these all functions.

    public static void main(String[] args) {
        
        int [][] input = take2dArrayInput();
        print2dArray(input);
    }
    
}
