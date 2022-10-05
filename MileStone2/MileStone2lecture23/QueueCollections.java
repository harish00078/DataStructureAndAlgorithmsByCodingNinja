package MileStone2.MileStone2lecture23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueCollections {

    public static void main(String[] args) {
        
        // Queue<Integer> queue; // In java queue is a interface not a class:
        // so we can not direclty create queue: because creation of the queue depend on the class:
        // 1> so we can use the reference of the queue interface to create a queue:
        //2. or we can use the linked list class to create a queue:
        // because in the java system linked list class implements the queue interface:
        // so we can use the linked list class to create the queue interface:

        // Queue<Integer> queue = new LinkedList<Integer>();
        // queue.add(10);
        // queue.add(20);
        // System.out.println(queue.size());  
        // System.out.println(queue.peek());  // using peek function we can check the front variable of the queue: 
        // System.out.println(queue.poll());  // we can also use the remove function instead of poll:
        // System.out.println(queue.size());

        // Queue<Integer> q=new LinkedList<Integer>();
        // for(int i=1;i<5;i++)
        // {
        //     q.add(10+i);
        // }
        // System.out.print(q.poll()+" "+q.size());

        // Queue<Integer> q=new LinkedList<Integer>();
        // Stack<Integer> s=new Stack<Integer>();
        // q.add(5);
        // q.add(10);
        // s.push(10);
        // s.push(20);
        // System.out.print(q.peek()+s.pop());
    }
    
}
