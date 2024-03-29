package MileStone2.Milestone2Lecture20;

public class QuestionOfLinkedList {

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);

        node2.next = node1;
        print(node2);
    }
    
}
