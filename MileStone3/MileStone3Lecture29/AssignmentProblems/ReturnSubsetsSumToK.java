package MileStone3.MileStone3Lecture29.AssignmentProblems;

import java.util.Scanner;



public class ReturnSubsetsSumToK {

    
    // this is the constructor that i have given to solve this problem:
    // we are not able to solve problem in this given constructor:
    // so that why i create the other constructor to solving this constructor:
    // with the name of the (subsetsSumHelper):
    // using this method we can also learn a thing that we can use the one constructor into the other constructor: 
    public static int [][]subsetsSum(int input[], int k){
        return subsetsSumKHelper(input,0, k);
    }

    // here we are creating the helper constructor for this problem:
    public static int [][] subsetsSumKHelper(int [] input, int beginIndex, int k){
        if(beginIndex == input.length){
            if(k == 0){
                return new int[1][0];
            }else{
                return new int[0][0];
            }
        }

        int [][] smallOutput1 = subsetsSumKHelper(input, beginIndex + 1, k);
        int [][] smallOutput2 = subsetsSumKHelper(input, beginIndex + 1, k - input[beginIndex]);
        int [][] output = new int[smallOutput1.length + smallOutput2.length][];
        int index = 0;
        for(int i = 0; i < smallOutput1.length; i++){
            output[index++] = smallOutput1[i];
        }
        for(int i = 0; i < smallOutput2.length; i++){
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = input[beginIndex];
            for(int j = 0; j < smallOutput2[i].length; i++){
                output[index][j + 1] = smallOutput2[i][j];

            }
            index++;
        }
        return output;



    }

    // this is the main class that has been created by me:
    // public static void main(String[] args) {
        
    //     int [] input = {2,3};
      
    //     int output [][] = subsetsSumKHelper(input,0,8);
    //     for(int i = 0; i < output.length; i++){

    //         for(int j = 0; j < output[i].length; j++){
    //             System.out.println(output[i][j] + "");
    //         }
    //         System.out.println();
    //     }        
    // }
     

    // this is the main class that has been imported from the (codezen):

    // public class runner {
    //     static Scanner s = new Scanner(System.in);
    //     public static int[] takeInput() {
    //         int size = s.nextInt();
    //         int arr[] = new int[size];
    //         for (int i = 0; i < size; i++) {
    //             arr[i] = s.nextInt();
    //         }
    //         return arr;
    //     }
        
    //     public static void main(String[] args) {
    //         int[] input = takeInput();
    //         int k = s.nextInt();
    //         int output[][] = solution.subsetsSum(input, k);
    //         for(int i = 0; i < output.length; i++) {
    //             for(int j = 0; j < output[i].length; j++) {
    //                 System.out.print(output[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }



    
}

