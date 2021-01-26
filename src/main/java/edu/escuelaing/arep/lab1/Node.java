package edu.escuelaing.arep.lab1;

public class Node<E> {

    private E current;
    private Node next;

    public Node(E current) {
        this.current = current;
        this.next = null;
    }

    public void nextNode(Node data){
        this.next = data;
    }

    public E getcurrent(){
        return this.current;
    }
}
