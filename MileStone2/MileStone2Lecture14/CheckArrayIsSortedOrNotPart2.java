package MileStone2.MileStone2Lecture14;


public class CheckArrayIsSortedOrNotPart2 {

    public static boolean isSortedBetter(int a [], int startindex){ // here we use other variable were we define the start index for our function usage.

        if(startindex == a.length - 1){ // here we define the length of the array.
            /// if the array have only one index left  then we have to stop sorting the array values.
            // because the array with one value is always a sorted array.
            return true; // and print true.
        }
        if(a[startindex] > a[startindex + 1]){ // here we check the small part of th array .that it is sorted or not.
            return false;// if not print false..
        }
        boolean smallArrayIsSorted = isSortedBetter(a, startindex + 1);  //here we use the  (isSortedBtter) function it self sort the array.
        return smallArrayIsSorted; // here we return the output that if small array is sorted means array is sorted.
    }
    public static void main(String[] args) {
        int a []  = {1,2,3,6,5};
        System.out.println(isSortedBetter(a, 0));
    }
    
}
