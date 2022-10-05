package MileStone1Lecture10;

public class BubbleSortAlgorithm {

    // here we created our bubble sort algorithm function.
    public static void bubblesort(int arr []){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){ /// here n -1 represent that we have to run our loop till the n -1 index.
            for(int j = 0; j < n - 1- i;j++){ // here in this loop we use (n - 1 - i). because after compliting the each round we have not count the last value of  the array. 
                // because that is sorted in previous round or previous loop  iteration.
                if(arr[j] > arr[j+1]){ // here we check that the fisrt value  of array is greatar than the second value.
                    // if first value is greatar than the second value . then we can swap between both values.
                    // that here arr[j] represent the first array value or comparison and arr[j+ 1] means second array value of comparison.
                    int temp = arr[j]; // here we swap the values .
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

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
        
        int arr [] = {1,7,4,3,9,2,6};
        bubblesort(arr);
        printArray(arr);
    }
    
}
