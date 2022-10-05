package Milestone1Lecture5;

import java.util.Scanner;


public class TriangleReverseNumberPatternprobelm {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;
        while(i <= n){
            int counter = i; // here we gave a another variable to the program to print the pattern.
            // we converted this pattern into i.
            //because we did not use the i variable for this pattern output directly.
            // because if we minimize value to print the pattern using i then our rows sequnce will we disturbed.
            // thats why we create a new varaible for using the decremental values.
            int j = 1;
            while(j <= i){
                System.out.print(counter);
                counter--; // here it decrement the values by one;
                // like-> like if we want to print 2 1:
                // when i = 2: then counter firstly print 2 and then print 2-1 = 1.in this way we can print that 2 1 sequnce.
                j++;
            }
            System.out.println();
            i++;

        }
    }
    
}
