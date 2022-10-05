package MileStone2.MileStone2Lecture22;



public class StackUsingLinkedList<T>{ // linked list this is called (<T>) generics keyword:
    // generic methods are used to represent the datatypes  of the linked list:
    // or we can say that they gave ability to the user so they can select the datatype for the function  acc to there self:
    // or acc to there prefrences:




    private Node<T> head;

    private int size; // here we simply create a size variable:
    // so we can use this variable in the different operations as per need:
    // (IMP) = if we are did not do this then we have to move in all the linked list elements:
    // for check there size:


    public StackUsingLinkedList(){ // here we are creating the linked list:

        head = null;
        size = 0;
    }


    public int size(){

        return size; ///  here we are simlpy returning the size of the stack acc to the operations:
        // using this variable:
    }

    public boolean isEmpty(){

        return size == 0;       



    }

    public void push(T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head; // here we are connect our newNode with the previous Node using  head:
        // because when we are creating the new node our head will we present at the previous Node:
        head = newNode; /// and here we are shifting head from previous NOde to  newNode:

        //  after entering the each node we also have to increase the size of the Stack:
        size++;


    }

    public T top() throws StackEmptyException{

        if(head == null){ // before returning the top value of the head we have to check:
            // we have any value present in the head or not: 

            StackEmptyException y = new StackEmptyException();
            throw y;

        }
       

        return head.data;

    }

    public T pop() throws StackEmptyException{

        if(head == null){
            throw new StackEmptyException();// we can also write exception in this way also:
        }

        T temp = head.data; /// here we are store the head.data in our new variable:
        head = head.next; // here we are removing the one element from the stack. to jump on the next value of the head:
        // because here in linked list we are moving backword for create new nodes:
        // thats why when we move head.next it will minimize the node by one and we remove our top most value:

        // we also have to minimize the size of the stack:
        size--;

        return temp;// here we are returing the stack that we are minimizing:


    }


    
}
