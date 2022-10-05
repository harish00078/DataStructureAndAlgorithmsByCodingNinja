package Milestone1Lecture7;

public class ContinueKeywordQuestion5 {

    public static void main(String[] args) {
        
        int i = 1;
        while(i < 3){
            int j = 0;
            while(j < 5){
                j++;
                if(j == 3){
                    continue;
                }
                System.out.println(j + " ");
                
            }
            i++;
        }
    }
    
}
