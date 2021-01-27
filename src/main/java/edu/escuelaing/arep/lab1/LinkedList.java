package edu.escuelaing.arep.lab1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E>, Iterator<E> {

    private int size;
    public Node<E> current;
    public Node<E> next;

    public LinkedList() {
        this.current = null;
        this.next = null;
        this.size = 0;
    }

    // methods of iterator
    public boolean hasNext() {
        if(this.current == null){
            return false;
        }
        return true;
    }

    public E next() {
        E data = current.getCurrent();
        current = current.getNext();
        return data;
    }

    public void remove() {}

    // methods of list
    public int size() {
        return this.size;
    }

    public Iterator<E> iterator() {
        return this;
    }

    public boolean add(E data) {
        Node<E> newData = new Node<E>(data);
        newData.nextNode(this.current);
        this.current = newData;
        this.size +=1;
        return true;
    }

    public void clear() {
        this.size = 0;
    }

    //methods i dont use.
    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public E get(int index) {
        return null;
    }

    public E set(int index, E element) {
        return null;
    }

    public void add(int index, E element) {    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

}
