package Milestone1Lecture5;
import java.util.Scanner;

public class TrianglePattern2 {

    public static void main(String[] args) {
        
        Scanner  s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        
        int i = 1;
        while(i <= n){
            int p = i;  // here we convert our p in the i.because it will do two things for the sequnce.
            //1. it will do the addition sequnce for our pattern.
            //2. and also always start the new column with previous columns last number.
            int j = 1;
            while(j <= i){  // here we compare the j with i. beacuse we only want the values one by one.
                System.out.print(p); // here it print the addition values.
                p++; // here it complete the addition sequnce. 
                j++; 
            }
            System.out.println();
            i++;
        }
    }
    
}
