package MileStone1Lecture10;

public class InsertionSortAlgorithm {

    // here we create the function for the insertion Sort Algorithm:
    public static void insertionsort(int arr[]){

        int  n = arr.length;

        for( int i = 1; i < n; i++){ // here our loop sequnce we start from the first index value.
            //when we swap the value it will get swap on the 0th index position.

            int j = i -1;  // here j will we start from the 0th postion . because there we put out first swaping value.

            int temp = arr[i];

            while( j >= 0 && arr[j] > temp){ //this loop will do two things.
                // 1. firstly it will check that the jth value is greatar then or equal to zero.
                // 2. secondly it will check that arr[j] > temp.
                

                // if these two loop condition are true then.
                arr[j+1] = arr[j]; /// our array (j+1) value will we equal to arr[j].
                // basically this conition will check the all the sorted condition and placed the unsorted value at the right place.
                // this conition also replaced the condtions of the current positions of the sorted array values.
                // if i replace any sorted value with unsorted value . then i have check the other previous unsorted values.
                j--;// that why i use j--  here.
            }
            // position will be j +1;
            arr[j+1] = temp;
        }
    }

    
    
    
    
    
    
    // this is our print array function
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
        System.out.println(arr[i]);
    }
    }

    public static void main(String[] args) {
        
        int arr [] = {9,6,3,7,2,8,1,5};
        insertionsort(arr);
        printArray(arr);
    }
    
}
