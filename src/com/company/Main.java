package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Trie t = new Trie();
        t.insertString("he");
        t.insertString("hi");
        t.insertString("hell");
        t.insertString("to");
        t.insertString("too");
        t.printTrie();
    }
}
