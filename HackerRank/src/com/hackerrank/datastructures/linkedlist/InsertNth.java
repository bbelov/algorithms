package com.hackerrank.datastructures.linkedlist;

import java.util.Scanner;

public class InsertNth
{
    class Node {
        int data;
        Node next;
    }

    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node node = new Node();
        node.data = data;
        Node tmp = head, prev = head;
        if (position == 0) {
            node.next = head;
            return node;
        }
        for (int i = 0; tmp != null; prev = tmp, tmp = tmp.next, i++) {
            if (position == i) {
                node.next = tmp;
                prev.next = node;
                break;
            }
        }
        if (tmp == null) { // insert the element as the last one
            node.next = null;
            prev.next = node;
        }
        return head;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int total = s.nextInt();
            InsertNth ins = new InsertNth();
            Node head = null;
            for (int i = 0; i < total; i++) {
                int data = s.nextInt();
                int position = s.nextInt();
                head = ins.InsertNth(head, data,  position);

                // print list
                for (Node tmp = head; tmp != null; tmp = tmp.next) {
                    System.out.print(tmp.data);
                }
                System.out.println();
            }
        }
    }

}
