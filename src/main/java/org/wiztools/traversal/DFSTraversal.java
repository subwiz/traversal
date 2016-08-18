package org.wiztools.traversal;

import java.util.LinkedList;

/**
 *
 * @author subhash
 */
public class DFSTraversal extends AbstractVisitor {
    
    private LinkedList<Node> stack = new LinkedList<>();

    @Override
    public void traverse(Node root) {
        if(root == null) {
            return;
        }
        stack.push(root);
        
        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            visit(curr);
            if(curr.children != null) {
                for(int i=curr.children.length-1; i>=0; i--) {
                    Node child = curr.children[i];
                    stack.push(child);
                }
            }
        }
    }
    
}
