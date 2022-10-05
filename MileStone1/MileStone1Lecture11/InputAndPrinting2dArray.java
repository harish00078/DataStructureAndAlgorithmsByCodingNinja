package MileStone1Lecture11;

import java.util.Scanner;


public class InputAndPrinting2dArray {

    public static void main(String[] args) {
        
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

        // we  can use for loop for printing the all  elements of the 2darray.

        for(int i = 0; i< rows; i++){
            for(int j = 0; j < colm; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
