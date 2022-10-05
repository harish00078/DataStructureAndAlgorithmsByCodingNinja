package MileStone2.Milestone2Lecture20;

import java.util.ArrayList; // this is the module of array list we have in the java:

public class ArrayListDemo {


    /// defination of arrayList = the ArrayList class is a resizable array, which can be found in the java.util package.
    // The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
    //  While elements can be added and removed from an ArrayList whenever you want.

    public static void main(String[] args) {
        
        // we can create the the arrayList using generic method:
         /// here we create the arraylist function:
        ArrayList<Integer> arr = new ArrayList<>(20); // we can also define its capacity initialy.
        // (like here we gave him a initial value(20)):
        // initial capacity means we can only add the (20) values in the array:
        // if we want to add the more then that values: array has to increase its capacity:
        arr.add(10); // in this way we can add the values in the array:
        arr.add(20); 
        arr.add(30);
        arr.add(50);

        // we can also add the values using index of the array:
        // arr.add(1, 80); // here we can cleary see that we add  the value at the 1st index with (80th) element;
        // when ever we add the  element in the array it will shift that current value by one index:

        // the other form of adding element in the array is(set):
        // SET function will basically set value at a particular index of the array:
        // it will not shift the array by one all the other values of the array remain same :
        //  this is the difference between the ADD and SET fucntion:
        // arr.set(0,100); // here we set the 0th index values is 100:




        // we can also remove the elements from the elements from the arraylist:
        // using remove function: this is simple remove function:
        // arr.remove(2); // like here we write the index number of the value  that we want to remove from the array;

        // we can also remove the particular value of the array:
        // Integer i = 10; 
        // arr.remove(i); // in this way can remove the particular value of the array:
        


        System.out.println(arr.size());// in this way we can check the size of the array:
        System.out.println(arr.get(0));// In this way we can get the value of the array at a paticular index:




        // here we print all the values of the array: this is the simple way that we use to print the array values:

        for(int i = 0; i < arr.size(); i++){  // here (i) represent the index numbers of  the array:
            // that's why here we use Get function to print the values:
            // here in arraylist for defining  its length we use the (size) function:
            System.out.println(arr.get(i)); // and for printing the array list we  use the (get) function:
        }

        // we also have a Ehanced way to print the array values: we can aslo call it (for each loop);
        // we can only use it when we want to  only print the values of the array:
        // not want to change elements in array and other functions that we do in the simple array print function:
        // these things we did not use in the (Ehanced) array:
        for(int i : arr){  // here (i) represent a elements or values  of the array: not the index of the array:
            System.out.println(i);// that why when we print (i)  here it print the values of the array:
        }

        


        
    }

    
}
