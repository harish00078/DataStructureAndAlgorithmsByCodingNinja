package MileStone2.AssignmentProblemOfRecursion;

public class FIndMultiplicationUsingRecursion {

    /// here we multiplication the integer with each other using addition or substraction operators only;

    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(n == 0){
            return 0;
        }
        
         return m+multiplyTwoIntegers(m,n-1);
         // my mistake here is that i am using multiplication operator like(m*(n-1))
         // we have to simply write in this way like(m,n-1) this is also a multiplication format.
         // but here we did not use the multiplication operator: 
        

        
	
	}
    public static void main(String[] args) {
        
        System.out.println(multiplyTwoIntegers(5, 2));
    }
    
}
