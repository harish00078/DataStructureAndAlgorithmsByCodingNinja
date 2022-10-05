package milestone1lecture2;

import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {
        // => If we want to take the  input from the user we were use the "Scanner method".
        int m1,m2,m3;

        Scanner s = new Scanner(System.in);

        String str = s.nextLine(); // if we want the string as a imput from the user. for taking string from the user we were only use the (nextline)function.
        char ch = str.charAt(0); //there is not a direct way of having a input of character from the user that why we use this system. we will convert the string into the character by using the counting system.
        
        // System.out.println(ch);
        // System.out.println(str);

        m1 = s.nextInt();

        m2 = s.nextInt();

        m3 = s.nextInt();


        int c  = (m1 + m2 + m3) / 3;
        System.out.println(ch);
        System.out.println(c);





        // int a, b;

        // Scanner s = new Scanner(System.in);

        // // system.in => the (in) represent here the input.
        //     a = s.nextInt(); // int is use for if we want the input from the user  in the form of the integer.
        //     b = s.nextInt();
        
        // int c = a + b;
        // System.out.println(c);

        




    }
    
}
