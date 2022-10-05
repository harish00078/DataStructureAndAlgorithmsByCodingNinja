package MileStone2.MileStone2lecture23;

import java.util.Stack;



public class QueueUsing2Stacks<T> {

    // here we use two stacks to create a one queue:

    Stack<T> s1;
    Stack<T> s2;

    public QueueUsing2Stacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
}
