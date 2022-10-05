package MileStone2.Milestone2Lecture20;

import java.util.Scanner;

// import MileStone2.AssignmentProblemOfRecursion.CountZerosUsingRecursion;



public class LinkedListUse {

    // here we create other class in  that class we will simlpy create linked list:
    public static Node<Integer> createLinkedList(){
        // here we create nodes for the linked list:
        Node<Integer> n1 = new Node<>(10); 
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        // here we can see that the n1 variable is store the refrence of the first node element value:
        // means all these variables are refrences.
        // so we use these refrences or variables to connect them with each other:

        // here we connect the present node in it.with its next values refrences memory:
        // n1.next = n2;  // here we see that we connect the n1 element with its next elements refrence address:
        // basically n1 is also a refrence number:in under that refrences we have our values:
        n1.next = n2;
        // System.out.println("n1 " + n1 + " data " + n1.data + " next " + n1.next);// using this print statement we see that the element and refrence system is working:
        n2.next = n3; 
        // System.out.println("n2 " + n2 + " data " + n2.data + " next " + n2.next);
        n3.next = n4;
        // System.out.println("n3 " + n3 + " data " + n3.data + " next " + n3.next);
        // System.out.println("n4 " + n4 + " data " + n4.data + " next " + n4.next);


        return n1;


    }
    
    // here we can aslo create function for printing the linked list:

    public static void print(Node<Integer> head){

        // here we print the values of the linked list:but this is not a good way or right way to print the linked list:

        // System.out.println(head.data); // here we print the first value of the linked list
        // System.out.println(head.next); // here we only have the refrence of the next value:
        // System.out.println(head.next.data); // here we print the next value of the linked list using the refrence value that we have stored in our first value node:
        // // here we not  printing directly using second value refrence variable(n2):
        
        // // same thing we can use for the 3rd value and soon for other values printing:
        // System.out.println(head.next.next.data);// in this way we print the third value of the linkedlist using refrences addresses:

        // here we can also do one conition if we want to use the head further in the code:
        // we can basically use the temp variables. and we convert that variable into the head:
        // and for further printing the linked list we use the temp variable; because we convert the temp into the head:
        // in this way our head variable value does not going to change:
        Node<Integer> temp = head; // now here  we convert the temp into the head:
        // here we use the while loop for printing the linked list values;In simple way:
        // and here we use the temp instead of head.because we convert head into the temp:
        while(temp != null){ // here we  gave condition to the while loop is that you have to run or print the values untill the head does not reaches the null:
            System.out.println(temp.data);// here we start printing from the first values:
            temp = temp.next; // and here we connect the first refrence value with the next refrence value:
        }
        System.out.println();
        // temp = head;

    }

    // here we create the increment function:
    public static void increment(Node<Integer>head){
        // head.data++;// here we only increases the head value of the linked list:

        // if we want to increase all the values of the linked list.then we have to simply use the print function.
        // of printing linked list with increment function:in this  way we are able to print all the values of the linked list.
        // in a increment way:
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++; // here we simple use the increment function on the elements of the linked list:
            // because data represent here values of the linked list:
            temp = temp.next;
        }
        
            
        
    }




    //  here we create a function were we take linked list input from the user;
    // this is first method of taking input:but not the good method;
    // we also have other method that is better than this:
    
    // //time complexity of this method is  (o(n^2));
    // public static Node<Integer>takeInput(){

    //     Scanner s = new Scanner(System.in);

    //     int data = s.nextInt(); // here we have the input from the user:

    //     Node<Integer> head = null; // here we comvert head equal to null:
    //     // because in linked list we start putting values in the linked list:

    //     while(data != -1){ // before putting the input values in the linked list we have to check
    //         // that we did not put any negative value:

    //         Node<Integer>currentNode = new Node<Integer>(data); // after that we create a another node.
    //         // and gave him a name (current node) and it has a capacity of user input data:
    //         // using this node we will put our values in the linked list:

    //         if(head == null){ // here we  firsly check head is null 
    //             head = currentNode; // after checking that we simply put that current node value in the head: 
    //         }else{ // after that we have to put all the other values in the linked list:
    //             // for that we use tail vairable:
    //             Node<Integer> tail = head; // here we convert tail into head values:
    //             // now head will remain same here.and tail will do the further work:

    //             // here this while loop will run acc to the value:
    //             // like for second value it willl only run for the one time:
    //             // for third value it will run for two types and soon:
    //             // increasing looping sequnce as go on the next value of the user input:
    //             while(tail.next != null){ //because here it firstly check that current values of the tial next is not equal to  null:
    //                 /// and it will we always null because user will only gave us a values.not gave a input in form of node
    //                 // means input is not store refrence of its second values:
    //                 // that why tails next value is always a null value:
    //                 //after it check that tail.next is null it skip this step annd jump on the other step:

    //                 // when the loop run rerun again with the same vaalue then it have the refrence of the next values:
    //                 // and tail will become that next value:
    //                 tail = tail.next;
    //             }

    //             // and here tail will become current node. and head will have this values through currentnode;
    //             // and head will simply print these values

    //             tail.next = currentNode; // here we were basically connect the first value with next values refrence:
    //         }
    //         data = s.nextInt();  /// after that it will now go back again to the input : and rerun this hole program:
    //         // untill the else condition does not get executed:
    //         // after else executing the previous value then it will able to jump on the next values:
            

                   
    //     }
    //     return head; // here we print our value using head. because head is equal to current node or tail variables:

    // }


    /// other way of taking input from the user:
    // this is the good way of taking input from the user:
    // and this is the fastest way of taking input and creating its linked list:
    // time complexity of this code is (O(n)); this code is faster then the other code of taking input:
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









    // here in  main class we use  the  (print) function to print the linked list:
    public static void main(String[] args) {

        // Node<Integer> head = createLinkedList();
        // increment(head);
        // print(head); // here we use print function for printing the linked list:

        
        Node<Integer> head = takeInput();
        print(head);
    }














    // here we create node using this class:

    // public static void main(String[] args) {
        
    //     // Node n1;   // here we only create the refrence of the node:not the node:

    //     // here we create the node:
    //     Node<Integer> n1 = new Node<>(10); // here we use the Node class for creating a Node:
    //     System.out.println(n1);
    //     System.out.println(n1.data); // here we see that we print the data of our first element:
    //     System.out.println(n1.next); // here we try to print the next element.whose refrence is stored in  our first elements:


    // }
    
}
