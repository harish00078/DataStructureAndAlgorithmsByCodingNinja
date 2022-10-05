package MileStone2.MileStone2Lecture17;



public class Student {  /// like in this way we were creating our classes:


    
    // 1.> using this class properties we were create object in the other class: (StudentUse);

    ///2.> here we create the create the properties for class:
    // like  :
    String name; // here (name) is a default  modifiers: we did not access it on other packages :
    // private int rollNumber; // in this way we can private any properties of the class:
    public int rollNumber;  // in this way we can public any properties of the class: this properties can be access by any package:


    // topic (ACCESS MODIFIERS): are cantroller the properties and functionality that we have in our class:
    // usage of modifiers: modifiers are basicallly use for when we work on big projects. 
    // and our project is distributed in multiple teams.
    // here we use modifier to ristrict our data from the various teams;
    // we have three types of Access Modifiers:
    // 1.> public: public modifier is use when we want to share our data with  every where or every team:
    // 2.> private: using private modifier we were basically strict our data from the team .no one will access this data:
    // 3.> default: this modifier is only accessible in the same package:








    // topic(getter and setters):getter and setter these two function where gave permission to the other team members.
    //  so that they can work private property of the class but in the ristricted way.
    // for gaving direct access to  any of the  class property to the  other team member.we can gave them a ristricted.
    // way to access the private property of the class thorugh getter and setter functions.\
    /// or we can say that in this they were only work on the values of the property. not on the propery it self:

    // for example:  we were private our property (rollNumber):
    // and we also want to gave access of this private property to other team members: 
    // so that they can only aslo work on this property.
    // we use private here because we did not want that other team member will work on the property directly.
    // we want that they were only able to work on the value of this property:

    // In this way we can create the (getter) function: using getter function we will gave output of the private property to user:

    // here (public) is a class:
    // here (int) is  a output data type for the class :
    // getRollNumber is a variable : 

    // public int getRollNumber(){ 
    //     return rollNumber;  // here we have print  output of  the rollNumber: using this funcion:
    // }

    // In this way we can create the (setter) function: using set function we will basically set a value for the private property:

    // public void setRollNumber(int num){ // here we gave input using  this function:(int num):
    //     if(num <= 0){ // we can also ristrict the  input:
    //         return;
    //     }
    //     rollNumber = num; // here we convert the input into the  rollNumbr variable:
    //     // in this way this value go to the getter function and getter function will print this value:
    // }







    // topic: keyword(THIS): we use (this) keyword when want to gave the refernce of the one variable to its some name local variable:
    // or we can say that when we have two some name variable. and they were doing the some work: 
    // so in java we did not do that directly that why we use (THIS) keyword>
    // like: for explanation:

    // public void setRollNumber(int rollNumber){
    //     if(rollNumber <= 0){
    //         return;
    //     }
    // //     for if we want to check that our (this) keyword fucntion is  use the same refernce value as a our object refernce value:
    // //     System.out.println("this refernce value " + this);
    // //     using (this) keyword here we will defferntiate that is our object variable or local variable:
    //     // this. rollNumber  = rollNumber; // <- local variable:
    // //     now here we have the problem our object variable is same as the local variable :
    // //     for creating differentiate between them we will basically use  the (THIS) keyword.
    // }






    // topic: (constructors) = java contructor is a terminology been used to construct something in our programs.
    // a constructor in java is  a special method that is used to initialize objects
    // the constructor is called when an objects of a class is created.
    // (important point ) = it can be used to set initial values for object attributes .


    /// 1.>
    // public Student(String n, int num){ // in this way we can create the constructor:
    //     // in constructor  we did not gave the output datatype:
    //     // it only have a class(public)
    //     // varaible(Student)
    //     // and attributes like(String n):
    //     // (imp) = when we create constructor in the class the constructor should we one the name of the class:
    //     name = n;
    //     rollNumber = num;

    // }


    // if we want to gave a only one attribute:
    // then we have to create a  another constructor for that:

    //2.>
    // public Student(String n){
    //     name = n;
    //     // we can also gave a default value  to the other variable in this constructor:like this:
    //     // rollNumber = 10;
    // }


    // 3.>
    // for check the use of the constructor is that we can create a constructor of printing the output;
    // // so  we do not have to write the output code agaian and again:
    // public void print(){
    //     System.out.println(name + " " +  rollNumber);
    // } 


    //4.>
    // // we can also create constructor with default values only:
    // public Student(){
    //     name = "abc";
    //     rollNumber = 878;
    // }



    
    
    //5.> we can aslo use (this) keyword in the constructor:
    // public Student(String name, int rollNumber){ // in this way we can create the constructor:
        
    //    this.name = name;
    //     this.rollNumber = rollNumber;

    // }






    // topic: (FINAL) keyword: final keyword is use when we want to create something whose value will not be changable.
    // not in its own class or in other class:
    // we can only access that value in the constructor only: because the constructor will also only create once:
    // we also have to define some value to the (final) keyword; if we want to create a final keyword:
    // like:
    final double conversionfactor = 0.98; // here we create the final keyword:




    /// topic: (static) keyword: basically we can say that static properties are those properties which are share by objects:
    // static properties are those properties which belongs to the class rather than the each specific object;
    // so thier separate copies are not be created :
    // basically static property is that property which is shared by all the object of the class:
    // for example number of students:

    // private static int numStudents;  // here we create the static function:

    // public Student(String name, int rollNumber){ // in this way we can create the constructor:
        
    //     this.name = name;
    //     this.rollNumber = rollNumber;
    //     numStudents++;  // here we use static function for counting the number of students:because this function belongs to the class not the specific object:
    //     //  so we can basically use it in any objects: for different kind of workings:
    //     // (IMP) = IN this way static keyword is usefull for us. because using static keyword we did not have to do the some things differently for each objects:
    //     // we will create some static function and that function is shareable by all the other class objects:
 
    // }


    // public Student(String name, int rollNumber){ // in this way we can create the constructor:
        
    //     this.name = name;
    //     numStudents++;  
    //     this.rollNumber = numStudents; // here we can also use the static keyword for doing other functions as well.
    //     //like here we use the static function for the couting rollNumbers:like if the student rollnumber.
    //     // start from the one it will counting the number from the 1  to till the number students that we are created:
        
    //     // numStudents++; 
    // }

    

    /// here we convert our static function into private modifier so no one can break my logic:
    // after doing this we are also not able to use the static function(numStudents) for any where in the object freely;
    private static int numStudents;

    // but instead of that any one want the access and the count of the numStudents. 
    //they can get through the (getter) function besacuse using getter function they were only check the count not able:
    // to do some changes in the that static function . because we convert it into private modifier:
    
    // this is the getter function for the access the private static function for the objects:
    public int getNumStudents(){
        // we can also did not acess the non static function under the static function:
        System.out.println(rollNumber); ///this is a static function:
        
        return numStudents; 
    }









    
} 
