package MileStone1Lecture9;


public class ProblemSwapAlternate {


    // this problem will work acc to its question or the  main function value.

    public static void swapAlternate(int arr[]) {

        for(int i=0;i<arr.length-1;i+=2) //here we use +=2 increment operator.
        //because when i do first swap i already do the first  two values. and we have to the swap the third value that why we use +=2 increment Operator.

        {
            int temp=arr[i];
            arr[i]=arr[i+1];// using this condition we swap the values with each other.
            arr[i+1]=temp;
        }
        
}


    
    
}
