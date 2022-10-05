package MileStone2.Milestone2Lecture21;



import java.util.Scanner;

import MileStone2.Milestone2Lecture20.Node;

public class ProblemMerge2SortedLinkedList {

    public static Node<Integer>merge(Node<Integer> head1, Node<Integer> head2){ // here we firstly created a Node:

        // here we are firslty checking the head or user input before merge them:
        // before merging them we have to  check that we should have a two head:
        // if there is only one head then there is no need or merging: we can simply return its input:
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        // here we defining the varaible before writing the code:
        Node<Integer> t1 = head1, t2 = head2; // here we took head1 as t1, or head2 as t2;
        Node<Integer> head = null, tail = null;  // here we define the head or tail:
        // on the starting point of the code that head or tail will we null:



        // here we firstly check the first variables of both the lists:
        // which one is smaller in both the lists that one will become our head or tail:
        if(t1.data <= t2.data){ // here we check if t1 has smaller value then the t2
            // then
            head = t1; // then head will become t1;
            tail = t1; // or tail will become t1
            t1 = t1.next; // after that t1 jump on the next value:
        }else{

            // if t2 has a  smaller value then the t1:
            // then:
            head = t2; //then head will become t2;
            tail = t2; // or tail will become t2;
            t2 = t2.next; // after that t2 jump on the next value:
        }

        // after finding smallest values between both the lists: we have to merging other values also:

        while(t1 != null && t2 != null){ // here we write loop for we have to only merging the value.when one of the list does not get empty or null:
            if(t1.data <= t2.data){  // here we again check if t1 have  smaller value among the t2:
                // then:
                tail.next = t1; // then tail.next value will become t1: 
                tail = t1; // t1 will become tail:  // here tail adding the value in the head:after sorting the values:
                t1 = t1.next; //after that t1 will  jump on next value:
            }else{

                // if t2 has a smaller value then t1:
                // then :
                tail.next = t2; // then tail.next value will be t2:
                tail = t2; // and t2 will become tail: // here tail adding the value in the head:after sorting the values:
                t2 = t2.next; //after that t2 will jump on next values:
            }
        }
        
        //after that when all the values get merged:
        // we have to print them:

        // before printing we have to check that we will have all values in the merged list of both the sorted lists::
        if(t1 != null){ // here we check that if t1 still have next value.
            tail.next = t1; // then that next value will become t1:
        }else{
            // if t2 have any left value in it:
            // then:

            tail.next = t2; /// then that value will go to t2;
        }

        return head;
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

        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        Node<Integer> head = merge(head1, head2);
        print(head);
    }












}
