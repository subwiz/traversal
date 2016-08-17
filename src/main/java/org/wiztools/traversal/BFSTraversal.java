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
            if(curr.children != null) {
                for(Node child: curr.children) {
                    q.enqueue(child);
                    visit(child);
                }
            }
        }
    }
}
