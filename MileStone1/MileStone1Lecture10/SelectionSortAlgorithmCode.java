package MileStone1Lecture10;


public class SelectionSortAlgorithmCode {

    // how we write code for the selectionsort:

    // here we create the function for the printing the sort Array:
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
        System.out.println(arr[i]);
    }
    }

    // here we write the function for selection sort algorithm: using selection sort we sort our array;
    public static void selectionsort(int arr[]){
        int n = arr.length; // here we define the array loop sequnce using arr.length funtion:

        for(int i = 0; i < n-1; i++){  // this loop will do the index loop sequnce. it will go on all the index values one by one:

            int min = Integer.MAX_VALUE; // here we define arrays minimum value is max_value mean (it is infinity).
            // because array values could we go infinity. that why we use max_value.
            // also use for define the number sequnce of the array:
            int minIndex = -1; // here we define the min index of the array. 
            // we define min index because we want to swap between the two values.
            // that why we use index value to swap between the two values.
            // and start from -1 because in index we also consider the 0th index value:
            for(int j = i; j < n; j++){  // here we use other loop that will check the minimum value in the array:
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }

            } 
            // after checking the numbers using loops . we swap the two  values with each other;
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {

        // 1. firstly we have to gave him a array. or take array input the user:
        int arr [] = {1,6,4,8,0,3};

        // 2. secondly we have to create the function for the array sort:
        selectionsort(arr);

        // 3/ after all these we have to print the sorted array:
        printArray(arr);
    }
    
}
