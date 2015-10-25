package com.company;

public class Trie {
    TrieNode root;
    Trie() {
        root = new TrieNode(TrieNode.ROOT_LETTER);
    }
    void insertString(String str) {
        TrieNode c = root;
        for ( int i=0; i<str.length(); i++ ) {
            char letter = str.charAt(i);
            if ( c.getChildForLetter(letter) == null ) {
                c.addChildForLetter(letter);
            }
            c = c.getChildForLetter(letter);
        }
        c.addEndOfStringChild();
    }

    boolean inTrie(String str) {
        TrieNode c = root;
        for ( int i=0; i<str.length(); i++ ) {
            char letter = str.charAt(i);
            if ( c.getChildForLetter(letter) == null ) {
                return false;
            }
            c = c.getChildForLetter(letter);
        }
        return c.hasEndOfStringChild();
    }

    public void printTrie() {
        printTrie(root,"");
    }

    private void printTrie(TrieNode c, String indent) {
        System.out.println(indent + c.letter);
        indent += "  ";
        for ( int i = 0; i < c.totalKids(); i++ ) {
            printTrie(c.kidAtIndex(i), indent);
        }
    }
}
