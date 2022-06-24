package com.data.structure.binaryTree.impl;

public interface BinaryTreeImpl {

    void inorder();     // Inorder (Left, Root, Right)

    void postOrder();   //Post-order (Left, Right, Root)

    void preOrder();    // Pre-order (Root, Left, Right)

    void insert(int data);

    void delete(int key);

    void inorderWithoutRecursion();

    // Prints postorder traversal from
// given inorder and preorder traversals
     void printPostOrder(int in1[], int pre[], int size);
}
