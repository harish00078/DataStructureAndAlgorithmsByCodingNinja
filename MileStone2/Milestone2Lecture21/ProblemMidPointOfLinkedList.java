package MileStone2.Milestone2Lecture21;

import MileStone2.Milestone2Lecture20.Node;

import java.util.Scanner;

public class ProblemMidPointOfLinkedList {


    // here we find out the mid point or node of the linked list:
    public static Node<Integer>  midPoint (Node<Integer> head){  // here we create a node

        // here we firslty have to check the head.(means user input):
        if(head == null || head.next == null){
            return head;
        }

        //after that we create two variables that we use to move arround the linked list values:
        // and find out the mid value of the linked list:here we did not use the loop function,count function or lenght function to find the mid point of the linked list:

        //here we create first variable fast: fast moves twice the speed of slow:
        // when fast varaible is  at the postition of last node of the linked list:
        // and second varaibles is slow: slow moves one step : when fast at last node the slow will automatically at the postion of the mid point:
        //because fast moves the twice of the speed:

        // here we have two situation even and odd Integers:
        //for that we have wirte the condition:
        // for odd it will we (fast.next);
        //for even it will be (fast.next.next);


        Node<Integer> slow = head, fast = head;   // here we firstly define both the variables;
    
        while(fast.next != null && fast.next.next != null){  // here we gave a contition to the variables:
    
            // here we gave them a  moving criteria. at which speed they had to move on the head:
            // for finding the mid point:
            slow = slow.next;  
            fast = fast.next.next;
    
        }
        return slow;  // here we simply return the slow.because slow varaible have a mid point to the linked list:

    }

    public static Node<Integer>takeInput(){

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        // in this problem we are taking both the variables null:
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                // here we track both the variables;
                // here both the variable will become currentNode:
                // from here head remian same:
                // only the tail will moving further for having all the other input value:
                head = currentNode;
                tail = currentNode;
            }else{ 

                tail.next = currentNode;  // here our tail.next value will become current node:
                // and currentnode is equal to head: and this value will go directly to the head:


                tail = currentNode;// and here after that our tail will jump on current values:
                // for working on the other input values:
                /// here we only use the tail varaibles for having further values of  the user input for linked list:
            }
            
            data =s.nextInt();
        }
        return head;
    }


    


    public static void printR(Node<Integer> head){
      if(head==null){
        return ;
      }
      printR(head.next);
      System.out.print(head.data+" ");
    }





    public static void main(String[] args) {
        

        Node<Integer> head = takeInput();
        Node<Integer> mid = midPoint(head);
        System.out.println(mid.data);
    }
  
      
    
    
}
