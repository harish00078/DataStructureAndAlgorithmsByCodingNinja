package MileStone2.MileStone2Lecture17;

public class ComplexNumbers {

    public int real;  // here we create  real varaible;
    public int imaginary; // here we create imaginary variable;
    public ComplexNumbers(int real, int imaginary) // here we create function for the complex number.
    // using real number or imaginary number:
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public void plus(ComplexNumbers c)  // here we create plus function to add the real number or imaginary number:
    { 
        // here we use the (c) variable or convert our real or imaginary values into the  (c):
        // so we can access our values of the real or imginary variables into the (c) varibles: 
        // or in other varibles  that we want to  use:
        int real=this.real+c.real;
        int imaginary=this.imaginary+c.imaginary;
        this.real=real;
        this.imaginary=imaginary;

        
    }
    public void multiply(ComplexNumbers c) // here we create function for multiply the real number or imaginary number:
    {
         // here we use the (c) variable or convert our real or imaginary values into the  (c):
        // so we can access our values of the real or imginary variables into the (c) varibles: 
        // or in other varibles  that we want to  use:
        int real=(this.real*c.real)-(this.imaginary*c.imaginary);
        int imaginary=(this.real*c.real)+(this.imaginary*c.imaginary);
        this.real=real;
        this.imaginary=imaginary;
    }
    public void print()  // here we create the print function.
    {
        System.out.print(real+" "+"+  "+" "+"i"+imaginary); //(a + ib) here we print output  using this equation:
    }
    
}
