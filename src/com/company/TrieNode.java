package com.company;

import java.util.Map;
import java.util.TreeMap;

public class TrieNode {
    char letter;
    TreeMap<String, TrieNode> children;
    static final char ROOT_LETTER = '*';
    static final char END_OF_STRING_LETTER = '$';

    public TrieNode(char aLetter) {
        letter = aLetter;
        children = new TreeMap<String, TrieNode>();
    }
    public int totalKids() {
        return children.size();
    }
    public TrieNode kidAtIndex(int index) {
        int i = 0;
        for ( Map.Entry<String,TrieNode> e : children.entrySet() ) {
            if ( i == index ) return e.getValue();
            i++;
        }
        return null;
    }
    public void addChildForLetter(char aLetter) {
        String letter = ""+aLetter;
        children.put(letter,new TrieNode(aLetter));
    }
    public TrieNode getChildForLetter(char aLetter) {
        return children.get(""+aLetter);
    }
    public void addEndOfStringChild() { addChildForLetter(END_OF_STRING_LETTER); }
    public boolean hasEndOfStringChild() { return getChildForLetter(END_OF_STRING_LETTER) != null; }
}
