package Milestone1Lecture5;

import java.util.Scanner;

public class TrianglePattern1 {



    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

        int n;

        n = s.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){   // here we compare j with i for completing our triangle pattern.
                // always focus on the loop working pattern.
                //like in (j):-> this is very important point.
                //1. when i is one j is only represent one.
                //2. when i is two j will repersent two values like 1,2.
                //3. when i is three j will represent three values like 1,2,3.
                //4. because j will only completed  loop when it completed all the value system.for each column.
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
  

        
        

    }
    
}
