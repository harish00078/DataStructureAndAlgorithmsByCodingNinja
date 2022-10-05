package MileStone1Lecture12;

public class StringSubStringFunction {

    // here we learn about subString Function

    public static void main(String[] args) {
        
        char arr[]={'C','o','d','i','n','g'};
        String str1="Coding";
        
        // IMPORTANT RULES ABOUT SUB-STRING:
        // 1. important thing about substring is that when we count the sub string it will use index method to count the string elements.
        // 2. but when we gave him a printing value it will working acc the size  of the string .


        String substr=str1.substring(1,6); // using index function we can print the string elements. acc to given.
        // like if i want to print the element from the 1 to 6.
        
        System.out.println(substr); 

        System.out.println(substr.length()); // in this way we can check the length of the substring.
        
    }
    
}
