package self.ds.trees;

import java.util.List;

public class CreateBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node root;
    static List<Integer> preOrder;

    static void insertNode(int data) {
        root = insertNode(root, data);
    }

    static Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        insertNode(50);
        insertNode(30);
        insertNode(20);
        insertNode(40);
        insertNode(70);
        insertNode(60);
        insertNode(80);

        inOrder();
        System.out.println();
        preOrder();
        System.out.println();
        postOrder();
        System.out.println();
        Node temp = search(root, 20);
        System.out.println(temp.data);

        preOrderToBST(preOrder.toArray());
    }

    private static void preOrderToBST(Object[] arr) {
        if (arr.length != 0) {
            Node root = new Node((Integer) arr[0]);
            for (int i = 1; i < arr.length - 1; i++) {

            }
        }
    }

    private static Node search(Node root, int key) {
        if (root == null || root.data == key)
            return root;
        if (root.data > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    private static void postOrder() {
        postOrder(root);
    }

    private static void postOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static void preOrder() {
        preOrder(root);
    }

    private static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder.add(root.data);
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    private static void inOrder() {
        inOrder(root);
    }

    private static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

}
