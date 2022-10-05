package Milestone1Lecture7;

public class PrecedenceAndAssociativity {

    public static void main(String[] args) {
        
        int i = 6;
        int j = 8;

        
        
        // precedence example:

        boolean a = i + 5 > 5 && j > 6;  // here we have different operators.
        System.out.println(a);


        // associativity example:

        int c = 5 * (2/8);  // here we have one operators different types.
        System.out.println(c);




    

    }
    
}
