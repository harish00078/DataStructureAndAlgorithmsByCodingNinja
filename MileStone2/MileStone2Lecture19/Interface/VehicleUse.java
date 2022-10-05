package MileStone2.MileStone2Lecture19.Interface;

public class VehicleUse {

    // here we use the interface class or its abstract method:
    // here we basically see that how will user use the inteface classs and its abstract function:
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle(); /// here we can clearly see that we can use the vehicle class : without any error:
        // because vehicle is a implement class of the interface class:

        // VehicleIterface v1 = new VehicleIterface(); // here we can clearly see that we did not use the interface class direclty:

        VehicleIterface v1; // here we can see that we are not able to direclty use the interface class.
        // but we can use its refrence to create objects using interface class:
        // v1 = new Vehicle(); // here we create abject using inteface class:

        // we can only access the interface class method or functions only: not that we created in the implement class:
        // because the implement class is only use to gave values to the interface class methods:

        // for example:
        // v1.getcompany(); // here we can cleary see that we can easily use the inteface abstract methods:
        // v1.print();// here we can also see that we did not use the implement class function:
    }

    
}
