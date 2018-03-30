package com.leetcode;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public class ReverseList {
    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static Node reverseList(Node head) {
        if (head != null) {
            Node current = head.next, prev = head, tmp;
            prev.next = null;
            while (current != null) {
                tmp = current.next;
                current.next = prev;
                prev = current;
                current = tmp;
            }
            head = prev;
        }
        return head;
    }

    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T=sc.nextInt();
            Node head=null;
            while(T-->0){
                int ele=sc.nextInt();
                head=insert(head,ele);
            }
            display(reverseList(head));
        }
    }
}
