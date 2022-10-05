package MileStone1Lecture9;

import java.util.Scanner;

public class FindingLargestElement {

    // in this function we can take the user input:

    public static int [] takeinput(){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("enter the element of" + "ith index");
            arr[i] = scn.nextInt();
        }
        return arr;

    } 

    // here we write function to find the largest number or element in the (n)
    public static int largest(int arr []){
        int max = Integer.MIN_VALUE;  // for finding the largest number in the (n) we compare our arrays first value with a (integer.MIN_VALUE) function.
        // beacuse it has the smallest value in the integer. means we compare our array integer first value with  -infinity.
        for(int i = 0; i < arr.length; i++){ // here we use our arrays length to run loop:
            if(arr[i] > max){  // here we use the condition that if our arr[i] values is greater than the max. 
                max = arr[i]; // then the max have that value of the arr[i] .
            }
        }
        return max; // and here we have the largest values of the (n) element.
    }

    public static void main(String[] args) {
        
        int arr [] = takeinput();

        int lar = largest(arr);

        System.out.println(lar +" " +"is the largest element of the n");
    }
    
}
