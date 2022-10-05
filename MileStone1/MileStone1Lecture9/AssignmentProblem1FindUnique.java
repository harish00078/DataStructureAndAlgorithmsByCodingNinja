package MileStone1Lecture9;

public class AssignmentProblem1FindUnique {

     // this problem will work acc to the question or its main function file.

    
    public static int findUnique(int[] arr){
        //Your code goes here

        for(int i=0;i<arr.length;i++){  // here we created a first loop . to goo through all the arr index values.
            int count=0; // here we use count function to check that our loop find the unique number not.
            // basically count will check the how many time we go from the both loop: to check or find the unique numbers.
            for(int j=0;j<arr.length;j++){ // here we created a second loop. to go through all the arr index values.
                if(i!=j){  // here we compare boht arrays values. that we have the same  number in these both arrays or not.

                    if(arr[i]==arr[j]){ // if the value is same on the both arrays loops. then we jump on the other loop sequnce.
                        // using count function.
                        count++;
                    }
                }
            }


            if(count==0){  // if the both arrays loops does not have the same value.

                return arr[i];  // then we print that  value because that it our unique number.
            }

        }
        return -1; /// if we did not find the any unique number then we return the value of -1:

    }
    
}
