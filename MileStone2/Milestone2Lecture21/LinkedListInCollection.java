package MileStone2.Milestone2Lecture21;

import java.util.LinkedList;

public class LinkedListInCollection {

    public static void main(String[] args) {
        

        // in under java system or java collection system we also have all the data structures:
       // instead of of creating your own linked list system we can also directly use that data structures:
        // like here we use the linked list data structure:

        LinkedList<Integer> list = new LinkedList<>();  // here at default we are using the doubly linked list:
        // here we add the nodes in the linked list using the inbuild linked list data structures:
        list.add(10);
        list.add(20);
        list.add(30);

        // here we try to insert the node at the particular position in the linked list:
        list.add(1, 100);

        // here we try to get the values of the particular position in the linked list:
        // System.out.println(list.get(1));

        // we can also use other function of the (add) function:
        //like if we want to add some value at first of the linked or last of the linked list:
        // we can simply use (addfirst) function.or (addlast) function:
        // list.addFirst(80);

        // we can also get the size of our linked list:
        // System.out.println(list.size());

        

        /// if we want to replace some value in the list:
        // we can use the (set) function:
        list.set(0, 60);

        /// we can also use remove function for removing some values from the list:
        // we can also use some other methods of the remove function:


        // here we try print all the elements those are present in the linked list:
        // we  are using the same method that we use in the arrayList to printing it:
        /// basically we are use the for loop to print the each value of the linked list:
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    
    }

}
