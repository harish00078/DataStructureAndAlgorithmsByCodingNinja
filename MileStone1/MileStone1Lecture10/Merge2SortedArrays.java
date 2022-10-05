package MileStone1Lecture10;


public class Merge2SortedArrays {
    // here we created a function for merging two sorted arrays.

    public static int [] merge2SortedArrays(int [] arr1, int [] arr2){ // here we use int [] of Array function because under this function.
        // we have to create a thid array that why we use int [] array function.

        int m = arr1.length;
        int n = arr2.length;
        int [] arr = new int[m+n];  // here we created a third array.
        
        // In this funcion we have three array that why we define that varaibles index values.

        int i = 0; // here we have value of our first arr1 index.
        int j = 0; // here we have valueo of our second arr2 index.

        int k = 0; // here we have value of our third arr3 index.

        while(i < m && j < n){ // her we gave the loop sequnce criteria to the first two arrays.

            if(arr1[i] <= arr2[j]){ // here we check that if arr1 have less value than the arr2.
                arr[k] = arr1[i]; // then we put that value in the arrk.
                i++; // increment the index by one after checking the value
                   k++; // here we increment the index by one after putting the value.
            }else{ // if first condition is not true.
                arr[k] = arr2[j]; // then we put arr[j] value at arr[k].
                // first condition not true means that arr[j] values is smaller than the arr[i] value.
                // that why we put that value arr[j] value at the arr[k]
                j++;
                k++;
            }
        }
        while(i<m){  // our ith loop sequnce will complete before complete all the values of the arrary.
            // we can simple put that values at the arr[k]
            arr[k] = arr1[i]; // here we put all the values at arr[k] those were left in the arr[i] 
            // here we also increment the i++ index or k++ index beacuse . we want that all value were placed at right position.
            i++;
            k++;
        }
        while(j<n){ // our jth loop sequnce will complete before complete all the values of the arrary.
            // we can simple put that values at the arr[k]
            arr[k] = arr2[j];// here we put all the values at arr[k] those were left in the arr[j] 
            // here we also increment the j++ index or k++ index beacuse . we want that all value were placed at right position.
            j++;
            k++;
        }
        return arr;
    }

        
    // this is our print array function
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
        System.out.println(arr[i]);
    }
    }


    public static void main(String[] args) {
        
        int arr1 [] = {1,4,8,10,13,17};
        int arr2 [] = {2,3,5,7,9,11,12};

        int arr3 [] = merge2SortedArrays(arr1,arr2);
        printArray(arr3);
    }
    
}
