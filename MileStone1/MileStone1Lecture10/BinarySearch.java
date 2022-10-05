package MileStone1Lecture10;

public class BinarySearch {

    public static int binarySearch(int arr[], int ele){

        int s = 0;
        int e = arr.length -1;

        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] > ele){
                e = mid - 1;
            }else if(arr[mid] < ele){
                s = mid + 1;
            }else{
                return mid;
            }

        }
        return -1;

    }
     
    public static void main(String[] args) {
        
        int arr [] = {1,4,7,10,25,30,35};
        int index = binarySearch(arr,7);
        System.out.println("the index" + index);
    }
    
}
