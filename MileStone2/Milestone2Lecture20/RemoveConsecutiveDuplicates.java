package MileStone2.Milestone2Lecture20;

import java.util.ArrayList;



public class RemoveConsecutiveDuplicates {


    // in this problem we were have our input in the form of array.
    // and we have  the output as arraylist:

    public static ArrayList<Integer>removeConsecutiveDuplicates(int arr[]){ /// here we connect arrayList with simple array;
        // means we are having a input in the form of the array;

        // firstly we have to create  a arrayList:

        ArrayList<Integer> result = new ArrayList<>(); // here we create a array list:

        // second we simple add the 0th index value at result.because 0th index values will not we compare with any other array value:
        //because it does not have any values at it previous index:
        result.add(arr[0]);

        //after that we have to check all the values of the array. which values are consecutive or not:
        
        // for that we use forloop: for cheking every value of the array:
        for(int i = 1; i < arr.length; i++){ 
            if(arr[i] != arr[i-1]){  // here we gave him a condition that if arr of (i)th position is not equal to its privous values it means:
                // that number is not a consecutive number:
                result.add(arr[i]); // and we simple add that number into our result variables as a arrayList:
                // because we create that variable under the arraylist:
            }

        }
        return result; // here we simply print that result:
    }

    public static void main(String[] args) {
        
        // here we create a array and gave input:
        int arr [] = {10,10,20,20,20,30,40,40,10};
        
        // here we use function that we create for  remove the consecutive duplicates number from  the array
        ArrayList<Integer> Result = removeConsecutiveDuplicates(arr);
        
        // here we use for loop for print that array :
        for(int i = 0; i < Result.size(); i++){
            System.out.println(Result.get(i));
        }
        
    }
    
}
