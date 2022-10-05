package MileStone1Lecture9;

public class ArrayOperations {
    
    public static void main(String[] args) {
        // firstly we have to create the array.like this:

        // here we created a int datatype array:

        int arr [] = new int [10]; // here it created  a array of ten numbers.
        // here we only created a array. under this array we did not have any value.
        // we have to gave him a values acc to our prefrences.

        arr[0] = 5; //in this way we can gave the value to the array.
        arr[5] = 17;
        // arr[-1] = 18; //we can also did not do this  in array because we did not have or create  a any minimize value in the array 
        // arr[10] = 15;// we can also did not do this in array beacuse we only created a 1 to 10 array list.
        // but acc to array index it will only have o to 9 values.that why we  did not use 10 in 1 to 10 array list.

        System.out.println(arr[0]); // in this way we can print the array.
        System.out.println(arr[5]);
        System.out.println(arr[3]); // like we print the array without gaving him any value .it will gave us a zero output.

        // here we created a  char datatype array:

        char cArray [] = new char[10];

        System.out.println(cArray[0]); // here we did not get any value .beacuse of the ASCII value of the CHAR.

        // here we created a double datatypes array:

        double dArray [] = new double[10];

        System.out.println(dArray[0]); // here we have value zero in form of the double like (0.0)
    }
    
}
