package MileStone2.MileStone2Lecture19.Interface;

public class Car extends Vehicle implements VehicleIterface,CarInterface {

    // IMP.1 = here we can clrealy see that a one class can user more than one (Interfaces):
    // like here we use two Interfaces:
    // 1. vechicle interface:
    //2. car interface:
    // IMp.2 = or we can also say that in java we can only extend two classes with each other:means a one class can only extend with second class:
    // but a class can use multiplt inerfaces:

    @Override
    public boolean isMotorized() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String getCompany() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int numGears() {
        // TODO Auto-generated method stub
        return 5;
    }

    


    
}
