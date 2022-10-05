package MileStone1Lecture10;

public class AssignmentProblemRotateArray {

    // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.

    
    public static void rotate(int[] arr, int d) {
    	if(d<=0)
    return;
        if(d>arr.length)
            d=d-arr.length;
            // here we use reverse method to rotate our array. acc to the hint video.
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,arr.length-1-d);
        reverseArray(arr,arr.length-d,arr.length-1);

    }
     private static void reverseArray(int[] arr,int start,int end)
    {
        int temp;
        while(start<end){
            temp = arr[start];  
            arr[start++] = arr[end]; 
            arr[end--] = temp; 
            
        }
        }
    
}
