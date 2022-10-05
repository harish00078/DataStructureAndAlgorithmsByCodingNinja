package MileStone1Lecture10;

public class AssignmentProblemFindSecondLargestElementInArray {

    // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.
    
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(secondLargest<arr[i]&&arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
