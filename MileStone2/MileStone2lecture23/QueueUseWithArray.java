package MileStone2.MileStone2lecture23;

public class QueueUseWithArray {
    public static void main(String[] args) {
        

        // here we  are using the queue that  we are created:for checking that it is workng good or not:
 
        QueueUsingArray queue = new QueueUsingArray(3); // here we only have capacity of three elements:

        int arr [] = {10,20,30,40,50,60};// but we can enter the elements in the queue as much as we want to enter:
    
        for(int elem : arr){ // here we are using the inhance for loop for entering the elements in the queue:
            queue.enqueue(elem);

            // we did not have to use the try and catch function or any exception class:
            // when we use dynamic queue:means dynamic queue will automatically upgrade its length:

            //  here we are using the try and catch function for entering the value in the queue:
            // because while creating a function for the queue: i use the exceptions there:
            // and here i did not import that exception: that why  here we use the try and catch function:
            // for avoiding the error:
            // try {
            //     queue.enqueue(elem); // here we are try to enter the value of the array in the queue:
            //     // basically creating a queue entering the elements in the queue:
            // } catch (queueFullException e) {
            //   // we did not reach here:because our function will work perfectly: we are only using try and catch for evoiding:
            //  // the error because of we did not import the exception classes that we created:
            // }

        }


        // here we are deleting the element from the  queue:
        // here we are using the try and catch function with the same reason of enqueue

        while(! queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {

            }
        }
    }

    
}
