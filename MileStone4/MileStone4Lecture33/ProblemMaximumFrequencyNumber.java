package MileStone4.MileStone4Lecture33;


import java.util.HashMap;

/// this problem will work acc to its codezen main class:


public class ProblemMaximumFrequencyNumber {

    // In this problem we have to found that which number has the maximum frequency in the array:
    // using hashmap: 
    // and aslo have to print that number:

    public static int MaximumFrequencyNumber(int []arr){


        // firstly we create Hashmap:
        HashMap<Integer, Integer> map = new HashMap<>();
        // after that we use for loop: for traversing in the values:
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){ // if map contains the value of arr[i]:
                // then we put that value again in the arr[i] and also increament arr[i] count with (+1): 
                map.put(arr[i],map.get(arr[i]) + 1); 
            }else{ // if that not the case:
                // means: if that same value is not present in the arr[i]:
                // then we simply put that value in the arr[i]:
                // and also increment its count by one:
                map.put(arr[i], 1);
            }
        }
        int max = 0; // after that here we create variable max with initail value zero:
        int ans = Integer.MIN_VALUE; // here we create other variable ans with initail value of MIN_VALUE:
        for(int i = 0; i <arr.length; i++){ // here we use for loop: for traversing through the array values:
            // here we are doing that:
            if(map.get(arr[i]) > max){  // if map.get(i) value is greater then the max value:
                max = map.get(arr[i]); // then we put the map.get(i) in the max varaible:
                ans = arr[i];  // and that (i) value will be equal to the ans variable :
            }
        }
        return ans; // after we simply return that value:
    }

    public static void main(String[] args) {
        
        /// this problem will work acc to its codezen main class:
        int arr [] =  {1,2,3,3,3,5};
        int ans = MaximumFrequencyNumber(arr);
        System.out.println(ans);
    }

    
}
