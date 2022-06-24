package com.data.structure.LinkedList.singlyLinkedList;

import com.data.structure.LinkedList.node.Node;

public interface SinglyLinkedListImpl {

    void printList(SinglyLinkedList list);

    void prepend(int data);

    SinglyLinkedList insert(SinglyLinkedList list, int data);

    void append(int data);

    void insert(int data, int index);

    int size();

    void removeFirst();

    Node removeLast();

    void removeByIndex(int index);

    void removeByValue(int key);

    int length(boolean byRecursion);

    boolean isPresent(boolean byRecursion, int data);

    int fetchByIndex(int index, boolean byRecursion);

    int fetchByIndexFromLast(SinglyLinkedList singlyLinkedList, int index, boolean byRecursion);

    void printNthFromLast(int n);

    int midValue();

    int getMiddleElement();

    int count(int key);

    boolean detectLoop();

    int countNodesInLoop(Node list);

    boolean isPalindrome();

    void removeDuplicateFromSortedList();

    void reverse();

    Node rotateList(int k);

}
