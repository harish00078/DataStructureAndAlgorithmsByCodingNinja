package MileStone4.MileStone4Lecture34;

import java.beans.PropertyVetoException;
import java.util.ArrayList;


// here we are creating our own priority_queue data structures:
public class Priority_Queue<T> {

    // here we create our own  (heap) datastructure for creating priority_queues:
    private ArrayList<Element<T>> heap; // or for creating (heap) we use ArrayList with element class:
    // from were we get our elements for the priority queue:

    // here we create our priority_queue:
    public Priority_Queue(){ 
        heap = new ArrayList<>(); // under priority_queue we have (heap) datastructure:
        // that we create through Arraylist:
    }

    // here we create Insert function: for our own priority Queue:
    public void Insert(T value, int priority){
        // here we firslty have our Element:
        Element<T> e = new Element<>(value, priority);// here we are creating the Element using Element constructor that we create:
        heap.add(e);// and here we add that Elements in the heap or we can say in the Arraylist:

        // after that we have to compare that child value with its parent value:
        // if the parent values is greater than its child values:
        // then we have to swap these values with each other:
        // and we have to do  this sequnce util  our parent values;
        // did not get smaller then its child values:because here we are mainting the (Min heap property):

        // so the last value of our heap function will we our child value:(because that is the last value that we entered)
        int childIndex = heap.size()-1; // here we have our childIndex :
        //or we discuss in our code logic: that how can get the parentIndex for the particular child Index:
        int parentIndex = (childIndex - 1)/2; // here we have our parentindex:
        
        while(childIndex > 0){
            
            // after  finding the values: if our parent value is greater than its child value: then we have to swap those values:
            // because here we are mainting the (Min heap property):
            if(heap.get(childIndex).Priority < heap.get(parentIndex).Priority){ // here we are doing that if heap's childIndex priority is less than its parentIndex priority:
            // before swaping the value we have to :
            //  firstly store the childIndex values into the temp Element:
            Element<T> temp = heap.get(childIndex);
            //after that we set our childIndex value as parentIndex value:
            heap.set(childIndex, heap.get(parentIndex));
            // and our parentndex value will we set as ChildIndex value that we stored in the (temp) Element:
            heap.set(parentIndex, temp);
            // after swaping these two values: 
            // we have to also check for ts  other values:that they are follow the Min heap property:
            childIndex = parentIndex;// here our childIndex will we equal to the old parentIndex:
            //and our new parentIndex will we our new childIndex's parentIndex: after swapping the values:
            parentIndex = (childIndex  - 1)/2;
        }else{ // else if parentIndex not greater than childIndex:

            return; //then we did not have to return anything:
        }
        }


    }
    // here we create getMin function: for our own priority queue;
    public T getMin() throws PriorityQueueException{ // here we use our own exception:

        if(isEmpty()){ // if our priorityQueue isEmpty: 
            throw new PriorityQueueException(); //then we throws and exception:

        } // if our priorityQueue is not empty;
        return heap.get(0).value; // then we simply return the priorityQueue's 0th index value: 
        // because here we are maintaing the Min heap order priority:
        // or in Min heap order priority the smallest element will at the 0th index of the ArrayList:
    }

    // here we create removeMin Function : for our own priority queue:
    public T removeMin() throws PriorityQueueException{

        if(isEmpty()){

            throw new PriorityQueueException();
        }

    }

    // here we create Size function: for our own priority queue:
    public int size(){

        return heap.size(); // In size function here we simply return the size of our heap:
    }
    // here we create isEmpty function: for our owm priority queue:
    public boolean isEmpty(){

        if(size() == 0){ // here we are doing that: if size check zero:
            return true; // then we simply return true:
        }
        return false; // else we are returing the false:
    }

    
}
