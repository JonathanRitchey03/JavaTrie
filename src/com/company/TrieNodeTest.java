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
        assertEquals(root.totalChildren(), 3);

        TrieNode emptyRoot = new TrieNode(TrieNode.ROOT_LETTER);
        assertEquals(emptyRoot.totalChildren(), 0);
    }

    @Test
    public void testKidAtIndex() throws Exception {
        TrieNode root = new TrieNode(TrieNode.ROOT_LETTER);
        root.addChildForLetter('a');
        root.addChildForLetter('b');
        root.addChildForLetter('c');
        assertTrue(root.childAtIndex(0).letter == 'a');
        assertTrue(root.childAtIndex(1).letter == 'b');
        assertTrue(root.childAtIndex(2).letter == 'c');
        assertNull(root.childAtIndex(3));
    }

    @Test
    public void testAdd() throws Exception {
        TrieNode root = new TrieNode(TrieNode.ROOT_LETTER);
        root.addChildForLetter('a');
        assertEquals(root.totalChildren(), 1);
        root.addChildForLetter('b');
        assertEquals(root.totalChildren(), 2);
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