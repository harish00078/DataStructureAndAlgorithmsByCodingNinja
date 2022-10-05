package MileStone2.MileStone2Lecture15;

public class TowerOfHanoi {

    public static void towerOfHanoi(int disks, char source, char auxiliary,char destination) {
        
        
        if(disks==0){
            // System.out.println(s+" "+d);
            return;
        }
        // this solution works acc to  disks,source,auxiliary and desitiantion.
        // watch solution video if you want more understanding.
        towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println(source+" "+destination);
        
        towerOfHanoi(disks-1,auxiliary,source,destination);

	}
   
    
    
}
