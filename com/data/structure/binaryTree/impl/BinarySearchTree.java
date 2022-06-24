package com.data.structure.binaryTree.impl;

import com.data.structure.binaryTree.node.Node;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree implements  BinarySearchTreeImpl{

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int data) {
        root = new Node(data);
    }

    public Node search(int key) {
        Node node = root;
        // Base Cases: root is null or key is present at root
        if (root == null || node.data == key)
            return root;

        // Key is greater than root's key
        if (root.data < key)
            return search(key);

        // Key is smaller than root's key
        return search(key);
    }

    @Override
    public void insert(int key)
        {
            root = insertRec(root, key);
        }

    /* A recursive function to
       insert a new key in BST */
        Node insertRec(Node root, int key)
        {

        /* If the tree is empty,
           return a new node */
            if (root == null)
            {
                root = new Node(key);
                return root;
            }

            /* Otherwise, recur down the tree */
            if (key < root.data)
                root.left = insertRec(root.left, key);
            else if (key > root.data)
                root.right = insertRec(root.right, key);

            /* return the (unchanged) node pointer */
            return root;
        }
    // This method mainly calls InorderRec()
    public  void inorder()
    {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }


    public  Queue daigonalPrint(){
            Node temp = root;
        return  daigonalPrint(temp);
    }

    public  Queue daigonalPrint(Node root){
        Queue <Integer> integers = new LinkedList<>();
        if(root== null)
            return integers;
        while(root != null){
            integers.add(root.data);
            root = root.right;
            if(root.right == null){
                daigonalPrint(root.left);
            }
        }
        return integers;
    }

}
