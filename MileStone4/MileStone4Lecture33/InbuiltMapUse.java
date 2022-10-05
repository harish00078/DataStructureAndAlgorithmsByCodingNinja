package MileStone4.MileStone4Lecture33;

import java.util.HashMap;

public class InbuiltMapUse {

    public static void main(String[] args) {

    HashMap<String,Integer> map = new HashMap<>();

    map.put("abc", 1);
    map.put("def", 3);

    System.out.println(map.containsKey("abc"));

    System.out.println(map.size());

    }



    
    
}
