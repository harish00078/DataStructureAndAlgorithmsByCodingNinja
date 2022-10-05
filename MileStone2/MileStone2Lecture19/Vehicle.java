package MileStone2.MileStone2Lecture19;

 /// here we these lecture 18 files because further about the  oops concept in lecture 19:

public abstract class Vehicle {

    /// we can also use final keyword in the class:but this will show the error in all the child clases.
    // because the final keyword convert our class in the ristriction mode:
    // and no one will have access of it that why alll the child classes through the error:
 
    // here we write the comman properties those were same in the most of the vehicles:
    // this properties were use by other child classes:
    // this is the benefit of the inheritamce that we did not have to write a same code again and again:
    private String color; // we can also do convert the properties of the parent class into private so child classes will not able to break my  logic.
    // if child classes want the access of the private property. they can use the getter and setter function: to put the our values in the private property;
    // this will no harm my logic: 
    protected int maxspeed; 
    // topic: protected modifier:
    //1. Protected members can be accessed from the child class of the same package.
    //2.Protected member can be accessed from non-child classes of the same package.
    //3.Protected members can be accessed from the child class of the outside package, but we should use child reference only. 
    //4.Protected members cannot be accessed from the non-child class of outside package
    //5.Protected modifier is more accessible than the package and private modifier but less accessible than public modifier.

    // here we create a simple vehicle class:
    public Vehicle(){
        color = "red";
        // System.out.println("vehcle is constructor");
        maxspeed = 60;
    }

    // here we  create getter function for the child classes so they can have the access of the private property: so they can get the value they set of the private property:
    public String getColor(){
        return color;
    }

    // here we  create setter  function for the child classes so they can have the access of the private property: or set there on value for the private property
    public void setColor(String color){
        this.color = color;
    }

    // here we create  a print function for printing all the classes those were conneced with the parent class:

   
    public void print(){ /// when we convert our base class print statement into (final) keyword:
        // topic:final keyword:
        // when we use final keyword on the print statement of the parent class then it will through error on all the chiild class;
        // print function because all the child classes printing by a parent class: and we gave security to our parent class using final class:
        //  thats why all the child classes through the error:
        
        System.out.println("vehicle " + " color " + color + " maxspeed " + maxspeed);
    } 

    // here we also create a constructor for the vehicle or we can say that for the parent class:
    public Vehicle(int maxspeed){ // like here we create our own constructor.so when we create owr own constructor with it own argument values this will remove the default.
        // constructor that we have with the system
        // that why it throwing us a error in the all other child classs:
        System.out.println("Vehicle's constructor");
        this.maxspeed = maxspeed;
    }

    

    







    //// Here we start the lecture 19 topics:

    // topic: abstract keyword:IN abstract keyword we have basically two things:
    // 1. abstract class: An abstract class can be  considered as blue print for other classes:
    // abstract classes are classes that contain one or more abstract methods:

    //2. abstract method:An abstract method is a method that has a declaration but does not have an implementation:
    // this set of methods must be created with in any child classes which inherit from the abstract class.
    // a class that contains  one or more abstract methods is called an abstract class:
    public abstract boolean isMotorized();

    public abstract String getcompany(); /// here we create other abstract method. to user that he would also have to answer this question:
    // what is the company name of its vehicle:




    
}
