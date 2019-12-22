package chapter4__GRAPH_TREE;

public class Trie {

    final TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public static void main(String[] args) {

        String[] a = {"apple", "apppled", "apple"};//count number of strings in array

        Trie t = new Trie();
        for (String s : a) {
            t.insert(s);//lets each string to our trie
        }

        int count = t.query("apple");
        System.out.println(count);
    }



    public int query(String s) {
        TrieNode curr = root;

        for (int i = 0; i < s.length(); i++) {

            if (curr == null) return 0;
            curr = curr.next(s.charAt(i));

        }

        return curr.terminating;//return count here
    }
    /**
     * Insert into a Trie new String
     * @param s
     */
    public void insert(String s) {

        TrieNode curr = root;
        for (int i = 0; i < s.length() ; i++) {

            if (curr.trieNodes[s.charAt(i) - 'a'] == null) {
                //lets insert to new node in trie
                curr.trieNodes[s.charAt(i) - 'a'] = new TrieNode();
            }
            curr = curr.next(s.charAt(i));

        }
        curr.terminating++;
    }


    class TrieNode {

        public int terminating;
        TrieNode[] trieNodes;

        TrieNode() {
            trieNodes = new TrieNode[26];//  when we just have lowercase letters 52 for upper & lower both
        }

        //get node for next char
        public TrieNode next(char c) {
            return this.trieNodes[c - 'a'];
        }

    }

}
