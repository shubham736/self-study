package com.data.structure.binaryTree.impl;

import com.data.structure.binaryTree.node.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree implements BinaryTreeImpl {

    public Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new Node(data);
    }

    @Override
    public void inorder() {
        Node temp = root;
        inorder(temp);
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    @Override
    public void postOrder() {
        Node temp = root;
        postOrder(temp);
    }

    @Override
    public void preOrder() {
        Node temp = root;
        preOrder(temp);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void preOrder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.data + " ");

        /* then recur on left sutree */
        preOrder(node.left);

        /* now recur on right subtree */
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        postOrder(node.left);

        // then recur on right subtree
        postOrder(node.right);

        // now deal with the node
        System.out.print(node.data + " ");
    }

    // Alwz insert at first empty place of BT

    @Override
    public void insert(int key) {
        Node temp = root;
        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }

    @Override
    public void delete(int key) {
        Node node = root;
        if (node == null)
            return;

        if (node.left == null &&
                node.right == null) {
            if (node.data == key)
                return;
            else
                return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Node temp = null, keyNode = null;

        // Do level order traversal until
        // we find key and last node.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (keyNode != null) {
            int x = temp.data;
            deleteDeepest(temp);
            keyNode.data = x;
        }
    }

    @Override
    public void inorderWithoutRecursion() {
        if (root == null)
            return;


        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0) {

            /* Reach the left most Node of the
            curr Node */
            while (curr != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }


    // A utility function to search x in arr[] of size n
    public int search(int arr[], int x, int n)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }

    // Prints postorder traversal from
// given inorder and preorder traversals
    @Override
    public void printPostOrder(int in1[],
                               int pre[], int n)
    {
        // The first element in pre[] is
        // always root, search it in in[]
        // to find left and right subtrees
        int root = search(in1, pre[0], n);

        // If left subtree is not empty,
        // print left subtree
        if (root != 0)
            printPostOrder(in1, Arrays.copyOfRange(pre, 1, n), root);

        // If right subtree is not empty,
        // print right subtree
        if (root != n - 1)
            printPostOrder(Arrays.copyOfRange(in1, root+1, n),
                    Arrays.copyOfRange(pre, 1+root, n), n - root - 1);

        // Print root
        System.out.print( pre[0] + " ");
    }
    // Function to delete deepest
    // element in binary tree
    void deleteDeepest(Node delNode) {
        Node node = root;
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        Node temp = null;

        // Do level order traversal until last node
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode) {
                temp = null;
                return;

            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    q.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }
        }
    }
}
