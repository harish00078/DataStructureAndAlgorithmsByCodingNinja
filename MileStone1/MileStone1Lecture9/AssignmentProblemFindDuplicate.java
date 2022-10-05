package MileStone1Lecture9;

public class AssignmentProblemFindDuplicate {

    // this problem will work acc to the question or its main function file.

    public static int duplicateNumber(int[] arr){
        
        for(int j=0;j<arr.length;j++) {
            for(int k =j+1;k<arr.length;k++) {
                if(arr[j]==arr[k]) {
                    return arr[j];
                }
            }
           
        }
        return -1;
    }
     
    
}
