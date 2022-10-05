package MileStone2.MileStone2Lecture14;
import java.util.Scanner;

public class ProblemSumOfArray {

    public static int sum(int input[], int startIndex) {
		if(startIndex == input.length) { // here we gave him a base case.
            // if we start from 0th index then return 0;
			return 0;
		}
		return input[startIndex] + sum(input, startIndex + 1); // here we add 0th index with the sum of other index values ;
	}
	public static int sum(int input[]) { // here we create other function .
		return sum(input, 0); // here we define input and 0th index.
	}
    public static void main(String[] args) 
    {
        
       Scanner s = new Scanner(System.in);

	
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(ProblemSumOfArray.sum(input));
	}
    
    
}
