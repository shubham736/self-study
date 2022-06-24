package com.amzon.tree;

public class Tree {
    static Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(
                "Preorder traversal of binary tree is ");
        preOrder();

        System.out.println(
                "\nInorder traversal of binary tree is ");
        inOrder();

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        postOrder();
    }

    public static void inOrder() {
        Node temp = root;
        inorder(temp);
    }

    public static void preOrder() {
        Node temp = root;
        preOrder(temp);
    }

    public static void preOrder(Node temp) {
        if (temp == null)
            return;
        System.out.print(temp.data + " ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    public static void postOrder() {
        Node temp = root;
        postOrder(temp);
    }

    public static void postOrder(Node temp) {
        if (temp == null)
            return;
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + " ");
    }

    public static void inorder(Node temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);

    }
}
