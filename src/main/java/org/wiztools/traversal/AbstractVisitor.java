package org.wiztools.traversal;

/**
 *
 * @author subhash
 */
public abstract class AbstractVisitor implements Traverse {
    private int visitCount = 0;
    
    protected void visit(Node n) {
        System.out.printf("%d. %c\n", ++visitCount, n.data);
    }
}
