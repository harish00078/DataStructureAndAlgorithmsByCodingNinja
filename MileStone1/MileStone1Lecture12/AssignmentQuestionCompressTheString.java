package MileStone1Lecture12;

public class AssignmentQuestionCompressTheString {

    // this function is used for compresing the string.
    // like this if we are have string like this :  "aaabbccdsa"
    // we have to converted it into this way : "a3b2cd2e5"


    public static String getCompressedString(String str) {
		// Write your code here.
        String s=new String();
       int n = str.length(); 
        for (int i = 0; i < n; i++) { 
  
            // Count occurrences of current character 
            int count = 1; 
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) 
            { 
                count++; 
                i++; 
            } 
              s+=str.charAt(i);
            if(count>1) {
            s+=count;}
            // Print character and its count 
           // System.out.print(str.charAt(i)); 
           // System.out.print(count); 
            
        }
            return s;
	}
    
}
