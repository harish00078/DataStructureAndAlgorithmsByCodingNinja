package MileStone1Lecture12;

public class AssignmentProblemHighestOccuringCharacter {

    // here we count that which string charcter is  acccouring more than once in the string
    


    
	public static char highestOccuringChar(String str) {
	
        int freq [] = new int[128];
        
        int max = 0;
        
        char output = ' ';
        
        for(int i=0;i<str.length();i++){
            
            char c = str.charAt(i);
            
            freq[c]++;
            
            max = Math.max(max,freq[c]);
        }
        
        for(int i=0;i<str.length();i++){
            
            char c = str.charAt(i);
            
            if(max == freq[c]){
                
                output = c;
                break;
            }
        }
        
        return output;
	}
}
