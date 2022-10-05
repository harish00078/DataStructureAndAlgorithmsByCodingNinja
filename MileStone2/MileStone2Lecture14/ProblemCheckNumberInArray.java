package MileStone2.MileStone2Lecture14;

import java.util.Scanner;

public class ProblemCheckNumberInArray {

    public static boolean checkNumber(int input[], int x) { ///  here we add other value in this function is that  index value.
        return checkNumber(input, x, 0);  // here we return our index value;
    }
    
    public static boolean checkNumber(int input[], int x, int index) { // here we create other function were we use the index value:
        if(index == input.length){ // here we use the index value for define the length of the array.
            return false; // if array is out of index then return false;
        }
        
        if(input[index] == x){  // here we check the first value of the array .that it is equal to (x) value or not.
            return true; // if it is equal to (x) then we will return true;
        }
        
        return checkNumber(input, x, index + 1); // here we increment our index value by one . and aslo compare then with (x).
    }

    

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(ProblemCheckNumberInArray.checkNumber(input, x));
	}
    
}
