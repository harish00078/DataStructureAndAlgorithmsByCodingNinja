package MileStone1Lecture12;

public class ReverseString {

    public static String reverseString(String str){
        String reversedString="";
        for(int i=str.length()-1;i>=0;i--){   // using this loop we can reverse all element of the  string.
        reversedString+=str.charAt(i);
       }
    //   for(int i=0;i<str.length();i++){ // using this loop we can print all the element of the string as the same.
    //     reversedString+=str.charAt(i);
    //   }
      return reversedString;
      }
        
    
    
    
    
    
    public static void main(String args[]) {
      
      String str="abcde";
      String reversedString=reverseString(str);
      System.out.println(reversedString);
      
    }
    
}
