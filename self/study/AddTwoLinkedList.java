package self.study;

import java.util.Stack;

public class AddTwoLinkedList {
    static Node result, list1, list2;

    static class Node {
         int data;
         Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void push(int i, Node list) {
        Node node = new Node(i);
        node.next = list;
        list = node;
    }

    public static void main(String[] args) {
        int arr1[] = {5, 6, 7};
        int arr2[] = {1, 8};

        int size1 = 3;
        int size2 = 2;

        Node start = new Node(5);
        start.next = new Node(6);
        start.next.next = new Node(7);
        list1 = start;
        Node start1 = new Node(1);
        start1.next = new Node(8);
        list2 = start1;
        result = addTwoNumbers();

        printList(result);
    }

    private static Node addTwoNumbers() {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (list1 != null) {
            stack1.add(list1.data);
            list1 = list1.next;
        }
        while (list2 != null) {
            stack2.add(list2.data);
            list2 = list2.next;
        }
        int carry = 0;
        Node result = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int a = 0, b = 0;
            if (!stack1.isEmpty()) {
                a = stack1.pop();
            }
            if (!stack2.isEmpty()) {
                b = stack2.pop();
            }
            int total = a + b + carry;
            Node temp = new Node(total % 10);
            carry = total / 10;

            if (result != null) {
                temp.next = result;
            }
            result = temp;
        }

        if (carry != 0) {
            Node temp = new Node(carry);
            temp.next = result;
            result = temp;
        }
        return result;
    }

    static void printList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
