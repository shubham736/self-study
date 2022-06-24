package program.interview;

public class IsBinarySearchTree {
     Node root;
    public static void main(String[] args) {
        IsBinarySearchTree tree = new IsBinarySearchTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

     boolean isBST(){
        return isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE );
    }
    static  boolean isBST(Node root,int min, int max){
    if(root == null)
        return true;
    if(root.data < min || root.data > max)
        return  false;
    return (isBST(root.left,min,root.data-1) && isBST(root.right,root.data+1,max));
    }
}
class Node {
    int data;
    Node left ,right;
    public Node(int item){
        data = item;
        left =  right = null;
    }
}

