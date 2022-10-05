package MileStone1lecture6;

import java.util.Scanner;



public class IsoscelesTriangleDiamondOfStarPatternProblem3 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();

        int i, j, space, decider;
        decider = row / 2;
        for (i = 0; i < row; i++) {

            if (i <= decider) { // here we print the first half of the pattern.

                for (space = i; space < decider; space++) // this for loop is used to print the spaces.
                    System.out.print(" ");
                for (j = 0; j < (i * 2) + 1; j++) // this for loop is used to print the stars for the pattern.
                    System.out.print("*");
                System.out.print("\n");
            } else {  // here we print the second half of the pattern.

                for (space = i; space > decider; space--) // this for loop also print the spaces for other of the pattern
                    System.out.print(" ");
                for (j = (row * 2) - 1; j > (i * 2); j--) //this for loop print the stars for the other half stars for the pattern
                    System.out.print("*");
                System.out.print("\n");
            }
        }

    }
    
}
