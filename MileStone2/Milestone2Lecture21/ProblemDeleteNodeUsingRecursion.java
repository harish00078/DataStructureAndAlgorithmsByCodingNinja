package MileStone2.Milestone2Lecture21;

import MileStone2.Milestone2Lecture20.Node;

import java.util.Scanner;

public class ProblemDeleteNodeUsingRecursion {

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    
        // case3. here we  check the linked list before deleting:

        if(head == null && pos >=0){  /// here we check linked list before deleting any node:
        // here we check that if head is null or position will become greator than equal to  zero then we simply return the head:
        // because when we delete the node form the linked list we use (pos-1).means we are delete the node from the 0th position:
        // if the postion will we equal to zero or greater then zero then we are not able to delete the node:
        // that why in this case we are return the head:
            return head;
        }



        // case.1 if we want to delete the position of the head.we are simply return the head.next value:

        if(pos == 0){  
            
           
          
            return  head.next;

        }else{ // case2. here we delete other given nodes by using recursion function:
            head.next = deleteNodeRec(head.next, pos -1);  // here we try to delete the other nodes from the head.next value:
        
            
            
            return head; //and  here we simply return the head: after the deleting the other node form the linked list value:
            // / here we return head. because we want to connect the previous values of the linked with other values of the linked list:
            // those were left when we delete node from the linked list:


        }


	}


    public static Node<Integer>takeInput(){

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
            
                head = currentNode;
                tail = currentNode;
            }else{ 

                tail.next = currentNode;  

                tail = currentNode;
                
                
            }
            
            data =s.nextInt();
        }
        return head;
    }






    public static void printR(Node<Integer> head){

        if(head == null){  
          

            return;
        }

        

        System.out.println(head.data+" ");
        printR(head.next);  
        



    }


    public static void main(String[] args) {
        
        Node<Integer> head = takeInput();
        head = deleteNodeRec(head, 2);
        printR(head);
    }
    
}
