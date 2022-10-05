package MileStone1lecture6;

import java.util.Scanner;

public class OddSquarePatternAssignmentProgram {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int num =1;
		while(i<=n) {
			num = 1 + (i-1)*2;
			int j = 1;
			while(j<=n-i+1) {
				System.out.print(num);
				num = num + 2;
				j++;
			}
			int dec = i-1;
			num = 1 ;
			while(dec>=1) {
				System.out.print(num);
				num = num + 2;
				dec--;
			}
			System.out.println();
			i++;
		}
    }
    
    
}
