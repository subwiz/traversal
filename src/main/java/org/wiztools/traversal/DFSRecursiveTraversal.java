package org.wiztools.traversal;

/**
 *
 * @author subhash
 */
public class DFSRecursiveTraversal extends AbstractVisitor {

    @Override
    public void traverse(Node n) {
        if(n != null) {
            visit(n);
            if(n.children != null) {
                for(Node child: n.children) {
                    traverse(child);
                }
            }
        }
    }
    
}
