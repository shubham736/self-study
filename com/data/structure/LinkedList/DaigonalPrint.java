package com.data.structure.LinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

class Test2 {
    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);

        root.daigonalPrint(root);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }


    static void daigonalPrint(Node root) {
        HashMap<Integer, Vector<Integer>> hashMap = new HashMap<>();
        daigonalPrint(root, 0, hashMap);
        for (Map.Entry<Integer, Vector<Integer>> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    private static void daigonalPrint(Node root, int i, HashMap<Integer, Vector<Integer>> hashMap) {
        if (root == null)
            return;
        Vector<Integer> vector = hashMap.get(i);
        if (vector == null) {
            vector = new Vector<>();
            vector.add(root.data);
        } else {
            vector.add(root.data);
        }

        hashMap.put(i, vector);
        daigonalPrint(root.left, i + 1, hashMap);
        daigonalPrint(root.right, i, hashMap);
    }

}
