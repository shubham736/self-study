package com.amzon.tree;

import com.amzon.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CheckSymetricTree {
    public static void main(String[] args) {
        Node root = Node.setData();
        System.out.println(isSymetricTree(root));
    }

    private static boolean isSymetricTree(Node root) {
        if(root == null)
            return true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (queue != null){
            Node left = queue.remove();
            Node right = queue.remove();

            if(left == null && right == null)
                continue;
            if((left == null && right != null)|| (left != null && right == null))
                return  false;
            if(left.data != right.data)
                return false;

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
