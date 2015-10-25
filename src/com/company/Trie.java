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

    public void printStringsAlphabetically(TrieNode c, String word) {
        if ( c.letter == TrieNode.END_OF_STRING_LETTER ) {
            System.out.println(word);
        } else {
            for ( int i = 0; i < c.totalChildren(); i++ ) {
                TrieNode n = c.childAtIndex(i);
                printStringsAlphabetically(n, ""+n.letter);
            }
        }
    }

    private void printTrie(TrieNode c, String indent) {
        String actualIndent = c == root ? "  " : indent + "└─";
        System.out.println(actualIndent + c.letter);
        indent += "  ";
        for ( int i = 0; i < c.totalChildren(); i++ ) {
            printTrie(c.childAtIndex(i), indent);
        }
    }
}
