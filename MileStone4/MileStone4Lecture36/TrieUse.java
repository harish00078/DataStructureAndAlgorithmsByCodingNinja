package MileStone4.MileStone4Lecture36;

public class TrieUse {

    public static void main(String[] args) {
        
        Trie t = new Trie();

        t.add("NOTE");
        t.add("AND");

        System.out.println(t.search("NOTE"));
    }
    
}
