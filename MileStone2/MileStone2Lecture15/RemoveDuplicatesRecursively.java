package MileStone2.MileStone2Lecture15;

public class RemoveDuplicatesRecursively {

    
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length()<=1) return s;
        
        if(s.charAt(0) == s.charAt(1)){
            return removeConsecutiveDuplicates(s.substring(1));
        }else{
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }
   
        

        

	}
    public static void main(String[] args) {
        String s = "aabbccbccaa"; 
        System.out.println(removeConsecutiveDuplicates(s));
    }
    
}
