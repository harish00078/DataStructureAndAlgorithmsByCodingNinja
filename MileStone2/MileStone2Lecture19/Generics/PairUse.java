package MileStone2.MileStone2Lecture19.Generics;

public class PairUse {

    public static void main(String[] args) {

        // here we create Pair under the pair:
        // in this way we can create the pair under the pair:
        // Pair<String,Integer> pInner = new Pair<String,Integer>("ab", 100);
        Pair<Pair<String,Integer>,String> p = new Pair<>();  // this is our pair
        // in this pair i can only access the String values: because In this pair i only use the String Datatype:
        Pair<String,Integer> pInner = new Pair<String,Integer>("ab", 100); // this is our pair under the pair:
        /// In this way we can acccess the pair values:
        /// In simple pair i only call the String Datatype That why here i am only able to use the String datatype:
        p.setFirst(pInner); 
        // System.out.println(p.getFirst());
        // p.setSecond("abcd"); 
        // System.out.println(p.getSecond());
        // in this way we can access the pair under the pair values:
        System.out.println(p.getFirst());// here we firstly see that we call the simple pair value of the first element:
        // and here we call the first paris.under first value or second value:
        System.out.println(p.getFirst().getFirst()); //here we get the first pair under first values:
        System.out.println(p.getFirst().getSecond());// here we get the second pair under second values:


        // here we use the two datatypes in the one  pair:
        // Pair<String, Integer> pSI = new Pair<String,Integer>("ab", 10);
        // In this example we can clearly see that we are using two datatype in one pair through the generic class:
        // System.out.println(pSI.getFirst() + " " + pSI.getSecond());
        // // here we can see that we can  also use  generic class throught the default constructor:
        // Pair<String> p = new Pair<>(); // here we can seee that here we are using the default consturctor.not that we are creted for the generic class:

        // p.setFirst("abc");  // here we gave first value to the pair:
        // System.out.println(p.getFirst() + " " + p.getSecond());

        
        /// if we try this way or simply way to use the generic class.then it will gave us a error:
        // Pair p = new Pair(10,20);
        // System.out.println(p.getFirst() + " " + p.getSecond());


        // in this way we can use the generic class:
        // here we can cleary see that  we can define the datatypes acc to our prefrences;
        // like we do in this example: 
        // here we use string data types:
        // Pair<String> ps = new Pair<String>("aa","bb");
        // System.out.println(ps.getFirst() + " " + ps.getSecond());

        // // we can do for the int data types:
        // Pair<Integer> pI = new Pair<Integer>(10, 20);
        // System.out.println(pI.getFirst() + " " + pI.getSecond());

        // // we can also do for the double datatypes:
        // Pair<Double> pD = new Pair<Double>(10.1, 20.1);
        // System.out.println(pD.getFirst() + " " + pD.getSecond());

    }
    
}
