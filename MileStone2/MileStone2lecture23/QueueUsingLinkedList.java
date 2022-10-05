package MileStone2.MileStone2lecture23;

import java.text.Normalizer.Form;

import MileStone2.MileStone2Lecture22.Node;

public class QueueUsingLinkedList<T> {

    private Node<T> front;
    private Node<T> rear;
    int size;


    public QueueUsingLinkedList(){ // here we are creating the queue using linked list:

        // here front and rear also are two nodes of the linked list:
        // using these nodes we are creating our queue:
        front = null;
        rear = null;

        size = 0;
    }

    // here we create other function for the size of linked list:
    public int size(){
        return size;


    }
    // here we create other function for check that queue is empty or not:
    public boolean isEmpty(){

        return size == 0;

    }
    // here we create a enqueue function for inserting elements in the queue:
    public void enqueue(T elem){

        Node<T> newNode = new Node<>(elem);
        size++;
        if(rear == null){ // case:1 = when we enter the first element at the position of 0th index:
            // here if rear check null then it means we are entering the value at 0th index:

            // after entering the value at 0th index then we point our front and rear variable to the newNode means at zeroth index value:
            front = newNode;
            rear = newNode;
        }else{ //if we are not enter the variable at zero index:
            // we use rear varaible further enter the values in the queue:
            // here we also have to  connect all the elements to each other because we are using the linked list data structure for create queue:

            rear.next = newNode;  /// here firstly we are doing that our new value will we implemented at next of rear variable:
            rear = newNode;//after that we shift our rear variable to that new value:
            // for further enterning the new element in the queue:
            // because all the other values will we enter in the queue. with in this same procedure:

        }


    }

    // here we also create other function that define the front variable:
    public T front() throws QueueEmptyException{
        if(front == null){  // before printing the front value of the queue; we have to check that we have value present in the front index of the queue:
            throw new QueueEmptyException();  // if we did not have any value present in the front index then we simply return the (empty) exception:
        }
        return front.data; // or if we have value present in the front: then we simply return that value:

    }
    // here we create other function that will remove the elements from the  queue:
    public T dequeue(){

        T temp = front.data; // before removing the element from the queue: we are firslty store that element in the temp variable:
        // because we want to print it for the user:that which element he has was deleted from the queue:
        front = front.next; // after that for removing the element from the queue we simply jump on the next value of the queue:
        /// and also jump our front variable to that next value:  
        // in this way that previous value have no refrence in the system:and garbage system of the language:
        // will simply remove that value form the queue:

        // here we also have one exception for that we can do is that:
        if(front == null){ //if there is no value left in the front variable to delete then we should:
            // also shift our rear to null: because if there is not value present to delete for the front variable:
            // then it means we have no value represent in the queue:so we also have to shift rear to null:
            rear = null;
        }
        size--; // when we delete some element from the queue: we also have to decrease its length:
        return temp; // and here we return the previous value of the queue that we stored in the temp variable: for the user that which element he deleted from the queue:


    }



    
}
