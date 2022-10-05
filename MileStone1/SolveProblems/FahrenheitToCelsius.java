package SolveProblems;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        
        while (S <= E){
            int celcius = (int)((S - 32) * (0.55556));
            System.out.println(S+"\t"+celcius);
            S = S + W;
        }
	}

}

