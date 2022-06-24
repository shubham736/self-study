package com.data.structure.LinkedList.singlyLinkedList;

import com.data.structure.LinkedList.node.Node;

import java.util.HashSet;
import java.util.Stack;

// Java program to implement
// A Singly Linked List
public class SinglyLinkedList implements SinglyLinkedListImpl {

    public static Node head; // head of list

    // Method to print the LinkedList.
    public void printList(SinglyLinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Method to insert a new node at front
    public void prepend(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;

        }
    }


    // Method to insert a new node at end
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node node = new Node(data);
            temp.next = node;

        }
    }

    // Method to insert a new node at end
    public void insert(int data, int index) {
        if (index < 0) {
            throw new RuntimeException("Invalid index provided");
        } else {
            int counter = 0;
            Node temp = head;
            while (counter < index - 1 && temp != null) {
                temp = temp.next;
                counter++;
            }
            if (size() < index) {
                throw new RuntimeException("List size is lesser than the index");
            } else {
                Node hold = temp.next;
                Node node = new Node(data);
                temp.next = node;
                node.next = hold;
            }
        }
    }

    public int size() {
        Node temp = head;
        int counter = 1;
        while (temp.next != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    // Method to insert a new node
    public SinglyLinkedList insert(SinglyLinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public void removeFirst() {
        head = head.next;
    }

    // time complexity O(n) ,, nad space O(1)
    public Node removeLast() {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }

        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;
        return head;

    }

    public void removeByIndex(int index) {
        if (head == null)
            return;
        Node temp = head;
        if (index == 0) {
            head = temp.next;
            return;
        }
        int counter = 0;
        while (temp.next != null && counter < index - 1) {
            temp = temp.next;
            counter++;
        }
/*          OR

    // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<index-1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;*/
        Node next = temp.next.next;
        temp.next = next;


    }

    public void removeByValue(int key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    @Override
    public int length(boolean byRecursion) {
        if (byRecursion) {
            return getCountRecursive(head);
        } else {
            Node temp = head;
            int counter = 1;
            if (temp == null)
                return 0;
            while (temp != null && temp.next != null) {
                temp = temp.next;
                counter++;
            }
            return counter;
        }
    }

    /* Returns count of nodes in linked list */
    public int getCountRecursive(Node node) {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRecursive(node.next);
    }

    @Override
    public boolean isPresent(boolean byRecursion, int key) {
        if (byRecursion) {
            Node temp = head;
            return search(temp, key);
        } else {
            Node node = head;
            while (node != null) {
                if (node.data == key)
                    return true;
                node = node.next;
            }
            return false;
        }
    }

    @Override
    public int fetchByIndex(int index, boolean byRecursion) {
        if (byRecursion) {
            return GetNth(head, index);
        } else {
            Node temp = head;

            if (index < 0) {
                throw new RuntimeException("Invalid index provided");
            }

            if (temp == null) {
                throw new RuntimeException("List is empty");
            }
            int counter = 0;
            while (temp.next != null && counter != index) {
                temp = temp.next;
                counter++;
            }
            return temp.data;
        }
    }

    // Checks whether the value x is present
    // in linked list
    public boolean search(Node head, int key) {
        // Base case
        if (head == null)
            return false;

        // If key is present in current node,
        // return true
        if (head.data == key)
            return true;

        // Recur for remaining list
        return search(head.next, key);
    }


    int GetNth(Node head, int n) {
        int count = 0;
        if (head == null) // edge case - if head is null
            return -1;
        // if count equal too n return node.data
        if (count == n)
            return head.data;

        // recursively decrease n and increase
        // head to next pointer
        return GetNth(head.next, n - 1);
    }

    @Override
    public int fetchByIndexFromLast(SinglyLinkedList singlyLinkedList, int index, boolean byRecursion) {
        int size = singlyLinkedList.size();
        if (size < index) {
            throw new RuntimeException("Invalid Index");
        }
        int frontIndex = size - index;
        return singlyLinkedList.fetchByIndex(frontIndex, true);

    }

    public void printNthFromLast(int n) {
        printNthFromLast(head, n);
    }

    @Override
    public int midValue() {
        Node current = head;
        Node doubleNextNode = head;

        if (current == null)
            return 0;
        while (doubleNextNode != null && doubleNextNode.next != null) {

            current = current.next;
            doubleNextNode = doubleNextNode.next.next;

        }
        return current.data;
    }

    public void printNthFromLast(Node head, int n) {  // che4ck
        int i = 0;
        if (head == null)
            return;
        printNthFromLast(head.next, n);
        if (++i == n)
            System.out.print(head.data);
    }


    // Function to get the middle of
// the linked list
    public int getMiddleElement() {

        int count = 0;
        Node mid = head;

        while (head != null) {

            // Update mid, when 'count'
            // is odd number
            if ((count % 2) == 1)
                mid = mid.next;

            ++count;
            head = head.next;
        }

        // If empty list is provided
        if (mid != null)
            return mid.data;
        return 0;
    }

    @Override
    public int count(int key) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == key)
                count++;
            current = current.next;
        }
        return count;
    }

    public boolean detectLoop() {
        HashSet<Node> nodeHashSet = new HashSet<>();
        Node node = head;
        if (node != null) {
            if (nodeHashSet.contains(node)) {
                return true;
            }
            nodeHashSet.add(node);
            node = node.next;
        }
        //  Implementation of Floyd’s Cycle-Finding Algorithm:
        // Correct
       /* Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
         */
        return false;
    }


    // Returns count of nodes present in loop.
    public int countNodes(Node n) {
        int res = 1;
        Node temp = n;
        while (temp.next != n) {
            res++;
            temp = temp.next;
        }
        return res;
    }

    /* This function detects and counts loop
    nodes in the list. If loop is not there
    in then returns 0 */
    public int countNodesInLoop(Node list) {  // check
        Node slow_p = list, fast_p = list;

        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

        /* If slow_p and fast_p meet at some point
        then there is a loop */
            if (slow_p == fast_p)
                return countNodes(slow_p);
        }

        /* Return 0 to indeciate that ther is no loop*/
        return 0;
    }

    @Override
    public boolean isPalindrome() {
        boolean isPalindrome = true;
        Node temp = head;
        Stack<Integer> nodeStack = new Stack<>();
        while (temp != null) {
            nodeStack.push(temp.data);
            temp = temp.next;
        }
        while (head != null) {
            if (head.data == nodeStack.pop()) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }

    @Override
    public void removeDuplicateFromSortedList() {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

    }

    public void reverse() {
        Node node = head;
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        head = node;
    }

    @Override
    public Node rotateList(int k) {
        if (head == null)
            return head;
        // len is used to store length of the linked list
        // tmp will point to the last node after this loop
        Node tmp = head;
        int len = 1;
        while (tmp.next != null) {
            tmp = tmp.next;
            len++;
        }
        // If k is greater than the size
        // of the linked list
        if (k > len)
            k = k % len;
        // Subtract from length to convert
        // it into left rotation
        k = len - k;
        // If no rotation needed then
        // return the head node
        if (k == 0 || k == len)
            return head;
        // current will either point to
        // kth or null after this loop
        Node current = head;
        int cnt = 1;
        while (cnt < k && current != null) {
            current = current.next;
            cnt++;
        }
        // If current is null then k is equal to the
        // count of nodes in the list
        // Don't change the list in this case
        if (current == null)
            return head;
        // current points to the kth node
        Node kthnode = current;
        tmp.next = head;
        head = kthnode.next;
        kthnode.next = null;
        return head;
    }

}
