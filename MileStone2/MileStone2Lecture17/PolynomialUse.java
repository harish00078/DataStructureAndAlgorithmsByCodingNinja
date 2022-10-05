package MileStone2.MileStone2Lecture17;

public class PolynomialUse {

    // here we use the polynomial function. or we can say that here we have input to the polynomial function:
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(0, 3);
        p1.setCoefficient(2, 2);
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(0, 3);
        p2.setCoefficient(2, 2);
        p2.setCoefficient(1, 4);
        p2.print();

        

        // here we add both the polynomial equations:
        p1.add(p2);
        // here we print both the polynomail equation for check  difference between them after addition;
        p1.print();
        p2.print();

        // here we use multiply function for multiplying both the polynomail equations:
        p2.multiply(p1);
        // here we print both the polynomail equation for check  difference between them after multiplication;
        p2.print();
        p1.print();

        /// we can also use add fucntion to create new polynomail equation.
        // we can add our two ploynomial equation and save tham into the third varaible in  this way we can create other polynomail equation:
        // Polynomial p3 = Polynomial.add(p1,p2);
        // p3.print();
        // // here we check the equations after creating new polynomail equation:
        // p1.print();
        // p2.print();

    


        // here we can also solve the polynomial equation:using evaluate function:
    //     int ans = p1.evaluate(10);
    //     System.out.println(ans);
    }
    
}
