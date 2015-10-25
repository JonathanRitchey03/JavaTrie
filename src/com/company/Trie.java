package com.company;

public class Trie {
    TrieNode root;
    Trie() {
        root = new TrieNode("");
    }
    void insertString(String str) {
        TrieNode c = root;
        for ( int i=0; i<str.length(); i++ ) {
            String key = ""+str.charAt(i);
            if ( c.get(key) == null ) {
                c.add(key,new TrieNode(key));
            }
            c = c.get(key);
        }
        c.addEndOfString();
    }

    boolean inTrie(String str) {
        TrieNode c = root;
        for ( int i=0; i<str.length(); i++ ) {
            String key = ""+str.charAt(i);
            if ( c.get(key) == null ) {
                return false;
            }
            c = c.get(key);
        }
        return c.isEndOfString();
    }
}
