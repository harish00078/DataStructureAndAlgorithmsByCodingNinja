package MileStone2.MileStone2lecture23;

public class QueueUseWithLinkedList {

    public static void main(String[] args) {
        
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        int arr [] = {10,20,30,40,50};
        for(int elem: arr){
            queue.enqueue(elem);
        }


        while(! queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (Exception e) {
                
            }
        }
    }
    
}
