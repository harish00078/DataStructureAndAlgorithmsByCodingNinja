package MileStone1Lecture12;

public class AssignmentProblemRemoveConsecutiveDuplicates {

    // using this problem we can easily Remove the Consecutive Duplicates of the string


    public static String removeConsecutiveDuplicates(String str) {
		
        String res = "";
        
        for(int i=0;i<str.length()-1;++i) {
            
            char c = str.charAt(i), d = str.charAt(i+1);
            
            if(c != d) {
                
                res += c;
            }
        }
        
        res += str.charAt(str.length()-1);
        
        return res;
	}
    
}
