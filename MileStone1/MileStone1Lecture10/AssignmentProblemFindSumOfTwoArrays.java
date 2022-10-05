package MileStone1Lecture10;

public class AssignmentProblemFindSumOfTwoArrays {
        // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.
    
    // for solving this problem we use the merge sort two array algorithm and then find there sum.

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) { 
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0; 
        int k = Math.max(arr1.length, arr2.length); 

        while(i >= 0 && j >= 0) 
        { 
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10; i -= 1; 
            j -= 1; 
            k -= 1; 
        }

        while(i >= 0) 
        { 
            int sum = arr1[i] + carry; 
            output[k] = sum % 10;
            carry = sum / 10;
            i -= 1; 
            k -= 1;
        } 

        while(j >= 0) 
        {
            int sum = arr2[j] + carry;

            output[k] = sum % 10; carry = sum / 10;
            j -= 1;
            k -= 1; 
        } 

        output[0] = carry; 
    }
    
}
