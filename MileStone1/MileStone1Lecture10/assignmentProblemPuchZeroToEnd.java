package MileStone1Lecture10;

public class assignmentProblemPuchZeroToEnd {

    // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.
    
    
    public static void pushZerosAtEnd(int[] arr) {
        int len = arr.length;
        int i = 0 ;
        int k = 0;
        int temp = 0;
        

        // In this loop ith will basically check the index values.
        // if it zero then i will move forword to check new other values.
        // if it have some value instead of zero it will gave that value to the kth index.

        // and kth index will swap that value with the 0th value.
        // also the k will only move when ith index have some value instead of zero
        // otherwise it will stop moving forword.

        for(i = 0; i<len; i++){
            if (arr[i]!=0){ // here we check that the value at ith index is zero or not.
                // if its zero we do not do anything.arr
                // if it is not zero .then we swap it with zero .
                
                // for swaping the zero with some array numbers. we use this swap procedure.
                temp = arr[k];
                arr[k] = arr[i]; // here we swap that value with 0th number.
                arr[i] = temp;
                k++;  // after swaping the value the kth index will we move forward.
                // for having next swap value from the ith index  and swap it will oth position.
            }
        }
    }
    
}
