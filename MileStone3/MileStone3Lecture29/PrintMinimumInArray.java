package MileStone3.MileStone3Lecture29;

public class PrintMinimumInArray {
    
    
    // this is our old: find minimum in the Array  function:
    // this is the returning value function:
    public static int findMin(int [] input, int startIndex){
        // this is our base case:
        // if our startIndex check is equal to the input value:
        // means we did not have any value given:
        if(startIndex == input.length){
            return Integer.MAX_VALUE; // we can simply return Integer.max_value:
        }

        // if this is not the case:
        // then we can call recursion on the startIndex + 1 to last Index values:
        // for findind that which is the smallest value:
        // after findind that smallest value between them: 
        // we simply compare that value with the startIndex value or we can say that the 0th index value:
        int minSmallArray = findMin(input, startIndex + 1);
        if(input[startIndex] < minSmallArray){ // here we compare the startIndex value with the recusrion value:
            // if the startindex value is smaller than the recusrion value:
            return input[startIndex]; // then  we simply return that startIndex value:
        }else{ // if that not the case:
            return minSmallArray;// then we simply return recursion value:

        }

    }

    // but here we are creating the (find minimum in the Array) function:
    // those function are not returning any value:
    // they are just printing the values:
    // and here we can create that function in the two ways:

    // first way:
    // this first method or function is basically use the old function to find the minimum in the array:
    public static void printMin1(int [] a){
        int min = findMin(a, 0); /// here we are using old return type  find minimum in the array fucntion:
        System.out.println(min); // and after finding the minimum in the array: using the old fucntion:
        // we simply print that minimum array value:
    }

    // second way:
    // here we are create the new find minimum in the array function: that will only print the value not return it:
    public static void printMin2(int [] a, int startIndex, int minSofar){
        // here we have our base case:
        if(startIndex == a.length){
            System.out.println(minSofar);
            return;

        }
        int newMinimum = minSofar;

        if(a[startIndex] < minSofar){
            newMinimum = a[startIndex];
        }
        printMin2(a, startIndex + 1, newMinimum);
    }


    public static void main(String[] args) {
        int a[] = {3,4,2,1,7,8};
        // int min = findMin(a, 0);
        // System.out.println(min);

        printMin2(a, 0, Integer.MAX_VALUE);
    }

}
