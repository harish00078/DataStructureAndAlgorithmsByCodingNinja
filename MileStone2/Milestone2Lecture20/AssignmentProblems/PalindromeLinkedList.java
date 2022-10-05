package MileStone2.Milestone2Lecture20.AssignmentProblems;

import java.util.LinkedList;

public class PalindromeLinkedList {

    // here we are reversing the second half of the number LinkedList:
    // public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
    //     LinkedListNode<Integer> curr = head;
    //     LinkedListNode<Integer> newHead = null;
    //     LinkedListNode<Integer> fwd = null;
        
    //     // using this formation we will at the end of the linkedlist:
    //     // and that end value will become our new head: in this way we reverse the linked list:

    //     while(curr != null){

    //         fwd = curr.next;
    //         curr.next = newHead;
    //         newHead = curr;
    //         curr = fwd;
    //     }
    //     return newHead;// here we returing our new head://basically is a reverse head of the linkedlist given head:

         
    // }

    // // after reversing the  linked list head: we will check the given head is equal to the reversing head:
    // // In this way we are able to check that:this number linked list is palindrome or not:

    // public static boolean  isPalindrome(linkedListNode<Integer> head){

    //     // here we firslty check that head or head.next value have any value or not:
    //     if(head == null || head.next == null){
    //         return true;
    //     }
        

    //     // here we create two variables that we use for travlling through the linked list values:
    //     LinkedListNode<Integer> fast = head;
    //     LinkedListNode<Integer> slow = head;

    //     while(fast.next != null && fast.next.next != null){
    //         fast = fast.next.next;  // here our fast variable move twice the values:
    //         slow = slow.next; // here our slow variable move on one value:

    //     }

    //     LinkedListNode<INteger> secondHead = slow.next; // here our slow variable will at the half of the  linked list:
    //     // and slow.next will become our second head:
    //     slow.next = null;  // here we convert our slow.next into the null: because the slow.next value will we save in the second head:

    //     secondHead = reverseLinkedList(secondHead); // here we use the secondhead variable: and we reverse it using recursion function:
    //     // basically here we reversing alll the after mid point values of the linked list: 


    //     // case1: now  here we comparing the reverse values with  the given head values:
    //     LinkedListNode<Integer> firstSubList = secondHead;  /// here we have all the value of second half linkedList in reverse order:
    //     LinkedListNode<Integer> secondSubList = head; // here we all the given head values;

    //     while(firstSubList != null){  
    //         if(firstSubList.data != secondSubList.data){   // here we are checking the second half reverse values with head:
    //             return false; /// if they are not equal then we simply return the false:
    //         }

    //         firstSubList = firstSubList.next;
    //         secondSubList = secondSubList.next;

    //     }


    //     //case2: rejoin the two sublists to restore the input list to its original form:
    //     firstSubList = head;
    //     secondSubList =reverseLinkedList(secondHead);

    //     while(firstSubList.next != null){
    //         firstSubList = firstSubList.next;
    //     }

    //     firstSubList.next = secondSubList; /// here we check if given head values or we can say first half are equal to the reverse of the second half of the linked list:

    //     return true; // then we simply return true:


        
    // }
    
}
