package edu.escuelaing.arep.lab1;

import java.util.Iterator;
import java.util.List;

public class IteratorList<E> implements Iterator<E> {

    Node<E> current;

    public IteratorList(LinkedList<E> lis) {
        this.current = lis.getCurrent();
    }

    public boolean hasNext() {
        if(this.current == null){
            return false;
        }
        return true;
    }

    public E next() {
        return current.getcurrent();
    }

    public void remove() {
    }
}
