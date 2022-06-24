package com.data.structure.binaryTree.main;

import com.data.structure.binaryTree.impl.BinaryTree;
import com.data.structure.binaryTree.node.Node;

import java.math.BigInteger;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);

        tree.root.left = new Node(9);
        tree.root.right = new Node(11);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(13);

        System.out.print("Inorder traversal before insertion:");
        tree.inorder();

        int key = 12;
        tree.insert( key);

        System.out.print("\nInorder traversal after insertion:");
        tree.inorder();
        System.out.println();
        System.out.print("Inorder traversal before deletion:");
        tree.inorder();

         key = 13;
        tree.delete( key);

        System.out.print("\nInorder traversal after insertion:");
        tree.inorder();



    }
}
