package org.wiztools.traversal;

import java.util.LinkedList;

/**
 *
 * @author subhash
 */
public class Queue<T> {
    private LinkedList<T> ll = new LinkedList<>();
    
    public void enqueue(T n) {
        ll.addLast(n);
    }
    
    public T dequeue() {
        return ll.removeFirst();
    }
    
    public boolean isNotEmpty() {
        return !ll.isEmpty();
    }
}
