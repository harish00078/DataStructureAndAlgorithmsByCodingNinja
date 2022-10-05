package MileStone2.Milestone2Lecture20;

import java.util.Scanner;

import MileStone2.MileStone2Lecture19.Generics.Print;

public class ProblemInsertNodeInLinkedList {

    /// here we create function for inserting node in the linked list:
    

    /// here while inserting the node into the linked list we have three conditions or i can say that three cases:
    //1. simple case inserting the node into the linked list:
    //2. inserting the node when our given position is bigger then the previous value of the linked list:
    //3. when we are try to enter the node at the 0th position:

    public static Node<Integer> insert(Node<Integer> head,int elem,int posi){

        Node<Integer> nodeTOBeInserted = new Node<Integer>(elem);

        if(posi == 0){
            nodeTOBeInserted.next = head;
            // head = nodeTOBeInserted;
            return nodeTOBeInserted;
        }else{

            int count = 0;
            Node<Integer>prev = head;
            while(count < posi - 1 && prev != null){ // here  we write (prev != mull).because if the linked list length is smaller then the given postition.
                // then we do not have to do any thing:simply print the linked list values:
                count++;
                prev = prev.next;
            }
            if(prev != null){
                nodeTOBeInserted.next = prev.next;
                
                prev.next = nodeTOBeInserted;
            
    
            }

            return head;


        }
    }
        
    

    /// here we use input function for taking input:

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


    

    // here we use print function for printing the output:
    public static void print(Node<Integer> head){

        
        Node<Integer> temp = head; 
        
        while(temp != null){ 
            System.out.println(temp.data);
            temp = temp.next; 
        }
        System.out.println();
       

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 80, 0);
        print(head);
    }
    
}
