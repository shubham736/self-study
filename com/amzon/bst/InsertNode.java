package com.amzon.bst;

import com.amzon.Node;

public class InsertNode {

    public static void main(String[] args) {
        Node root = new Node(10);
        insertNode(50,root);
        insertNode(30,root);
        insertNode(20,root);
        insertNode(40,root);
        insertNode(70,root);
        insertNode(60,root);
        insertNode(80,root);
        inorder(root);

    }

    public static void inorder(Node temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }

    private static Node insertNode(int key, Node root) {
        if (root == null) {
            Node node = new Node(key);
            return node;
        }
        if (key < root.data) {
            root.left = insertNode(key, root.left);
        } else if (key > root.data) {
            root.right = insertNode(key, root.right);
        }
        return root;
    }
}
