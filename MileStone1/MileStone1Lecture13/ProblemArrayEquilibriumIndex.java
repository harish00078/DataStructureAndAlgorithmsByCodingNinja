package MileStone1Lecture13;

public class ProblemArrayEquilibriumIndex {

    
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        int ts =0,i=0;
        while(i<arr.length){
            ts += arr[i];
            i =i+1;
        }
        int leftSum =0,index=0;
        int rightSum=0;
        while(index <arr.length){
            rightSum = ts-leftSum-arr[index];
            if(rightSum == leftSum){
                return index;
            }else
                leftSum = leftSum + arr[index];
            index =index +1;
        }
        return -1;
	}
    
}
