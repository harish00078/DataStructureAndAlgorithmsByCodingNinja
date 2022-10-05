package MileStone2.MileStone2Lecture19;

 /// here we these lecture 18 files because further about the  oops concept in lecture 19:

public abstract class  Car extends Vehicle { // here we use extend function to connect this child class with parent class(vehicle);

    // here we create a simple child class funcion:
    int numDoors;
    int numGears;

    public Car(){
        // System.out.println("car is constructor");
        numDoors = 4;
        numGears = 5;
    }

    
    // int numDoors; // here it has its extra property as compare to other child classes
    
    // // we can also create a extra different print statements for each child class:
    // public void printCar(){ // here we create a  different print function for speacily car class:
    //     System.out.println("car " + " color " + getColor() + " maxspeed " + maxspeed + " numDoors " + numDoors);
    // }



    // but if we create a print function for the child  class and  it will have some name as parent class (print) function;
    // then what will happen:
    // here we create the print function for child class(name) as the same name of the parent class print function:
    
    // in this situation how the print statement work in the system: this sequnce is known as (function overloading).
    // 1. here it firstly check the print statement of the child class.if child class have it own print statement.
    // then it will print that statement:
    //2. if child class did not have its own print statement then it will use the print statement of the parent classs.
    // public void print(){ 
    //     System.out.println("car " +" numDoors " + numDoors);
    // }


    // topic: super keyword:super keyword is also a  parent  class. super keyword is used if we want to print the child classes values.
    // that we enterted in the parent class. in the child it self:
    // means using super keyword we can print the parent class values in the child class values:

    public void print(){ 
        super.print();  // here we use the parent class in the form of (super) keyword for print the other values of the car class:
        System.out.println("car " +" numDoors " + numDoors);  // like here we only print the number of doors of  the  child class propety using  its own print statement:
        // but we also want to print all the other values of the car classs that we enterd in the parent class:
        //  but i want to print that values before the car class print statement: that were we use (super) keyword:
    }

    // other example of the super keyword:
    int maxspeed;  /// this is the different varaible for the car child class. as we compare this with  in the parent class:
    public void printMaxSpeed(){  //// this function will only print the car class values. not print the car child  class value in the paerent class print function:
        // parent class class print function will gave us a zero instead of returing the maxspeed varaible value:
        /// because when we print these all print statements.the system will firslty print the car print statement and when it reaches the parent class:
        //print statement it have a zero value:that why we use super keyword to print the output  of the parent class that we gave to the child class on the parent class with the same variables:
        // we can also set the value of the super keyword variable: like for maxspeed variable:
        super.maxspeed = 150;
        System.out.println(maxspeed + " " + super.maxspeed);
    }

    // topic constructor with inheritance:
    /// here we check that how the condtructor will work with inheritance:

    
    // here we firsty create a defautl constructor for the child class:

    // car() this is we callled a constructor. or we can aslo called it empty constructor
    public Car(int numDoors,int maxspeed){  // here we have the error when our parent classs create its own constructor with the arguements:
        super(maxspeed); // in this situation we will basically call the super keyword and gave agrument value to the parent classs in the child class:
        //if we did not want to use the super keyword direclty in this situation then but we have to do:
        // we have to also gave same argument to the child that we gave in the parent class: 
        // and connect that argument with the super keyword:
        // using this way we also have one benegfit that user can gave the value to the each varaible it self:
        System.out.println("car's constructor");
        this.numDoors = numDoors;
    }





    /// here we work on the lecture 19 topics:



    // here we working on the topic of (abstract) method:
    /// if we are use here absract parent class then we have here two:
    // 1. we can also convert this child class into the abstract class:
    // 2. or we can complete this child class. using the parent class abstract method here and gave him a value:
    // and this is but we from  user who create a car class or use vehicle as  a parent class:
    // this is the meaning of the abstract method:

    //  here we use abstract method:

    @Override
    public boolean isMotorized() {
        // TODO Auto-generated method stub
        return true;   // here user will gave the output:
    }

    


    
}
