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
        visit(root);
        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            if(curr.children != null) {
                for(Node child: curr.children) {
                    stack.push(child);
                    visit(child);
                }
            }
        }
    }
    
}
