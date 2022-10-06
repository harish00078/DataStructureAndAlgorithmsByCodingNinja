package MileStone4.MileStone4Lecture33;

import java.util.HashMap;

public class ArrayIntersection {
    
    public static void printIntersection(int arr1[], int arr2[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){// if the arr[i] value is already present in the map:

                // then we can get that value with the help of (get) function:
                int value  = map.get(arr1[i]);
                // after getting that value we will put that value again in the map:
                // and also increase its value by one:
                map.put(arr1[i], value+1);


            }else{// if map does not contain the key:
                map.put(arr1[i], 1);// then we simply put the key with value(1) in the map:
            }
        }

        for(int i=0; i < arr2.length; i++){ // here we use for loop: for traversing through the arr2 values:

            // here we are doing that:
            if(map.containsKey(arr2[i])){ // if map contains the value of arr2[i]:
                //  then we have to get its frequency or we can say its count using (get) function:
                int freq = map.get(arr2[i]);
                //after that we have to do that:
                if(freq > 0){ // of freq is greater than zero:
                    System.out.print(arr2[i] + " "); // then we simply print that arr2[i] key:
                    // and also put that key with its value agian in the map with decrementing (1) from  its value:
                    map.put(arr2[i], freq - 1);
                }
            }
        }
    }




    public static void main(String[] args) {
        
        int arr1[] = {1,4,5,2,2,3,6,5,3,2};
        int arr2[] = {2,3,2,6,6,5,1};

        printIntersection(arr1,arr2);
    }
}
