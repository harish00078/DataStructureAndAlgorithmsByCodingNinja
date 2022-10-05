package MileStone2.MileStone2Lecture17;


public class FractionUse {

     public static void main(String[] args) {
        
     // here we use the fraction class system that we created for a fraction;

     Fraction f1 = new Fraction(4,6); // here we use the fraction class to solve the fraction numbers:
     f1.print();// here we use the print function of the class to print the output of the fraction solution:

     // f1.setNumerator(12);
     // f1.getNumerator();

     // here we use increment function: if we want our fraction value or output with addition one:
    //  f1.increment();
    //  f1.print();

     // here we create other fraction :
     Fraction f2 = new Fraction(4, 8);

     // here we use the non-static function for adding the two fractional values:
    //  f1.add(f2); // here we use the adding  two fraction values fucntion: for adding two values of the fractions:
    //  f1.print(); // here we print the addition value of the two fractions:
     // here we can cleary see that in the printing statement is that we were only use f1 to print the output:
     // of the two fraction values:because we were only call the fraction add function on the (f1) fraction value:
     // and we were use the second fraction(f2) value as a addition argument Value.
     // that's why it only uses the f1 fraction to print the two fraction addition values:


     // here use the static function for adding the two fraction values:

     Fraction f3 = Fraction.add(f1, f2);
     f3.print();
    
    }
}
