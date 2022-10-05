
package MileStone1Lecture13;

import java.util.Arrays;

public class ProblemArrayIntersectionOptimalSolution {

     // here we write the optimisation code for the array intersection fucntion

    public static void intersection(int[] arr1, int[] arr2) 

    
    {
        Arrays.sort(arr1); 
        Arrays.sort(arr2); 
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        //pointer to iterate over arr1 
        int j = 0; 
        //pointer to iterate over arr2
        while(i < n && j < m) 
        {
             if(arr1[i] == arr2[j]) 
        { 
            System.out.print(arr1[i] + " ");
         i += 1; 
         j += 1; 
        }
     else if(arr1[i] < arr2[j])
       { 
          i += 1;
        }else 
        {
            j += 1;
        } 
        }
    }
    
}
