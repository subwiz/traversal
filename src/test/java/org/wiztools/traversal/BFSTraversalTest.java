/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wiztools.traversal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subhash
 */
public class BFSTraversalTest {
    
    public BFSTraversalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of traverse method, of class BFSTraversal.
     */
    @org.junit.Test
    public void testTraverse() {
        System.out.println("traverse");
        
        Node root = new Node('a');
        Node l1Left = new Node('b');
        Node l1Right = new Node('c');
        root.children = new Node[]{l1Left, l1Right};
        
        Node l2Left = new Node('d');
        Node l2Right = new Node('e');
        l1Left.children = new Node[]{l2Left, l2Right};
        
        BFSTraversal instance = new BFSTraversal();
        instance.traverse(root);
    }
    
}
