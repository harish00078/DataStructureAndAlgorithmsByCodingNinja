package MileStone1Lecture12;

public class ProblemReverseStringWordWise {

    // basically here we revserse the full string .
    // for example if we want to reverse the : welcome to coding ninjas.
    // we have teo reverse this string in this way: ninjas coding to welcome.

    public static String reverseWordWise(String input) {
		String[] words = input.split(" ");//this line makes an array of each word in the input string
        String ans = "";
        for(int i=words.length-1;i>=0;i--)
            ans+=words[i]+" ";
        return ans;
    }
    
}
