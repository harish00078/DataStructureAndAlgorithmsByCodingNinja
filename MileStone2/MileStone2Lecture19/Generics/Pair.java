package MileStone2.MileStone2Lecture19.Generics;



public class Pair<T, S> {   // here we define the generic variable (T). we can also use two generic values:
    // for example if we want to use the first half of the value is string. and the second half of the value is Integer:
    // then we have to create a twO generic variables for the two different datatypes usage in the one pair:

    // what is generics: Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces.
   //Using Generics, it is possible to create classes that work with different data types.
   // An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

   private T first; // here we use generic varaible so when ever any budddy use this class they can choose the datatypes on its own:
   // as per there prefrences:this is the basic meaning of the generic:
   private S second;  // herre we convert our second value into the second types of the datatypes;(S)



   // here we write the other function for pair class:

   // here we create a default constructor that will not do any thing:
   public Pair(){}


   // first function is use the two values those were given by user:
   public Pair(T first, S second){
       this.first = first;
       this.second = second;
       
   }

   // second function is to getter first values:
   public T getFirst(){
       return first;
   }


   // thirdly we have to set the values for the first element:
   public void setFirst(T first){
       this.first = first;
   }

   // here we get the second value:
   public S getSecond(){
       return second;
   }

   // here we set the second value:
   public void setSecond(S second){
       this.second = second;
   }

}
