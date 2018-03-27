package com.leetcode;

import java.util.Scanner;

public class AddTwoLists {
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int x) {
            data = x;
            next = null;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode sumList = null, tmp = sumList, tmp1 = l1, tmp2 = l2;
            int remainder = 0;
            while (tmp1 != null || tmp2 != null) {
                int sum = remainder;
                if (tmp1 != null) {
                    sum += tmp1.data;
                    tmp1 = tmp1.next;
                }
                if (tmp2 != null) {
                    sum += tmp2.data;
                    tmp2 = tmp2.next;
                }
                remainder = sum / 10;
                ListNode node = new ListNode(sum % 10);
                if (tmp == null) {
                    sumList = node;
                    tmp = node;
                } else {
                    tmp.next = node;
                    tmp = node;
                }
            }
            if (remainder != 0) {
                ListNode node = new ListNode(remainder);
                tmp.next = node;
            }
            return sumList;
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            ListNode l1 = null, tmp = null;
            for (int i = 0; i < size; i ++) {
                ListNode node = new AddTwoLists().new ListNode(sc.nextInt());
                if (l1 == null) {
                    l1 = node;
                    tmp = node;
                } else {
                    tmp.next = node;
                    tmp = node;
                }
            }
            size = sc.nextInt();
            ListNode l2 = null;
            tmp = null;
            for (int i = 0; i < size; i ++) {
                ListNode node = new AddTwoLists().new ListNode(sc.nextInt());
                if (l2 == null) {
                    l2 = node;
                    tmp = node;
                } else {
                    tmp.next = node;
                    tmp = node;
                }
            }
            Solution s = new AddTwoLists().new Solution();
            ListNode l3 = s.addTwoNumbers(l1, l2);
            for(tmp = l3; tmp != null; tmp = tmp.next) {
                System.out.print(tmp.data + " ");
            }
            System.out.println();
        }
    }
}
