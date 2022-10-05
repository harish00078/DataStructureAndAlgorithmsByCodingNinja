package MileStone1Lecture10;

public class AssignmentProblemSort012 {
    // int this problem we have to sort three numbers 0,1,2:

      // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.

    public static void sort012(int[] arr){
    	//Your code goes here

        // here we have to sort the three number 0,1,2;
        // if we sort the two number the third number will be sorted automatically;
        // that two numbers  are 0 and 2. because the 0 is on first of the array. and 2 is on the last of the array.
        // in this way sort these three numbers

        
        int nextZero = 0;
        int nextTwo = arr.length - 1;
        int i = 0;
        while(i <= nextTwo){
            if(arr[i] == 0){  /// here we sort the all zeros.
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;
                nextZero++;
            }else if(arr[i] == 2){  // here we sort the all 2 number values.
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            }else{
                i++;
            }
        }
    }
    
}
