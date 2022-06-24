package self.study;

import java.util.HashSet;
import java.util.Stack;

public class FindLoopInLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) {
        FindLoopInLinkedList loop = new FindLoopInLinkedList();
        loop.push(40);
        loop.push(12);
        loop.push(5);
        loop.push(23);

        rotate(2);
        printList(head);
      //  findMiddleElement();

       /* System.out.println("Before :- ");
        printList(head);
        //reverseUsingStack();
        reverse();
        //head = reverseWithRecursion(head);
        System.out.println();
        System.out.println("After :- ");
        printList(head);
        System.out.println();
*/

    /*
     //Create loop for testing
       loop.head.next.next.next.next = loop.head;
     if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("Not found");*/

 /*       Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        // Create a loop for testing
        head.next.next.next.next.next = head.next.next;
        Node node =  returnFirstElement(head);
        System.out.println("First element is "+ node.data);*/




/*
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);
        System.out.println("Linked list before removing duplicates :");
        printList(start);

        removeDuplicateNode(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
*/


    }

    static void findMiddleElement() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle element is " + slow.data);
    }

    private static boolean detectLoop(Node loop) {
        HashSet<Node> hashSet = new HashSet<>();
        while (loop != null) {
            if (hashSet.contains(loop))
                return true;
            hashSet.add(loop);
            loop = loop.next;
        }
        return false;
    }

    private static Node returnFirstElement(Node loop) {
        HashSet<Node> hashSet = new HashSet<>();
        while (loop != null) {
            if (hashSet.contains(loop))
                return loop;
            hashSet.add(loop);
            loop = loop.next;
        }
        return new Node(0);
    }

    // O(n) and O(1)
    private static void removeDuplicateNode(Node head) {
        Node current = head;
        Node prev = null;
        HashSet<Integer> hashSet = new HashSet<>();
        while (current != null) {
            int data = current.data;
            if (hashSet.contains(data)) {
                prev.next = current.next;
            } else {
                hashSet.add(data);
                prev = current;
            }

            current = current.next;
        }
    }


    static void reverseUsingStack() {
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp.next != null) {
            stack.push(temp);
            temp = temp.next;
        }
        head = temp;
        while (!stack.isEmpty()) {
            temp.next = stack.peek();
            stack.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    static void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    static Node reverseWithRecursion(Node head) {
        Node temp = head;
        if (temp == null || temp.next == null)
            return temp;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverseWithRecursion(temp.next);
        temp.next.next = temp;

        /* tricky step -- see the diagram */
        temp.next = null;

        /* fix the head pointer */
        head = rest;
        return rest;
    }

    // Function to Display
// the elements in List
    static void printList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void rotate(int k)
    {
        if (k == 0)
            return;

        // Let us understand the below code for example k = 4
        // and list = 10->20->30->40->50->60.
        Node current = head;

        // current will either point to kth or NULL after this
        // loop. current will point to node 40 in the above example
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        // If current is NULL, k is greater than or equal to count
        // of nodes in linked list. Don't change the list in this case
        if (current == null)
            return;

        // current points to kth node. Store it in a variable.
        // kthNode points to node 40 in the above example
        Node kthNode = current;

        // current will point to last node after this loop
        // current will point to node 60 in the above example
        while (current.next != null)
            current = current.next;

        // Change next of last node to previous head
        // Next of 60 is now changed to node 10

        current.next = head;

        // Change head to (k+1)th node
        // head is now changed to node 50
        head = kthNode.next;

        // change next of kth node to null
        kthNode.next = null;
    }
}
