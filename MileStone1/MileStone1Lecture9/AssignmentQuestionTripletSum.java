package MileStone1Lecture9;

public class AssignmentQuestionTripletSum {

    // this problem will work acc to the question or its main function file.

    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        
             int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int y = j + 1; y < arr.length;y++){
                        if(arr[i]+arr[j]+arr[y] == x){
                    count++;
                }
            }
                
            }
        }
                                                               
        return count;
    
    }
    
}
