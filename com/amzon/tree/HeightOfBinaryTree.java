package com.amzon.tree;

public class HeightOfBinaryTree {
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
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Heigth of tree is :  "+ heigthOfTree(tree.root));
    }

    private static int heigthOfTree(Node node) {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = heigthOfTree(node.left);
            int rDepth = heigthOfTree(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
