package MileStone2.Milestone2Lecture20;

public class Node<T> {

    /// here we create a node function using class:so we dont have write two things again and again for the each element:
    // that we want to create in linked list.that why we simply create class for that particulaer function:
    // whenever we want to create node we use this class: 

    // we can also use this class in better way using a generic method:
    public T data;  /// here we have our first element:
    public Node(T data){  /// here we convert that element into the node:
        this.data = data;
    }

    public Node<T> next; // and here we have our next node reference:
    
}
