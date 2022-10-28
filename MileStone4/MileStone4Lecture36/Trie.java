package MileStone4.MileStone4Lecture36;

// here we create TrieNode class:because Trie:we have TrieNodes.like treeNodes in Tree 
class TrieNode{
    // under TrieNode:we have 
    char data; // data of characters:
    boolean isTerminal; // we aslo have TerminalNode: that repersent the end of the particular String or we can say a particular word:
    TrieNode children[]; // we have childrenNode: because every Node will have a 26 childrenNodes in it:
    int childCount; // using variable we can track  our Node count:

    // here we are creating the TrieNode through constructor:
    public TrieNode(char data){ // here have our data:
        this.data = data;// here we are doing that this data will we equal to the data:
        // by default the termianlNode will we false:
        this.isTerminal = false;
        // under childrenNode every Node is null by default:
        this.children = new TrieNode[26];
        // here we create varainble in the TrieNode: we getting count on our Nodes:
        this.childCount = 0;
        
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


    // here we create helper function for adding words in the Trie:
    // because we did not simple add the words in the Trie:
    // while creating simple (add) fucntion:
    // because we also have to define there node:
    // so we can enter all other subwords related to that complete word in the correct way:
    // and without relocating the root that is not possible: that why be create helper function:


    private void addHelper(TrieNode root, String word){

        // here we have our base case:
        if(word.length() == 0){ //if words length get empty: means we add the complete word in the Trie:
            // then that last node will become our isTerminalNode:
            root.isTerminal = true;
            return;//and return that;
        }

        // here we are defining the childIndex:
        // so we can enter the charcters in correct way:
        int childIndex = word.charAt(0) - 'A';

        // here we are defining the childNode:
        // root's children Array Index value means (childIndex)  is our  childNode of Trie:
        TrieNode child = root.children[childIndex];
        // if childNode is not present:
        if(child == null){ // here we are checking that if childNode is null or not present:
            child = new TrieNode(word.charAt(0)); // then we have to create new childNode:
            // and add  that childNode into the childIndex:
            root.children[childIndex] = child;
            // here we use childCount variable:for getting count of our Nodes:
            root.childCount++;
        }
        // here we use recursion: for entering other substrings related to the complete word:
        addHelper(child, word.substring(1));

    }

    // under Trie we have (add) function: that we use to add words in the (Trie):
    public void add(String word){

        addHelper(root, word);

    }
    // under Trie we have(search)function: that we use to search words in the (Trie):
    public boolean search(String word){

        return searchHelper(root,word);

    }
    // here we create search Helper function: for the same reason like addHelper function:
    private boolean searchHelper(TrieNode root, String word){

        // base case:
        if(word.length() == 0){
            return root.isTerminal;
        }
        int childIndex = word.codePointAt(0) -'A';
        TrieNode child = root.children[childIndex];
        // if there does not exit any word:
        if(child == null){
            return false; // then we simply return false:
        }
        // here if word exist: then we use recusrion for searching its other subwords related to that complete word:
        return searchHelper(child, word.substring(1));

    }

    // uder Trie we have (Remove) function: that we use to Remove words in the (Trie):
    public void Remove(String word){

        RemoveHelper(root,word);
    }

    // here we create remove Helper function: for the same reason like addHelper function:
    public void RemoveHelper(TrieNode root, String word){

        // base case:
        if(word.length() ==0){
            root.isTerminal = false;
            return;
        }

        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if(child == null){ // here if childNode check null:
            return; // we did not have to return anything:
        }

        // if the word is present:
        // then we use recurison for removing all the other subwords of the complete word:
        RemoveHelper(child, word.substring(1));

        // after all these we also have to remove all the un-neccesary Nodes:
        // and also those nodes which does not have a terminalNode:
        if(!child.isTerminal && child.childCount == 0){ // if any Nodes does not have a terminal Node or its  childNodes count  are zero:

            // then we simply have to remove that childINdex: putting null on that childIndex
            root.children[childIndex] =null;
            // and also havve to minimize the childCount:
            root.childCount--;
        }
         
    }

    
}
