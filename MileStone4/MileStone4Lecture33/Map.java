package MileStone4.MileStone4Lecture33;

import java.util.ArrayList;

import MileStone2.MileStone2Lecture14.CountNumberOfDigits;



public class Map<K,V> {

    // here we are creating the buckets using ArrayList with (MapNode):
    ArrayList<MapNode<K,V>> buckets;

    int count; //here we create a varaible (count) for having the count of the empty  buckets:
    // or we can say that check the how much elements are present in the hashmap:
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

    // here we  are creating the (Insert) function for our own (hashmap)
    public void insert(K key, V value){

        // here we firstly getting the bucketIndex  for putting our (key) in the array:
        // for that we use our function(getBucketIndex);
        int bucketIndex = getBucketIndex(key);

        // => here we doing that(if element if already there? just update its value)
        // after that before put any value in the array  we have to check that if  any value present in the array or not:
        // or also check for the same (key) values:
        // for that we have to check the head:
        MapNode<K,V> head = buckets.get(bucketIndex); // here  we get values of the buckets for checking that there any head:
        // values are present or not:
        while(head != null){ // here use while loop for traversing through all the vales of the heads:
            if(head.key.equals(key)){ //here we checking that if any head key match with key that we want to insert:

                head.value  = value;
                return;

            }
        }
        // here we are doing that(if there is no element present. then we have to insert that new value at the 0th position of the linked list)
        // here we do if we have new value: that we want to put in the Array:
        // means this value is not already present  in the array:
        // we want to insert it:
        // 1:> for that firslty we have to put the head into the front:
        head = buckets.get(bucketIndex);

        // after checking the head we create the newNode:
        MapNode<K,V> newNode = new MapNode<>(key, value); 
        newNode.next = head; // and that newNode will we equal to the head:
        buckets.set(bucketIndex, newNode); // here we use (set) function:
        // for putting our new value in the Array:
        count++;



    }

    //  here we are creating the (size) fucntion for our own (hashmap):
    public int size(){
        return count; // for getting the size of the hashmap we can simply return (count) varaible value:
    }

    // here we are creating the (search) function for own (hashmap):
    public V getValue(K key){

        // for the searching the value in the hashamap:
        // we have to firslty get the bucketIndex using our own  (getBucketIndex) function:
        int bucketIndex = getBucketIndex(key);

        // after getting the bucket index: we have to check each head values:
        // for the value that we want to (search) hashmap:

        MapNode<K,V> head = buckets.get(bucketIndex);

        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;

    }
    // here we are creating the (remove) function for our own hashmap:




    
}
