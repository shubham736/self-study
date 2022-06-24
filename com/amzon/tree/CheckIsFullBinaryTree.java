package com.amzon.tree;

import com.amzon.Node;

public class CheckIsFullBinaryTree {

    public static void main(String[] args) {
        Node root = Node.setData();
        System.out.println(isFullTree(root));
    }

    private static boolean isFullTree(Node root) {
        if(root == null)
            return  true;
        if(root.left == null && root.right == null)
            return  true;
        if(root.left !=null && root.right != null){
           return (isFullTree(root.left) && isFullTree(root.right));
        }
        return false;
    }
}
