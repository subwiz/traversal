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
public class DFSTraversalTest {
    
    public DFSTraversalTest() {
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
     * Test of traverse method, of class DFSTraversal.
     */
    @Test
    public void testTraverse() {
        System.out.println("DFS traverse");
        
        Node root = new Node('a');
        Node l1Left = new Node('b');
        Node l1Right = new Node('c');
        root.children = new Node[]{l1Left, l1Right};
        
        Node l2Left_1 = new Node('d');
        Node l2Right_1 = new Node('e');
        l1Left.children = new Node[]{l2Left_1, l2Right_1};
        
        Node l2Left_2 = new Node('f');
        Node l2Right_2 = new Node('g');
        l1Right.children = new Node[]{l2Left_2, l2Right_2};
        
        DFSTraversal instance = new DFSTraversal();
        instance.traverse(root);
    }
    
}
