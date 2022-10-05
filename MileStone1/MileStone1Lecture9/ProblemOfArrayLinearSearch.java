package MileStone1Lecture9;

public class ProblemOfArrayLinearSearch {


    /// this problem work acc to its question or main function file . that is only on the coding  ninja studio.

    public static int linearSearch(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){  // here it check that we have the x number index in the arr[]
                return i; // here it print that index values of the  x index  number.

            }
            
        }
        return -1;
    }
    
    
}
