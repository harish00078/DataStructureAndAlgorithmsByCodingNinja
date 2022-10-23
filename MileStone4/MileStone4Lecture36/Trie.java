package MileStone4.MileStone4Lecture36;

// here we create TrieNode class:because Trie:we have TrieNodes.like treeNodes in Tree 
class TrieNode{
    // under TrieNode:we have 
    char data; // data of characters:
    boolean isTerminal; // we aslo have TerminalNode: that repersent the end of the particular String or we can say a particular word:
    TrieNode children[]; // we have childrenNode: because every Node will have a 26 childrenNodes in it:

    // here we are creating the TrieNode through constructor:
    public TrieNode(char data){ // here have our data:
        this.data = data;// here we are doing that this data will we equal to the data:
        // by default the termianlNode will we false:
        this.isTerminal = false;
        // under childrenNode every Node is null by default:
        this.children = new TrieNode[26];
    }
}

public class Trie {

    // under Trie we have top most Node: that is (rootNode):
    private TrieNode root; // it should we private:

    // here we create Trie: 
    // under Trie we have top most node and that is root Node: and rootNode's value will we (null):
    public Trie(){ // here we create Trie:
        root = new TrieNode('\0');// with (Root) node: and its value will we zero:
    }

    // under Trie we have (add) function: that we use to add words in the (Trie):
    public void add(String word){

    }
    // under Trie we have(search)function: that we use to search words in the (Trie):
    public boolean search(String word){

    }

    // uder Trie we have (Remove) function: that we use to Remove words in the (Trie):
    public void Remove(String word){

    }
    
}
