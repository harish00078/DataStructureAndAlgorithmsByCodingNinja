package MileStone1Lecture9;

public class AssignmentProblemPairSum {

     // this problem will work acc to the question or its main function file.

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==x){
                    count++;
                }                   
            }          
        }                                                                   
        return count;
    }
    
}
