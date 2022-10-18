package MileStone4.MileStone4Lecture34;

public class Priority_QueueUse {

    public static void main(String[] args) throws PriorityQueueException {
        
        Priority_Queue<String> pq = new Priority_Queue<String>();

        pq.Insert("abc",15);
        pq.Insert("def",13);
        pq.Insert("fsas",90);
        pq.Insert("fsafsafa",150);
        pq.Insert("xvzxvsaed",120);
    
        while(!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }
    }

    
}
