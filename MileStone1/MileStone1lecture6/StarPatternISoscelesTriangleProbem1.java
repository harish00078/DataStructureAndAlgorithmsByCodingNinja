package MileStone1lecture6;
import java.util.Scanner;

public class StarPatternISoscelesTriangleProbem1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int i = 1;
        while(i <= n){
            
            int spaces = 1;
            while(spaces <= n -i){
                System.out.print(' ');
                spaces = spaces + 1;
                
            }
            
            int num = 1;
            while(num <= i){
                System.out.print('*');
                num = num + 1;
                
            }
            
            int dec = i - 1;
            while(dec >= 1){
                System.out.print('*');
                dec = dec - 1;
            }
            
            System.out.println();
            i++;
        }

    }
    
}
