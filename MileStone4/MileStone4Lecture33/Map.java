package MileStone4.MileStone4Lecture33;

import java.util.ArrayList;





public class Map<K,V> {

    // here we are creating the buckets using ArrayList with (MapNode):
    ArrayList<MapNode<K,V>> buckets;

    int count; //here we create a varaible (count) for having the count of the empty  buckets:
    // or we can say that check the how much (elements/pairs) are present in the hashmap:
    int numBuckets; // here we are creating a another variable (numbuckets) for tracking the (null)   number sequence of the buckets:

    public Map(){ // here we are creating constructor:
        // for creating a MAP:

        buckets = new ArrayList<>(); // here we create buckets with ArrayList:
        numBuckets = 5; // here we create the (20) number of    buckets:
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

    // here we create our rehashing function:
    private void reHash(){

        ArrayList<MapNode<K,V>> temp = buckets; // here we store all the previous bucket value in the (temp) Arraylist:        
        buckets = new ArrayList<>(); // after that here we create new buckets for doubling its capacity:

        for(int i =0; i < 2* numBuckets; i++){ // here we double the capacity of the (Buckets);
            buckets.add(null); // and there initial value will we (null):
        }
        count = 0; // here we use (count = 0) so we can say that check the how much (elements/pairs)  are present in the hashmap:
        numBuckets = numBuckets * 2; // here we double the capacity of our number of buckets:
        for(int i = 0; i < temp.size(); i++){ // here we traversing through the each value of the temp arrayList( or we can say the old bucket values):

            MapNode<K,V> head = temp.get(i); // after that here we have there head values of that old bucket values:
            while(head != null){ // after that we have to check for the each linkedList that present in the old ArrayList:
                // that we use while loop to util head does not get null:
                K key = head.key; // here we are doing that: (key) will become head.key:
                V value = head.value; //  here we are doing that: (values) will become head.value:
                insert(key, value); //after that here we insert that all values in the insert function again after doubling the  capacity of the hashmap:
                head = head.next; // and here we are doing the head will we equal to the head.next: util we did not insert each value:
                // or we can say we use this for traversing through each value of the linkedlist:
            }
        }
    }
    //here we also create our own loadFactor function:
    public double loadFactor(){
        return (1.0*count)/numBuckets;
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

        // here we are doing rehashing: In insert function:
        // here we create loadfactor for using our created (rehashing) fucntion:
        double loadFactor = (1.0*count)/numBuckets; // here we define the loadfactor in the Insert function:
        if(loadFactor > 0.7){ // here we are doing that if(loadFactor) will become  greator than 0.7: 
            reHash(); // then we have to use our own (reHash) funtion for maintaing the loadFactor of the Hashmap:
        }



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
    public V removeKey(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head != null){
            if(head.key.equals(key)){
                if(prev != null){
                    prev.next = head.next; /// here we remove the head value:
                }else{
                    buckets.set(bucketIndex, head.next);
                }
                count--;
                return head.value;
            } 
            prev = head;
            head = head.next;
        }
        return null;
        


    }




    
}
