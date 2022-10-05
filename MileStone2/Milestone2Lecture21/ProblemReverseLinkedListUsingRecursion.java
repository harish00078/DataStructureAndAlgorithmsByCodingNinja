package MileStone2.Milestone2Lecture21;

import java.util.Scanner;

import MileStone2.Milestone2Lecture20.Node;

//     // here we firslty create a class that we use in the other class were we write the code for reversing linkedlist:
//     class DoubleNode{

//         // here we create a two varaibles of the node:
//         Node<Integer> head;
//         Node<Integer> tail;
//         DoubleNode(){  /// here we create  a one empty constructor:


//         }

//         // here we create a another constructor  that we use to  represent the varaibles of this class in the other class:
//         // this constructor will basically define the varianles  of the other class:
//         DoubleNode(Node<Integer> head, Node<Integer> tail){
//             this.head = head;
//             this.tail = tail;
//         }
//     }







public class ProblemReverseLinkedListUsingRecursion {


//     // this is not a good code or algorithm for reversing the linked list using recursion: in the way of time complexity:
//     /// this code or algorithm have a time complexity of (O(n^2));
//     // public static Node<Integer> ReverseR(Node<Integer> head){  // here we created a node:


//     //     // first we have to check the linkedlist:it will  have values more then one or it should not we null also:

//     //     if(head == null || head.next == null){
//     //     return head;
//     // }
//     //     // secondly we call renverse function on the linked list:
//     //     // here we  call the reverse function on the smallest part of the linked list:
//     //     // this part will we reverse by a reverse function:
//     //     Node<Integer> smallhead = ReverseR(head.next); // here we use node that we created.  with the variable name of smallhead. here we not creating a  new node
//     //     // and here we also call recursion function on the 1st values to the last values of the linked list:
//     //     // these values were we handled or reverse by recursion function:

//     //     // after reversing the small part of the linked list:
//     //     // we have to atteched this reverse part with 0th value of the linked list:
//     //     // after attaching the zeroth value of the linked list at the end of the smallest reverse list. we have declare the null value also:

//     //     Node<Integer> tail = smallhead; // here we use the node that we created:
//     //     while(tail.next != null){
//     //         tail = tail.next;
//     //     }
//     //     tail.next = head; // here we gave head value to the tail.next
//     //     head.next = null; // after that here we gave null to the head.next value:
//     //     return smallhead; // and here we simply return all the reverse values of the linked list:

//     // }











//     // // here we write the better version of the reversing linked list using recursion:
//     // for improving time complexity of our code,using a class:
//     // we are basically create class that will do some work for problem:
//     // in this way we are improving time complexity of our code:

//     // here we write the better code for the reversing the linked list using recusion:

//     // firstly we create a linked list with the name of reverseRBetter and node in the Integer datatypes.
//     // this linked list also have a return types that is our class that we created:

//     public static DoubleNode reverseRBetter(Node<Integer> head){

//         DoubleNode ans; // here i only use the refernce  of the class that we create with variable name (ans):

//         // here we firslty check the user input:
//         if(head == null || head.next == null){  //case.1:
//             ans = new DoubleNode();  /// here we create a object using the class that we create:
//             // here we can aslo gave him values direclty.instead of create a particular constructor for define this values in the class:
//             // here we define the class variables acc to the user input conditions that we have in head:
//             ans.head = head;  // here if head is null then (ans.head) willl we null
//             ans.tail = head;  // if head is equal to tail or means head only have one value then head  will equal to (ans.tail):
//             return ans;  // here we simply return that values using (ans)variables:
//         }

//         // case.2:
//         // this DoubleNode Will have Both head and tail of reverse Linked list:
//         // because DoubleNode is our class. and in this class we have define both the variables head or tail;
//         // that why when we use doubeNode with recursion function. the recursion will work on both varaibles through doubleNode class: 
//         DoubleNode smallAns = reverseRBetter(head.next);
//         smallAns.tail.next = head;  /// here smallAns recursion fucntion values. the tail value of it  will we connected with head of the user input:
//         // here we connect the class  tail with the head:here writing smallAns variales with it because our tail present at the class that we created:
//         head.next = null; // after conneting the user input with reverse linked list. after that we will declare the next value of the head as null;

//         ans = new DoubleNode();   // here we clearify our solution to the class that we created:
//         ans.head = smallAns.head;  // here we define head to the class varaible head through ans variables;
//         ans.tail = head;  // here we define the head to the class variable tail through ans variable;
//         return ans; // and here we return that ans:



//     }



//     // here we create a other function for reversing a linked list using the function that we are actually created for reversing the linked list using recursion with class:
//     // we are creating this function for the user conveneance: because he did not know what i write in the code and how that code is working.
//     // so that why i am creating  a another function were i call that reverse function:
//     // in this way user will only have to gave input:
//     public static Node<Integer> reverseRBetter1(Node<Integer> head){

//         DoubleNode ans = reverseRBetter(head);
//         return ans.head;
//     }




    

    // we also have other idea to reversing the linked list: this is the simplest and best way of reversing the linked list:

    public static Node<Integer> reverseRBest(Node<Integer> head){

        if(head == null || head.next ==null){
            return head;
        }
        Node<Integer> smallhead = reverseRBest(head.next);
        Node<Integer> reversedTail = head.next;
        reversedTail.next = head;
        head.next = null;
        return smallhead;
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
        // head = reverseR(head);
        // DoubleNode ans  = reverseRBetter(head);
        // head = reverseRBetter1(head);
        head = reverseRBest(head);
        printR(head);
    }

    


    
}
