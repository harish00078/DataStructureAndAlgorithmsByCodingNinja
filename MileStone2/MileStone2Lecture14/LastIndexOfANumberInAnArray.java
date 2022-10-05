package MileStone2.MileStone2Lecture14;

public class LastIndexOfANumberInAnArray {

    // for solving this problem we have two solutions;
    // 1.> the first one is that we will check the number by creating a small arrays of a particular given array.
    // 2.> the second  we can check the  given number directly in the array and return its index.

    //1.> here we create the copies of the current array and find out the given numbers index.acc to the recursion method
    public static int lastIndex(int a[],int x){
        if(a.length==0){
            return -1;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int k=lastIndex(smallArray,x);
        if(k!=-1){
            return k+1;
        }else{
            if(a[0]==x){
                return 0;
            }else{
                return -1;
            }
        }
    }
    // public static void main(String[] args) {
            
    //     int a [] = {1,2,5,3,4,5};
    //     int x = 3;
    //     System.out.println(lastIndex(a, x));
    // }


    
    
    
    
    //2.> here we check index number direclty in the given array.acc to the recursion method.
    public static int lastIndexBetter(int a[],int x,int si){ // si = represent here the last Index.
        if(si==a.length){
            return -1;
        }
        int k=lastIndexBetter(a,x,si+1);
        if(k!=-1){
            return k;
        }else{
            if(a[si]==x){
                return si;
            }else{
                return -1;
            }
        }
    }
    public static void main(String[] args) {
            
        int a [] = {1,2,5,3,4,5};
        int x = 3;
        System.out.println(lastIndexBetter(a, x,0));
    } 
    
    
}
