package com.amzon.bst;

import com.amzon.Node;

public class PrintBSTInRange {

    public static void main(String[] args) {
        Node tree = new Node();
        int k1 = 10, k2 = 25;
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        print(tree.root, k1, k2);
    }

    private static void print(Node root, int k1, int k2) {
        if(root == null)
            return;
        if(k1< root.data)
            print(root.left , k1,k2);
        if(k1<= root.data && k2 >= root.data)
            System.out.print(root.data+" ");
        if (k2 > root.data)
            print(root.right ,k1,k2);
    }
}
