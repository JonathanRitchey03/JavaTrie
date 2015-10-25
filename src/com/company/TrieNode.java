package com.company;

import java.util.*;

public class TrieNode {
    TreeMap<String, TrieNode> kid;
    public TrieNode(String letter) {
        // Note: letter isn't actually stored anywhere, it's only present for clarity.
        kid = new TreeMap<String, TrieNode>();
    }
    public int totalKids() {
        return kid.size();
    }
    public TrieNode kidAtIndex(int index) {
        int i = 0;
        for ( Map.Entry<String,TrieNode> e : kid.entrySet() ) {
            if ( i == index ) return e.getValue();
            i++;
        }
        return null;
    }
    public void add(String key, TrieNode node) {
        kid.put(key,node);
    }
    public void addEndOfString() { kid.put("",new TrieNode("")); }
    public boolean isEndOfString() { return kid.get("") != null; }
    public TrieNode get(String key) {
        return kid.get(key);
    }
}
