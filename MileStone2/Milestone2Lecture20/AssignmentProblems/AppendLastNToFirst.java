package MileStone2.Milestone2Lecture20.AssignmentProblems;

import java.util.LinkedList;

public class AppendLastNToFirst {

    // public static LinkedListNode<Integer> AppendLastNToFirst(LinkedListNode<Integer> head, int n){

    //     if(n == 0 || head == null){ //firstly we have to check that:if n is equal to zero or head is null:
    //         // then we simply return the head:
    //         return head;
    //     }

    //     // here we create three varaible those are equal to the head;

    //     LinkedListNode<Integer> fast = head; // first one is fast variable:
    //     LinkedListNode<Integer> slow = head; // second one is slow variable; 
    //     LinkedListNode<Integer> initialhead = head; // third one is initial head:
        

    //     // here we gave Node values to the fast variable: 
    //     for(int i = 0; i < n; i++){ // here we run (for) loop: from o to n:
    //         fast  = fast.next; //  and our fast varaible will we move in the linked list acc to the (for)loop:
    //     }

    //     while(fast.next != null){ // here we create a while loop: In this while loop we use fast.next for other variables: 
    //         // so they can also move in the linked list:
    //         slow = slow.next; // for giving  value to the slow variable: slow variable will move util the fast.next is not get equals to null:
    //         fast = fast.next; // here we do the some with fast variable:
    //     }

    //     LinkedListNode<Integer> temp = slow.next; // here we create a other variable that have slow.nexT varaibles values:
    //     slow.next = null; // here we convert the slow.next into the null:
    //     fast.next = initialhead;  // here the fast.next values will we equal to initialhead:means now that values will become our head values in the linked list:
    //     head = temp;// after that head will we equal to temp: and temp will equal to slow.next variables values:
        

    //     return head; // and here we simply return our head:


    // }
    
}
