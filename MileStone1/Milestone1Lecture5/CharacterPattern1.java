package Milestone1Lecture5;

import java.util.Scanner;

public class CharacterPattern1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n){
                char jthchar = (char)('A' + j - 1); //in this the method that print the square charcter patterns.
                System.out.print(jthchar);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
