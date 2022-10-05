package MileStone1Lecture12;

public class AssignmentProblemRemovecharacter {

    // this function is used when we want to remove the particular elements from the string.

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String s="";
        for(int i=0;i<=str.length()-1;i++){
            //or(int j=0;j<str.length()-1;j++){
            //s=str.replace(ch); 
            if(str.charAt(i)==ch){
                //i++;
                //s=str.replace(ch); 
                continue;
            }else{
                s+=str.charAt(i);
            }
        }
        return s;
    }

    
    
}
