package com.data.structure.LinkedList.main;

import com.data.structure.LinkedList.singlyLinkedList.SinglyLinkedList;

public class LinkListMainClass {
    public static void main(String[] args) {
        /* Start with the empty list. */
        SinglyLinkedList list = new SinglyLinkedList();
        // Insert the values
        list.prepend(1);
        list.prepend(14);
        list.prepend(5);
        list.prepend(6);
        list.prepend(4);
        list.prepend(14);
/*        list.append(13);
        list.append(63);

        list.insert(55, 2);*/

        list.printList(list);

/*        System.out.println("Size :-" + list.size());

        System.out.println("Remove First");
        list.removeFirst();
        list.printList(list);

        System.out.println("Remove Last");
        list.removeLast();
        list.printList(list);

        System.out.println("Remove at given Index");
        list.removeByIndex(2);
        list.printList(list);

        System.out.println("Remove at given Value");
        list.removeByValue(55);
        list.printList(list);

        System.out.println("Length of LinkedList By Iteration");
        System.out.println(list.length(false));

        System.out.println("Length of LinkedList by Recursive");
        System.out.println(list.length(true));

        System.out.println("Check for  element :" + list.isPresent(false, 4));
        System.out.println("Check for  element :" + list.isPresent(true, 112));

        System.out.println("Element at index 1 is : " + list.fetchByIndex(3, false));
        System.out.println("Element at index size - 1 is : " + list.fetchByIndexFromLast(list, 1, true));
        // System.out.println("Element at index size - 2 is : "+list.printNthFromLast(2));
        System.out.println(" Middle element of the list " + list.midValue());
        System.out.println(" Middle element of the list " + list.getMiddleElement());
        System.out.println(" Total 1 in list is " + list.count(1));*/

        /*Create loop for testing */
        // list.head.next.next.next.next = list.head;
      //  System.out.println(" Contains loop " + list.detectLoop());

       // System.out.println("List is Palindrome "+ list.isPalindrome());

/*        System.out.println("Duplicate ");
        list.removeDuplicateFromSortedList();
        list.printList(list);*/

        System.out.println(" Reverse ");
        list.reverse();
        list.printList(list);

        /*list = insert(list, 1);
        list = insert(list, 2);*/
    }
}
