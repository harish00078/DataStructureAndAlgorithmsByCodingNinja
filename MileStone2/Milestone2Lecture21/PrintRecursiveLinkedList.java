package MileStone2.Milestone2Lecture21;

import MileStone2.Milestone2Lecture20.Node;

import java.util.Scanner;

public class PrintRecursiveLinkedList {


    /// here we try to print linked list using recursion:

    public static void printR(Node<Integer> head){

        if(head == null){  /// here we firstly check that linked list head is empty:
            // this is we do for only checking that head is empty:

            return; // if head is empty then we have to return nothing:
        }

        // System.out.println(head.data +" "); // here we firstly print the first value of the linked list:
        // first values is printed by us:
        // printR(head.next); /// here the other values were printed by recursion function it self:  

        // we can also print the linked list values using recursion in reverse pattern simply:

        printR(head.next);  /// here the recursion fucntion firslty call the previous values of the linked list::
        System.out.println(head.data+" ");// and when we are printing them with the first values they are print the reverse order:



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
        printR(head);
    }



       

    

    
    
}
