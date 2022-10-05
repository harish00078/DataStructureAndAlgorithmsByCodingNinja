package MileStone2.AssignmentProblemOfRecursion;

public class FindGeometricSumUsingRecursion {

    // In this problem we find the geometric sum of the given value using recursion:

    public static double findGeometricSum(int k){
		// Write your code here
        if(k==0){ // here firstly check that the we have any value given from the user:
            return 1; // if we did not have any value given from the user we simply return the (1)
        }
        // IN recursion we basically divided the problem into the two part:
        // the small output will we solve by recursion .
        // we will only solve the other part.
        // basically we solve the that part of problem .which will represent the problem.
        double smallAns = findGeometricSum(k-1); // this part of the problem will we solve by the recursion.
        return (1/(Math.pow(2,k))) + smallAns; // and here we solve the other part of the problem and add with recursions smallans as per acc to the problem solution.

	}
    public static void main(String[] args) {
        
        int k = 3;
		double ans = FindGeometricSumUsingRecursion.findGeometricSum(k);
        System.out.println(ans);
    }
}
    

