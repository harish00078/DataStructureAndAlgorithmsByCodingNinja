package MileStone4.MileStone4Lecture33;

import java.util.HashMap;

public class ArrayIntersection {
    
    public static void printIntersection(int arr1[], int arr2[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){


            }else{// if map does not contain the key:
                map.put(arr1[i], 1);// then we simply put the key with value(1) in the map:
            }
        }
    }




    public static void main(String[] args) {
        
        int arr1[] = {1,4,5,2,2,3,6,5,3,2};
        int arr2[] = {2,3,2,6,6,5,1};

        printIntersection(arr1,arr2);
    }
}
