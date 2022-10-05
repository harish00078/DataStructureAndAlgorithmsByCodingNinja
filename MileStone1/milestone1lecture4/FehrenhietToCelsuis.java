package milestone1lecture4;

import java.util.Scanner;

public class FehrenhietToCelsuis {

    public static void main(String[] args) {
        
        
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
