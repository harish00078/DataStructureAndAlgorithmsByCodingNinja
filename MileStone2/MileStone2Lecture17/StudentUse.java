package MileStone2.MileStone2Lecture17;

// import java.util.Scanner;

public class StudentUse {

    public static void main(String[] args) {

        // Scanner s = new Scanner(source); /// the way we create scanner function : that is the same way  to create the objects:
        // like:
        /*
         * Scanner = Scanner is basically a class:
         * s = s is the object:
         * new = new is basically a keyword that is use to create  a object for the class:
         * 
         */
        
         // here we create the objects:
        // Student s1 = new Student(); // here when we create the object :
        // like here we create the object s1.using class student.
        // then s1 does not have its own refrence or storage value.it will basically use the class (student) refrence value or memory value.
        // because we were create the object using class properties.
        // or we can say that we were create objects under the classes;

        // we can check that s1 have the refrence number of the class (student):
        // System.out.println(s1);
        
        // Student s2 = new Student();
        
        

        // In this way we can gave values to the objects that we created:

        // s1.name = "harish";
        // s1.rollNumber = 50;

        // s2.name = "ratan tata";
        // s2.rollNumber = 30;



        // in this way we can print the object values:
        // System.out.println(s1.name+ " " + s1.rollNumber);
        // System.out.println(s2.name+ " " + s2.rollNumber);





        // here we use getter and setter function : so other team members will able  to work on the private propety of the class:
        // System.out.println(rollnumber); // we did not access the private property directly thats why we use getter and setter funcion:

        // here we use getter function to print the output of the private property:
        // System.out.println(s1.getRollNumber()); // here we use our getter function. to have or gave a value of the rollNumber: 

        // here we use setter function that is use to set the value of the private property by the other team members:
        // s1.setRollNumber(44); // in this way we can set the values for the private property:


        
        
        
        
        
        //  here we can use the functions of (this) keyword:

        // here we check THIS keyword for the S1 object:
        // System.out.println("s1 object refrence value" + s1); // here we can see that (THIS) keyword or object (S1) will  share  the some refernce  value:


        // we can also check THIS keyword for the S2 object:
        // Student s2 = new Student();
        // s2.setRollNumber(46); 
        // System.out.println("s2 object refrence value" + s2); // here we can clearly see that (THIS) keyword or object(s2) share the some refernce value:







        // here we see that how the constructor are working:
        // Student s1 = new Student("harish", 97); // in this constructor we use the two attributes:
        // // System.out.println(s1.name + s1.rollNumber);
        // s1.print(); // here we use (print) constructor to print the output: here we can clearly see the use of the constructor
        
        // Student s2 = new Student("aman");// here we use another constructor were we only have one attribute:
        // // this for those user who does not want to gave his rollNumber:
        // s2.print(); // here we use (print) constructor to print the output:  here we can clearly see the use of the constructor








        //here we can clearly see that we did not access the final keyword at any where:
        // System.out.println(conversionfactor);

        // we can only access the final keyword value under the constructor:
        // we can use that final value under the constructor. because if we want to create a agrument.
        // and i want that its value does not be changable:
        // there we can use the final keyword:




        // here we check that how the static keyword is working:

        // Student s1 = new Student("harish", 77);
        // Student s2 = new Student("rahul", 98);
        // Student s3 = new Student("mahadev", 100);


        // here we use the static keyword: to count the  number of students we are created:
        // we can see here we have a error. beacuse this is no the correct way to use static keyword:
        // System.out.println(s1.numStudents);
        // System.out.println(s2.numStudents);
        // System.out.println(s3.numStudents);

        // right way of using the static keyword is that:
        // System.out.println(Student.numStudents); // here we use the class to use static keyword.
        // because the number of students that we want to count that are created under the class so we can access them using our class name:


        //  here we did not apply the ristiction  on the static function: so any one can outside the property of function classs.
        // can break my logic using or giving this type conditions to the static keyword that will break my logic:
        /// that why its compulsary that i can ristrict my static keyword function: 
        // Student.numStudents = 100;

        // here we can access the private static function:using getter function:

        // Student s1 = new Student("harish", 77);

        // System.out.println(s1.getNumStudents()); /// here we can clearly see that we can access the private static function using getter function:
        




     

        

 












        

    }
    
}
