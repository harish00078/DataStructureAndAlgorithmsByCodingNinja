package MileStone2.Milestone2Lecture20;

import java.util.LinkedList;

public class ProblemDeleteNodeInLinkedList{

    // this problem will work acc to its main class code:

    // public static LinkedList<Integer> deleteNode(LinkedList<Integer> head, int pos){

        // //case1: head is not null
        // if(head == null){ // firstly we have to check that if head check null 

        //     return head; // then we simply return the head value to the user:
        // }

        // //case2: postion is at zeroth index
        // if(pos == 0){ // if the position value  that we want to remove is zeroth index:
        //     return head.next; // then we simply shift our head to the head.next value:
        //     // in this way our  previous head  value get remove:
        // }

        // //case3: if we have position between anywhere in  the linked list inseated of head: 
        // int count = 0; // here we use count function for looping through all values of the linked list:
        // // or we can say track the values of the linked list: that at which value on we are:
        // LinkedList<Integer> currHead = head; //  here we use refrence of the linkedlist to create a new Node:
        // // here we are convert our head to currHead:because in further cases we are only using the currHead:
        // while(currHead != null && count < (pos -1)){ // here we are running the loop from currHead value to the (pos -1) value:
        //     currHead = currHead.next;// here currhead value is less value than value of (Pos - 1).and currHead.next value is our (pos - 1) value: 
        //     count++;// we also have increment the count variable for traviling through the each value of the head:
        // }
        // if(currHead == null || currHead.next == null){ // before removing the position variable we have to check the near by its nodes are not null:
        //     return head; // if any one of them is null:then we simply return the head:
        // }
        // currHead.next = currHead.next.next; //else if they are not null: then  we can connect the position value's previous value or the next of it:
        // // In this way the position value get removed:because we disconnect him with its previous node or next to  him node:

        // return head;//after all these we simply return its value:  
    // }


}
