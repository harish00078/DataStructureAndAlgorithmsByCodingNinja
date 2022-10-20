package MileStone4.MileStone4Lecture35;


public class InplaceHeapSort {

    // here we are sorting the Array using the (inplaceHeapSort) algorithm:
    public static void heapSort(int arr[]){

        // here we Build the Heap:
        int n = arr.length;
        /// here we use downHeapify function for buliding heap:
        for(int i = (n/2)-1; i>=0; i--){ //that's why here we are moving from down to upwards: 
            downHeapify(arr,i,n); 
        }
        //after buliding heap:
        // we are removing elements from starting one by one, and put them at respective last position:
        // for sorting the Array:
        for(int i = n-1; i >=0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr,0,i);

        }

    }

    // here we are creating the downHeapify function:
    public static void downHeapify(int []arr, int i, int n){

        int parentIndex = i;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        while(leftChildIndex < n){
            int minIndex = parentIndex;
            if(arr[leftChildIndex] < arr[minIndex]){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < n && arr[rightChildIndex] < arr[minIndex]){
                minIndex = rightChildIndex;
            }
            if(minIndex == parentIndex){
                return;
            }

            /// here we are swaping the values:
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;

            // after swaping the value: our MinIndex swapping will we become our next parentIndex:
            parentIndex = minIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;

        }

    }

    public static void main(String[] args) {
        
        int arr[] = {4,7,3,2,8,9,6,1};
        heapSort(arr);
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
