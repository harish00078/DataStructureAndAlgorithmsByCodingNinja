package MileStone4.MileStone4Lecture34;

// here we create Element class:using this class we create our elements for our priority queue:
public class Element<T> { // here we use generic method for creating elements through the input values:

    T value; // here we have our value:
    int Priority; // and here we have priority for that values: 

    // here we create constructor: that will combine that values in one element:
    public Element(T value, int Priority){

        this.value = value;
        this.Priority = Priority;
    }
    
}
