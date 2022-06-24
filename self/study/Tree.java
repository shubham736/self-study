package self.study;

import java.util.HashSet;

public class Tree {
    private Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
  /*      Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node sub = new Node(2);
        sub.left = new Node(4);
        sub.right = new Node(5);

        Node specialParent = new Node(1);
        sub.left = new Node(2);
        sub.left.left = new Node(4);
        sub.right = new Node(3);
        sub.right.right = new Node(5);

        Node specialChild = new Node(1);
        sub.left = new Node(2);
        sub.left.left = new Node(4);
        sub.right = new Node(3);*/

        //printNodeAtKth(root,2);
        //printAncestors(root, 4);
  /*      if(identicalTree(root,sub)){
            System.out.println("Identical ");
        }else {
            System.out.println("Not Identical ");
        }*/
     /*   if (isSubTree(specialChild, specialParent)) {
            System.out.println("Sub tree ");
        } else {
            System.out.println("Not Sub tree ");
        }*/

  /*      HashSet<Integer> hashSet = new HashSet<>();
        if (checkDuplicateValue(root, hashSet)) {
            System.out.println("Duplicate ");
        } else {
            System.out.println("Not Duplicate ");
        }*/



        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.right = new Node('B');
        root.right.right.right = new Node('E');
        root.right.right.left= new Node('D');
        String str = dupSub(root);
        if(str.equals(""))
            System.out.print(" Yes ");
        else
            System.out.print(" No ");
    }

    private static void printNodeAtKth(Node root, int k) {
        if (root == null || k < 0)
            return;
        if (k == 0) {
            System.out.println(root.data + " ");
        } else {
            printNodeAtKth(root.left, k - 1);
            printNodeAtKth(root.right, k - 1);
        }
    }


    private static boolean printAncestors(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (printAncestors(root.left, key) || printAncestors(root.right, key)) {
            System.out.println(" " + root.data);
            return true;
        }
        return false;
    }


    private static boolean identicalTree(Node parent, Node sub) {
        if (parent == null && sub == null)
            return true;
        if (parent == null || sub == null)
            return false;
        return (parent.data == sub.data
                && identicalTree(parent.left, sub.left)
                && identicalTree(parent.right, sub.right));
    }

    private static boolean isSubTree(Node parent, Node sub) {
        if (sub == null)
            return true;
        if (parent == null)
            return false;
        if (identicalTree(parent, sub))
            return true;
        return isSubTree(parent.left, sub) || isSubTree(parent.right, sub);
    }

    private static boolean checkDuplicateValue(Node root, HashSet<Integer> integers) {
        if (root == null)
            return false;
        if (integers.contains(root.data))
            return true;
        integers.add(root.data);
        return checkDuplicateValue(root.left, integers) || checkDuplicateValue(root.right, integers);
    }

    static char MARKER = '$';

    // This function returns empty string if tree
    // contains a duplicate subtree of size 2 or more.
    public static String dupSubUtil(Node root, HashSet<String> subtrees) {
        String s = "";

        // If current node is NULL, return marker
        if (root == null)
            return s + MARKER;

        // If left subtree has a duplicate subtree.
        String lStr = dupSubUtil(root.left, subtrees);
        if (lStr.equals(s))
            return s;

        // Do same for right subtree
        String rStr = dupSubUtil(root.right, subtrees);
        if (rStr.equals(s))
            return s;

        // Serialize current subtree
        s = s + root.data + lStr + rStr;

        // If current subtree already exists in hash
        // table. [Note that size of a serialized tree
        // with single node is 3 as it has two marker
        // nodes.
        if (s.length() > 3 && subtrees.contains(s))
            return "";

        subtrees.add(s);
        return s;
    }

    //Function to find if the Binary Tree contains duplicate
    //subtrees of size 2 or more
    public static String dupSub(Node root) {
        HashSet<String> subtrees = new HashSet<>();
        String result = dupSubUtil(root, subtrees);
        return result;
    }
}
