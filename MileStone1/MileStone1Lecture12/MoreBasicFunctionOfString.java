package MileStone1Lecture12;

public class MoreBasicFunctionOfString {

    public static void main(String[] args) {
        
        char arr[]={'C','o','d','i','n','g'};
        String str1="Coding";
        String str2="is fun";
        String str3="Ceding";
        System.out.println(str1.contains("ing"));  /// here we use (contains) function that basically check that we have this value in the string or not
        str1=str1.concat(str2); // we can also add two strings using concat function.
        System.out.println(str1 + str2); // this is the  other way we can also add two strings
        System.out.println(str1);
        System.out.println(str1.equals(str3));  // here we use (equal) function that check that both the strings are equal or not
        System.out.println(str1.compareTo(str3));  // here we use (compare) Function the basically compare both the strings. compare function will basically compare that how many values of the strings are matching with each other.
        //str1+=str2
        //System.out.println(str1.length());
        // System.out.println(str1);
        //System.out.println(str.charAt(2));
        //System.out.println(str.charAt(6));
    }
    
}
