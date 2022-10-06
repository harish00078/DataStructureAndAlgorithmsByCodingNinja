package MileStone4.MileStone4Lecture33;

import java.util.HashMap;
import java.util.Set;


public class InbuiltMapUse {

    // here we are creating  hashmap function using inbuilt java hashmap function:
    public static void main(String[] args) {
    
    // here we create hashmap function:
    // and also define the datatypes for there key/value pair:
    HashMap<String,Integer> map = new HashMap<>();// here we gave (map) variabe name to the hashmap function:
    // we can gave him any (name):

    // here we are inserting the key/value pairs  in the hashmap function:
    // using the (put) function:
    map.put("abc", 2);
    map.put("def", 3);

    // here if we try to create the same type of keys with different values:
    // this will not increase the size of the map:
    // because this value will replecate with its same type of key:
    map.put("abc", 20);

    /// here we can check the keys present or not  in the maps:
    // using the (containsKey) function:
    if(map.containsKey("abc")){

        System.out.println("yes: map has this value");
    }

    if(map.containsKey("abc1")){
        System.out.println("yes: map has this value");
    }

    // we can also the get (values) of the key:
    // using (get) function:
    int v = map.get("abc");
    System.out.println(v);

    // we can also get the values of the keys using this way:
    // or In this way we can also terminate the (not present key) error while getting the values of the keys:
    int v1 = 0; // here we create variable (v1) and gave him a initial value of (0):
    //after that firstly we can check for the (key) whose value we want using (containkey) function:
    if(map.containsKey("abc1")){ // here we are checking for the key:
        v1 = map.get("abc1"); //here  our get function will be equal to the variable v1:
        // in this way:if we have any value for the particular key: then we get that value:
        // if we did not have any value for that particular key: then we can get the initail value of the (v1) variable and that is (0):

    }
    System.out.println(v1); // and here we are printing that value:
    
    // we can also remove the (key) from  the map:
    // using remove function:
    // map.remove("def");

    // In this way can iterate on the hashmap:
    // using (set) datastructure function: we can get all the keys from the hashmap:
    // using this functions we can get the keys in the form of sets:
    Set<String> keys  = map.keySet(); 
    for(String s: keys){ // here we use for loop for iterate through all the keys value of the hashmap:
        System.out.println(s); // here we are printing that values:
    }







    // here we can also check the size of the hashmap:
    // using the (size) function:
    System.out.println(map.size());
    

    }



    
    
}
