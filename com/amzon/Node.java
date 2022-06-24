package com.amzon;

public class Node {
    public  Node root;
    public  int data;
    public  Node left, right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
/**
 *              1
 *             / \
 *            2   3
 *           / \
 *          4   5
 * */
    public static Node setData() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        return root;
    }
    
    public static Node symetricNode(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        return root;
    }


}
