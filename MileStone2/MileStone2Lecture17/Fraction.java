package MileStone2.MileStone2Lecture17;

public class Fraction {

    
    // here we create a fraction class: means in this class we were try to create a fraction system:
    // here we write properties or functions those are  use for creating a fraction system:

    // firstly we have to define the numerator and denominator:

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){ // here we create a fraction class:

        if(denominator == 0){
            denominator = 1;
        }

        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // we only not gave the output of the numerator or denominator to the user .
    // we are giving them a simplify solution of the numerator or denominator:
    // simplify: simplify is basically a (gcd) or we can say that (greatest comman divisor) for  both the value numerator or denominator:
    // after finding the greatest comman divisor for both the value. we will simply divide them both with (gcd) value and gave output to the user:
    //this called the simplification of the fraction:
    // here we create the simplify function:
    private void simplify(){ // here we define simplify function with private modifier. because we did not want any other person to work on simplify . 
        // because they can break my code logic :
        int gcd = 1; // here we define gcd . by defeault gcd is (one)
        int smaller = Math.min(numerator, denominator);  /// here we create other varaible were use numerator or denominator to find  smallest number between them::
        for(int i = 2; i <= smaller; i++){ // here we use that smallest number of the numerator or denominator to finding out the (gcd) value;
            if(numerator % i == 0 && denominator % i == 0){  // here we check that at which value or number both the numerator or denominator become zero that is our gcd value:
                gcd = i; // here convert that (i) function value into the (gcd) varaible:
            }
        }

        // here we use the gcd value to simplify our numerator or denominator:
        numerator = numerator /gcd;
        denominator = denominator /gcd;
    }

    public void print(){  /// here we create the print function for printing the output or result of the fraction numbers:
        System.out.println(numerator + "/" + denominator);
    }


    /// here we write the increment fucntion if any one want its fraction value will we incremented by one:

    public void increment(){
        numerator = numerator + denominator;
        simplify();
    }

    // here we create a setter function: for numerator;
    public void setNumerator(int num){
        this.numerator = num;
        simplify();
    }
    // here we create getter function: for numerator;

    public int getNumerator(){
        return numerator;
    }




    // here we create a setter function: for denominator;
    public void setdenominator(int num){
        if(num == 0){
            return;
        }
        this.denominator = num;
        
    }
    // here we create getter function: for denominator;

    public int getdenominator(){
        return denominator;
    }



    // here we create  a function for adding two fractions:
    // we did not simply add two fractions direclty using addition operator:

    public void add(Fraction f2){  // here we create a  non-static function : to adding two fraction values:

        // first fraction is the fraction  on which function is called:
        // second fraction is passed as arguments:
 
        // here we were creating a code of mathimatical solution of adding two fraction values:
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    // we can also create static function for adding two fraction values:
    // for creating two fractional values addition function using static keyword.
    // for created add fraction function using  static keyword have to create new three variables.
    // first = were we write function for numerator(newNum);
    // secondly = were we write function for the denominator(newDeno);
    // third = weere we define two varaibles in the function.because in the third varaible we will create a another function;
    // and return that third varaible's value:
    public static Fraction add(Fraction f1, Fraction f2){

        int newNum = f1.numerator *f2.denominator + f1.denominator * f2.numerator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }


}
