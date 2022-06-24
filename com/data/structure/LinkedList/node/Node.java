package com.data.structure.LinkedList.node;

public class Node {
    public int data;
    public Node next;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it

    public Node(int data) {
        this.data = data;
        next = null;
    }

}
