package MileStone1Lecture9;

import java.util.Scanner;

public class MoreAboutDataTypes {

    

    public static int [] takeInput(){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("enter element of " + i + "ith index");
            arr [i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int [] arr = takeInput();
        System.out.println(arr);  // here we check the refrence number or memory address of the [arr] varaible.
    }
    
 

}
