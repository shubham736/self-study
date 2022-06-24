package self.ds.linkedList;

class FlattenedLinkedList {
    static Node head;
    static class Node{
        int data;
        Node right,down;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        Node n1 = new Node(21);
        Node n2 = new Node(17);
        Node n3 = new Node(5);
        Node n4 = new Node(13);
        Node n5 = new Node(11);

        Node n12 = new Node(31);
        Node n13 = new Node(18);
        Node n14 = new Node(20);

        Node n21 = new Node(23);

        Node n31 = new Node(22);
        Node n32 = new Node(50);

        Node n41 = new Node(35);
        Node n42 = new Node(40);
        Node n43 = new Node(45);

        head = n1;
        n1.right = n2;
        n2.right = n3;
        n3.right = n4;
        n4.right = n5;

        n1.down = n12;
        n12.down = n13;
        n13.down = n14;

        n2.down = n21;

        n3.down = n31;
        n31.down = n32;

        n4.down = n41;
        n41.down = n42;
        n42.down = n43;
        Node temp = head;
        flatten(temp);
        printList();

    }

    private static Node flatten(Node node) {
        if(node == null || node.right == null)
            return node;
        node.right = flatten(node.right);
    //    node = merge(node, node.right);
        return node;
    }

    private static void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.down;
        }
        System.out.println("null");
    }

    private static Node merge(Node a, Node b)
    {
        // if first linked list is empty then second
        // is the answer
        if (a == null)     return b;

        // if second linked list is empty then first
        // is the result
        if (b == null)      return a;

        // compare the data members of the two linked lists
        // and put the larger one in the result
        Node result;

        if (a.data < b.data)
        {
            result = a;
            result.down =  merge(a.down, b);
        }

        else
        {
            result = b;
            result.down = merge(a, b.down);
        }

        result.right = null;
        return result;
    }
}
