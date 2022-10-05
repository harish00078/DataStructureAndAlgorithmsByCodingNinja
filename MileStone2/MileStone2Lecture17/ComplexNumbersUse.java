package MileStone2.MileStone2Lecture17;

public class ComplexNumbersUse {

    public static void main(String[] args) {
        
        ComplexNumbers c1 = new ComplexNumbers(2, 3);
        // c1.print();
        
        ComplexNumbers c2 = new ComplexNumbers(2, 4);
        c2.multiply(c1);
        c2.print();
        
    }
    
}
