package MileStone2.MileStone2Lecture19.Generics;

public class Student implements PrintInterface{

    int rollNumbers;

    public Student(int rollNumbers){
        this.rollNumbers = rollNumbers;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println(rollNumbers);
        
    }

    


    
}
