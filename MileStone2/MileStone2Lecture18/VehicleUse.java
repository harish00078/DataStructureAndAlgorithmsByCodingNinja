package MileStone2.MileStone2Lecture18;

// import java.util.Scanner;

;

public class VehicleUse {

    public static void main(String[] args) {
        
        // here we use the parent class:
        // and other child classes will also working here because we connected them with parent class:


        /// here we try to print the parent  constructor and child constructor:
        // Vehicle v = new Vehicle(); /// here we try to print the parent class constructor onnly:
        // this consturctor willl only print its constuctor values:

        // Car c = new Car(4,100); // here we try to print the child class constructor only:
        // here we gave values to both the arguments: child argument and parent argument :iin the child class print statement:
        // because we use the super keyword:
        // c.print();
        // in child class: we have two outputs one is of the parent classas and other is its own output:
        // because the child class work under the parent class.
        // that's why system will firstly work on the  parent class and then work oon the child class:
        /// because of the inheritance system:
         


        // we can also use the parent class here:like this:
        // Vehicle v = new Vehicle();
        // // v.color = "red"; 
        // v.setColor("red");
        // v.print();

        // here we gave values to the child class (car):
        // Car c = new Car();
        // // c.color = "black";
        // c.setColor("black");
        // c.maxspeed = 100;
        // c.numDoors = 4;
        // here we use the it own print statement: we can also create child class print statements:
        // c.printCar();
        // c.print(); ///here we use vehicle print statement to print the values of the child class:

        // c.printMaxSpeed();

        // here we gave values to our other child class(bicycle)
        // Bicycle b = new Bicycle();
        // b.print();





        // topic: polymorphism:
        /// here try to learn how the polymorphism is working:

        // Vehicle v = new Car(4, 100); // here we create car in under vehicle varaible . we can do that because car is child class of the vehicle parent  class:
        // Vehicle v2 = new Bicycle();

        /// here we can see that we can access the vehicle class properties:
        // v.maxspeed = 100; 

        // here when we calll the print function of the vehicle class why would it print the car print function:
        // because of the compling system and rum time system of the code:
        // when we use the print function it will see the print function in the child class and print that fucntion
        // after that it will print the parent class fucntion:
        // In polynomial we did not use the child class properties or functions. but we use print function.because of the a compiling or runtime system of the code:
        // v.print();
        


        // we can understant this compile and runtime system with this example:
        // Vehicle v;
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // if(n < 10){
        //     v = new Car(4, 100);

        // }else{
        //     // v.Vehicle(); //this not the ploynomail error this error is because of i am missing some code in the vehicle class:
        // }
        // v.print();
        // v.printMaxSpeed; here we can clearly seee that we did not use the child classs properties here:

        /// we did not access the child class properties:because we were creating a car using vehile class:
        // we are not use the car class here: that why we did not able to access the child classese properites and fucntions:

        // v.numDoors; // here we can clearly  seee  that we did not able to access the child class properties:


        /// topic: object class: this is super classs of all the classes that we created by our own selfs:this class basically use by java system:
        // under this class we were create our all  classes:
        // so if want to access any class in any were of the system we can use the (object) system class:
        // for example:

        // Object o = new Vehicle(100); // here we can clearly  see  that here we access the vehicle class through Object class:


        // we can also use other method to have access the child class properties and function in the polymorphism class:
        // using casting function. means we can use the other class function in our parent class using casting function:
        // but this is not the right way to do it because of the compiling system or runtime system because this will through us a many errors:
        // if we did not use the right logic:
        // Vehicle v = new Car(4, 100);
        // Car c = (Car) v; // In this way we can cast the one class properties into the other class:
       
        
        
    }
    
}
