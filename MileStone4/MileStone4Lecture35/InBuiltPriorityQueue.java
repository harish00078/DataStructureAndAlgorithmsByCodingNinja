package MileStone4.MileStone4Lecture35;

import java.util.PriorityQueue;

public class InBuiltPriorityQueue {

    /// here we are using the Inbuilt PriorityQueue:
    // by default it using the Min heap property:
    public static void main(String[] args) {
        
        int arr [] = {4,3,7,6,9,10,1,2};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for inserting the value  in the inbuilt priorityQueue: we use (add) function:
        for(int i =0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        // for getting the minimum  value  in the inbuilt priorityQueue: we use (peak) function:
        // System.out.println(pq.peek());
        // for removing  the value  in the inbuilt priorityQueue: we use (poll) function:
        while(!pq.isEmpty()){
            System.out.println(pq.peek());// here are printing the minimum value:
            pq.poll(); // and after that removing that Minimum value:
            // so we are able to print the all values of the priorityQueue:
        }
        // for checking that priorityQueue is empty or not  in the inbuilt priorityQueue: we use (isEmpty) function:
        System.out.println(pq.isEmpty());
    }
    
}
