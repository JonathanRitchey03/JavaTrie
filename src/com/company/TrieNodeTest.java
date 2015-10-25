package com.company;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class TrieNodeTest {

    @Test
    public void testConstructor() {
        TrieNode t = new TrieNode("a");
        assertTrue("node can't be null", t!=null);
    }

    @Test
    public void testTotalKids() throws Exception {
        TrieNode root = new TrieNode("");
        root.add("a", new TrieNode("s"));
        root.add("b", new TrieNode("e"));
        root.add("c", new TrieNode("o"));
        assertEquals(root.totalKids(), 3);

        TrieNode emptyRoot = new TrieNode("");
        assertEquals(emptyRoot.totalKids(), 0);
    }

    @Test
    public void testKidAtIndex() throws Exception {
        TrieNode root = new TrieNode("");
        root.add("a", new TrieNode("s"));
        root.add("b", new TrieNode("e"));
        TrieNode oNode = new TrieNode("o");
        root.add("c", oNode);
        assertEquals(root.kidAtIndex(2), oNode);
        assertEquals(root.kidAtIndex(3), null);
    }

    @Test
    public void testAdd() throws Exception {
        TrieNode root = new TrieNode("");
        root.add("a", new TrieNode("s"));
        assertEquals(root.totalKids(), 1);
        root.add("b", new TrieNode("e"));
        assertEquals(root.totalKids(), 2);
    }

    @Test
    public void testGet() throws Exception {
        TrieNode root = new TrieNode("");
        TrieNode sNode = new TrieNode("s");
        root.add("a", sNode);
        TrieNode eNode = new TrieNode("s");
        root.add("b", eNode);
        TrieNode oNode = new TrieNode("o");
        root.add("c", oNode);
        assertEquals(root.get("a"), sNode);
        assertEquals(root.get("b"), eNode);
        assertEquals(root.get("c"), oNode);
    }
}