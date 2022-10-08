package MileStone4.MileStone4Lecture33;

public class MapNode<k,V> { // here we are using the generic method for creating Nodes:
    // from the (keys or values)

    // here we are creating a LinkedList (node) acc to our code logic:
    
    K key; // here we have the (key) value from the generic method:
    V value; // here we have the (values) from thr generic method:
    MapNode<k,V> next;
    
    // here we are creating constructor:
    // for making a Nodes of (key/value) pairs:
    public MapNode(K key, V value){
        this.key = key;
        this.value = value;
    }
}
