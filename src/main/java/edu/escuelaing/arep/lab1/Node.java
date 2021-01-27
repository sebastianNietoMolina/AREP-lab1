package edu.escuelaing.arep.lab1;

public class Node<E> {

    private E current;
    private Node next;

    public Node(E current) {
        this.current = current;
        this.next = null;
    }

    public E getCurrent(){
        return this.current;
    }

    public Node<E> getNext(){ return this.next;}

    public void nextNode(Node data){
        this.next = data;
    }
}
