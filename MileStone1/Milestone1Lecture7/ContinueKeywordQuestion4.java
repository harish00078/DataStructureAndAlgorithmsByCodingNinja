package Milestone1Lecture7;

public class ContinueKeywordQuestion4 {

    public static void main(String[] args) {
        
        int i = 1;
        while(i < 3){
            int j = 1;
            while(j < 5){
                if(j ==3){
                    break;
                }
                System.out.println(j + " ");
                j++;
            }
            i++;
        }
    }
    
}
