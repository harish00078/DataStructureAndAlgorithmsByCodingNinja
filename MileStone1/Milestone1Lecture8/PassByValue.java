package Milestone1Lecture8;

public class PassByValue {

    // another example of how the pass by value work in functions.
    // when do any thing in coding we have to stricly focus few things like:
    // 1. one of then this coding sequnce. and but we have in that sequnce.
    // 2. because our code will work acc to the code sequnce.
    // like in this example we see that how the pass by value work acc to the code sequnce.
    // and how the function works under these things.

    public static void c(int n){  // forthly after checking (b) function we are on the (C) function.
        System.out.println("inside c" + n); // but in printing statement we are going from top to bottom.
        // like firstly we print c after that b and then we print a.
        // afte all these finally we print the main function print statement.
        n++;
    }
    public static void b(int n){  // thirdly after checking (a) function we are on the (b) function.
        c(n);
        System.out.println("inside b" + n);
        n++;
    }
    public static void a(int n){ // secondly after checking the sequnce from the main function we jump on the (a) function.because that is given in the main function.
        b(n);
        System.out.println("inside a" + n);
        n++;
    }


    public static void main(String[] args) {
        int n = 10; /// like firslty we check the value of the main function.
        a(n); //after that we check the sequnce of the function in the main function.
        // here we can see that  we have to jump on the (a) function that we created.we did not jump on the top fucntion acc to the criteria given by the main function.
        // this means that in coding we always have to work acc to the given sequnce.
        System.out.println("inside main" + n);
    }



    // public static void increment(int n){
    //     n++; //here it will not gave us a value beacuse we did not use the any print method.
    //     // thats why when we go on the main method we have a same output as we gave in the input.
    //     System.out.println(n);// when we gave him a print statement then it will gave us  a output in the main function.
    // }
    // public static void main(String[] args) {  

    //     //this main method will only gave us a (10) output not (11).
    //     //because of the pass by value
    //     int n = 10; 
    //     increment(n); // here it will not print the value because in function we did not gave him a any print statement.
    //     System.out.println(n);// that why it print this main function statement only.
    // }
    
}
