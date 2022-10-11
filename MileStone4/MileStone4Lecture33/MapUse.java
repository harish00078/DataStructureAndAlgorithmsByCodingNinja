package MileStone4.MileStone4Lecture33;

public class MapUse {

    public static void main(String[] args) {

        Map<String, Integer> map = new Map<>();
        for(int i=0;i<20;i++) {
            map.insert("abc" +i, i+1);
            System.out.println(map.loadFactor());
        }
        map.removeKey("abc3");
        map.removeKey("abc7");

        //we  have some problem in our own (Map)function : because we are not able to print the key/value pairs:
        for(int i=0;i<20;i++) {
            System.out.println("abc" + i + ":" + map.getValue("abc" + i));
        }


    }
    
}
