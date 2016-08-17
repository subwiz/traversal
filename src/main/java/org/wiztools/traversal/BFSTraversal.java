package org.wiztools.traversal;

import java.util.LinkedList;

/**
 *
 * @author subhash
 */
public class BFSTraversal extends AbstractVisitor {
    
    private Queue<Node> q = new Queue<>();
    
    @Override
    public void traverse(Node root) {
        if(root == null) {
            return;
        }
        q.enqueue(root);
        visit(root);
        while(q.isNotEmpty()) {
            Node curr = q.dequeue();
            if(curr.leafs != null) {
                for(Node leaf: curr.leafs) {
                    q.enqueue(leaf);
                    visit(leaf);
                }
            }
        }
    }
}
