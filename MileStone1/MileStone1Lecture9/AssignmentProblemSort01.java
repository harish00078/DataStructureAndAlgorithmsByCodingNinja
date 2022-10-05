package MileStone1Lecture9;

public class AssignmentProblemSort01 {

    // this problem will work acc to the question or its main function file.

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int nz = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int temp = arr[nz];
                arr[nz] = arr[i];
                arr[i] = temp;
                
                nz++;
            }
        }
    }
    
}
