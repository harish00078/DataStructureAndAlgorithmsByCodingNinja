package MileStone1Lecture12;

public class CountWordsInString {


    public static int countWords(String str) {	

        
        if(str.length()==0){
            return 0;
        }
        String arr[] = str.split(" "); // here we basically split our string array words with space.
        return arr.length; /// after spiliting them we print there length.
	}
    
}
