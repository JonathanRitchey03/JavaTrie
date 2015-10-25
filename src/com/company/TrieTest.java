package com.company;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TrieTest {

    @Test
    public void testConstructor() throws Exception {
        Trie t = new Trie();
    }

    @Test
    public void testInsertString() throws Exception {
        Trie t = new Trie();
        t.insertString("hi");
        assertTrue("h in 'hi' is present", t.root.get("h") != null);
        assertTrue("i in 'hi' is present", t.root.get("h").get("i") != null);
    }

    @Test
    public void testInTrie() throws Exception {
        Trie t = new Trie();
        t.insertString("he");
        t.insertString("hi");
        t.insertString("hell");
        t.insertString("to");
        t.insertString("too");
        assertTrue("he found in tree", t.inTrie("he"));
        assertTrue("hi found in tree", t.inTrie("hi"));
        assertTrue("hell found in tree", t.inTrie("hell"));
        assertTrue("to found in tree", t.inTrie("to"));
        assertTrue("too found in tree", t.inTrie("too"));
        assertTrue("toom found in tree", !t.inTrie("toom"));
        assertTrue("afsalkj not found in tree", !t.inTrie("afsalkj"));
    }
}