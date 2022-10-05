package Milestone1Lecture7;

import java.util.Scanner;

public class AssignmentProblemCheckNUmberSequnce {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          
            if(i+1 !=arr.length && arr[i]<=arr[i+1]){
                if(i+2 !=arr.length && arr[i+1]>=arr[i+2]){
                System.out.println("false");
                return;
                }
            }
        }
        System.out.println("true");
    }
    
}
