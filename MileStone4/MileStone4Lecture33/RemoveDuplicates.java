package MileStone4.MileStone4Lecture33;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    // here we create function were we removeduplicates from the array:
    // with the help of Hashmap: 
    public static ArrayList<Integer> removeDuplicates(int []arr){
        // here we firslty create Arraylist: with the variable name of output:
        // we use here arraylist because we want our output in the form of numberList:
        ArrayList<Integer> output = new ArrayList<>();

        // after that here we create Hashmap: acc to our  logic:
        HashMap<Integer, Boolean> map = new HashMap<>();
        // here we create for loop for traversing through all the values of the array:
        // so we are able to check each value of the array:
        for(int i = 0; i< arr.length; i++){

            // here we firslty check if arr[i] have the value:
            if(map.containsKey(arr[i])){
                continue; // then we simply check on the next value:
            }
            //if it does not have that value: then we simply  add that value in the output varaible:
            output.add(arr[i]);
            // and also put that outputvalue  in the hashmap as a key with value true:
            // so we did not put that values again in the output variable:
            map.put(arr[i],true);
        }
        return output;//after that we simply return output:
        




    }

    public static void main(String[] args) {
        
        int [] arr = {1,3,2,2,3,1,6,2,5};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }
}
