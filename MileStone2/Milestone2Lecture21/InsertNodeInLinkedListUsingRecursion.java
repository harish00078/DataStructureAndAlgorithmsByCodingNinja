package MileStone2.Milestone2Lecture21;

import MileStone2.Milestone2Lecture20.Node;

import java.util.Scanner;

public class InsertNodeInLinkedListUsingRecursion {
    
    
    public static Node<Integer> insertR(Node<Integer> head, int elem, int posi){  /// here we create a node for the insert function:

        //case3. if the position input   get out of the linked list index while checking the postion of the element that we want to insert in the linked list:
        // so in this case we have to gave condition to the poaition variable: so it can not go to the null position:
        // we can do is that we can simply return the head values:while checking that if  head become null:
        // and position variable will have value of greater than the 0:
        // we will simply return the values of head:
        if(head == null && posi > 0){
            return head;
        }



        // case1. if we want to insert the node at a  0th postion:

        if(posi == 0){  // for insert the node element at a 0th position we firstly have to check that element postion is at 0th.
            Node<Integer> newNode = new Node<>(elem);// here we create a new Node as a the name of (newNode).
            newNode.next = head;// here we do that.we are shifting the head to the 1st position of the element value:
            // and we implementing the element value at 0th position:
            return newNode; // here we return that value:

        }else{ //case2: if we want to insert the node at the other postion of the linked list instead of 0th position:
            head.next = insertR(head.next, elem, posi -1); // here we are doing is that we are shifting the head to the next values:
            // and also shift position to poaition -1. in this way head and pasition are at same node.
            // and put the element there using recursion function.in this way head.next value is connected with the element:
            // and  we are successfully inserted node there:
            return head; // and here we are return the head value:


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
        head = insertR(head, 20,8);
        printR(head);
    }

    
}
