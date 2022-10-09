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
        // here we use forloop for putting (null) values  in that 20  numB uckets:
        for(int i = 0; i < numBuckets;i++){
            buckets.add(null);
        }

    }
    // here we create constructor:
    // from were we are getting our bucketIndex:
    // bucketIndex is that were we put our key/value pairs:
    private int getBucketIndex(K key){
       int  hc = key.hashCode(); // here we use superclass function for getting the hashcode for our ( owm map function) that we are creating:
       // after getting the hashcode: we have to compress it:
       // for getting our array index value:
       int index = hc%numBuckets; // here we get our index using (modulo) function:
       return index; // and here we are returning our index:
    }




    
}
