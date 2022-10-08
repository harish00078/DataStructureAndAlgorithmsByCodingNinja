package MileStone4.MileStone4Lecture33;

import java.util.ArrayList;

public class Map<K,V> {

    // here we are creating the buckets using ArrayList with (MapNode):
    ArrayList<MapNode<K,V>> buckets;

    int count; //here we create a varaible (count) for having the count of the empty  buckets:
    int numBuckets; // here we are creating a another variable (numbuckets) for tracking the (null)   number sequence of the buckets:

    public Map(){ // here we are creating constructor:
        // for creating a MAP:

        buckets = new ArrayList<>(); // here we create buckets with ArrayList:
        numBuckets = 20; // here we create the (20) number of    buckets:
        // here we use forloop for putting (null) values  in that 20  numBuckets:
        for(int i = 0; i < numBuckets;i++){
            buckets.add(null);
        }

    }
    
}
