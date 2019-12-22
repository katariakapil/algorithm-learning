package chapter4__GRAPH_TREE;

import java.util.HashMap;

/**
 *          -
 *        a-1
 *       p-0
 *      p-1
 *     l-0
 *    e-1
 *
 *  This trie will hold each character at node and end pointer for complete word
 */

public class LongestWordinDict {


    public static void main(String[] args) {

        Trie t = new Trie();

        t.insert("apple", 0);


    }

    static class Trie {

        Node root;// this will denote the root node with blank
        String[] words;// to hold pre computed words

       public Trie() {
            this.root = new Node(' ');// set root as blank to have multiple tries with different prefixes
        }

        /**
         * Method to insert word to a trie
         * @param s
         */
        void insert(String s, int index) {
            Node curr  = root;//lets start by root node and insert
            for (int i = 0; i < s.length(); i++) {

                // we dont want to override existing key only add new key thats what putifabsent do..
                curr.childrens.putIfAbsent(s.charAt(i), new Node(s.charAt(i)));
                curr.childrens.get(s.charAt(i));
            }
            curr.end = index;
        }
    }
    static class Node {

        Character c;
        HashMap<Character, Node> childrens;
        int end;

        public Node(Character c) {
            this.c = c;
        }
    }
}
