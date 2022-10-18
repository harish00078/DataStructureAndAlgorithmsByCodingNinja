package MileStone4.MileStone4Lecture34;

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

        if(isEmpty()){ // here we are doing that: if priority Queue isEmpty:

            throw new PriorityQueueException(); //then we simply have to return the exception:
        }
        // here in removed ELement we have the value of prioriyQueue's zeroth index:
        Element<T> Removed = heap.get(0);
        // and our ans Element will we equal to the removed value:
        T ans = Removed.value;

        // after that we did not have to swap the values:
        // we are only have to set the last value of the heap at  the 0th index of the heap:
        heap.set(0,heap.get(heap.size() -1 ));
        // and after that we are removing the value at last index of the heap: using remove function:
        heap.remove(heap.size() - 1);

        // after put the last value at zeroth we have to maintain the (Min heap property):
        // for that have to maintain our parent and child Elements acc to the Min heap property:
        // for we need the  parentIndex and left or right child Index ELement values:
        // so for that but we can do is that:
        int parentIndex  = 0; // our initail parentIndex will we a zeroth Index:
        int leftChildIndex = 2*parentIndex+1;// here we have our leftChildIndex: as we discuss in the code logic:
        int rightChildIndex = 2*parentIndex+2;// here we have our rightChildIndex: as we disscuss in the code logic:

        while(leftChildIndex < heap.size()){
            // after getting  all the index: we have to check that which childIndex has a less value than its parentIndex:
            // for that we have to maintain the minimumIndex:
            int minimumIndex = parentIndex;// initaily our minimumIndex will we equal to the parentIndex:
 
            // after we have to find that which childIndex have the less priority:
            if(heap.get(leftChildIndex).Priority < heap.get(minimumIndex).Priority){// if leftChildIndex priority is less than the MinIndex priority or we can say its parenrtIndex priority:
                minimumIndex = leftChildIndex; /// our minimumIndex will we equal to the leftchildIndex:
            }
            // after we aslo have to check for the rightChildIndex:
            // or also have to gave the  creteria to the rightChildIndex:
            // so while checking for the rightChildIndex: we did not get the (Exception):
            if(rightChildIndex < heap.size() && (heap.get(rightChildIndex).Priority < heap.get(minimumIndex).Priority)){
                minimumIndex = rightChildIndex;
            }
            // while swaping the values acc to Min heap property:
            // we should have a case where before we reaching the lastIndex of the heap:
            // we will get our perfect priority acc  the Min heap property:
            // so for that we did not have to check further Elements:
            if(minimumIndex == parentIndex){
                break; // so here have to break our loop:
            }
            // after finding the minimum amoung in betweem the left or right index:
            // we swap that minimum value with parentIndex:
            Element<T> temp = heap.get(minimumIndex); // here we store our MiniIndex value in the Temp element:
            // so we can change our MinimumIndex value or we can say our parentIndex value:
            // by using the which of the left or right Child index value is minimum:
            heap.set(minimumIndex, heap.get(parentIndex));// here we set our minimumIndex value at parentIndex value:
            heap.set(parentIndex, temp); // and parentIndex will we equal to the temp Element value:
            // after swaping the value: we also had to check  the other priorityqueue values for mainting the (Min heap priority) property
            parentIndex = minimumIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
        }
        return ans;





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
