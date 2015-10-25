package com.company;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TrieNodeTest {

    @Test
    public void testConstructor() {
        TrieNode t = new TrieNode(TrieNode.ROOT_LETTER);
        assertNotNull(t);
    }

    @Test
    public void testTotalKids() throws Exception {
        TrieNode root = new TrieNode(TrieNode.ROOT_LETTER);
        root.addChildForLetter('a');
        root.addChildForLetter('b');
        root.addChildForLetter('c');
        assertEquals(root.totalKids(), 3);

        TrieNode emptyRoot = new TrieNode(TrieNode.ROOT_LETTER);
        assertEquals(emptyRoot.totalKids(), 0);
    }

    @Test
    public void testKidAtIndex() throws Exception {
        TrieNode root = new TrieNode(TrieNode.ROOT_LETTER);
        root.addChildForLetter('a');
        root.addChildForLetter('b');
        root.addChildForLetter('c');
        assertTrue(root.kidAtIndex(0).letter == 'a');
        assertTrue(root.kidAtIndex(1).letter == 'b');
        assertTrue(root.kidAtIndex(2).letter == 'c');
        assertNull(root.kidAtIndex(3));
    }

    @Test
    public void testAdd() throws Exception {
        TrieNode root = new TrieNode(TrieNode.ROOT_LETTER);
        root.addChildForLetter('a');
        assertEquals(root.totalKids(), 1);
        root.addChildForLetter('b');
        assertEquals(root.totalKids(), 2);
    }

    @Test
    public void testGet() throws Exception {
        TrieNode root = new TrieNode(TrieNode.ROOT_LETTER);
        root.addChildForLetter('a');
        root.addChildForLetter('b');
        root.addChildForLetter('c');
        assertTrue(root.getChildForLetter('a').letter == 'a');
        assertTrue(root.getChildForLetter('b').letter == 'b');
        assertTrue(root.getChildForLetter('c').letter == 'c');
    }
}