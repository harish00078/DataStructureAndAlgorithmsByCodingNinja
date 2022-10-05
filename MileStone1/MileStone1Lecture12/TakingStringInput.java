package MileStone1Lecture12;
import java.util.Scanner;

public class TakingStringInput {

    public static void main(String[] args) {

        // scanner will work in the pattern of token.
        // it basically use values in the form of the tokens and acc to the delimeter.
        // for example : if we have a string is " harish kumar" . in this string basically we have a space in between this string.
        // that space is called as a delimeter.
    
        Scanner s = new Scanner(System.in);
       
        // int i=s.nextInt();
        
        // we print this example:

        String str = s.next(); // like here we print this example. we can clearly see that the scanner use the values in the form of tokens
        System.out.println(str);

        String str2=s.nextLine();  /// in scaanner we did not get hole line of the example. because in example we have space between the words.
        // and scanner gave the value in the form of the token.
        
        System.out.println(str2+" "+str2.length());
    }
    
}
