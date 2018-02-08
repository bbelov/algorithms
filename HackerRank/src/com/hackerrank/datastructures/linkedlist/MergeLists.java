package com.hackerrank.datastructures.linkedlist;

public class MergeLists
{
    class Node {
        int data;
        Node next;
    }

    Node mergeLists(Node headA, Node headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        Node head = headA.data < headB.data ? headA : headB;
        Node current = head;
        Node currentA = headA, currentB = headB;
        for (; currentA != null && currentB != null; current = current.next) {
            if (currentA.data < currentB.data) {
                current = currentA;
                currentA = currentA.next;
            } else {
                current = currentB;
                currentB = currentB.next;
            }
        }
        if (currentA != null) {
            current.next = currentA;
        }
        if (currentB != null) {
            current.next = currentB;
        }
        return head;
    }
}
