package self.ds.linkedList;

import java.util.Collections;

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public static void main(String[] args) {
            Node n1 = new Node(21);
            Node n2 = new Node(1);
            Node n3 = new Node(6);
            Node n4 = new Node(32);
            Node n5 = new Node(11);
            Node n6 = new Node(10);
            head = n1;
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;
            printNode();
           // Node middleNode = getMiddleElementOfList(head);
            //System.out.println(middleNode.data);

            mergeSort(head);
             printNode();
        }

        private static Node mergeSort(Node head) {
        if(head == null || head.next == null)
            return  head;
//   35 8 9 5 6 3
         Node middle =  getMiddle(head);
         Node middleNext = middle.next;

         middle.next = null;

         Node left =  mergeSort(head);
         Node right =  mergeSort(middleNext);

         Node sortedList = mergeSort(left,right);

         return sortedList;
        }

        private static Node mergeSort(Node left, Node right){
            if(left == null)
                return right;
            if(right == null)
                return left;
            Node result ;
            if(left.data < right.data){
                result = left;
                result.next = mergeSort(left.next,right);
            }else{
                result = right;
                result.next = mergeSort(left,right.next);
            }
            return  result;
        }
        private static Node getMiddleElementOfList(Node head) {
            if (head == null)
                return null;
            Node currNode = head;
            Node prevNode = currNode;
            Node nextNode;
            while (currNode.next != null && currNode.next.next != null) {
                nextNode = currNode.next.next;
                prevNode = currNode;
                currNode = nextNode;
            }
            return prevNode;
        }

        private static Node getMiddle(Node head) {
            Node slow_ptr = head;
            Node fast_ptr = head;

            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            return  slow_ptr;
        }

        private static void printNode() {
            if (head == null)
                return;
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
