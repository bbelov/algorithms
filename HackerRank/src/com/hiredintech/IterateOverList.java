package com.hiredintech;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IterateOverList {
    public static int jump_over_numbers(List<Integer> list) {
        ListIterator<Integer> it = list.listIterator();
        int jumps = 0;
        while (it.hasNext()) {
            Integer num = it.next();
            if (num == 0) {
                jumps = -1;
                break;
            }
            jumps++;
            int idx = it.nextIndex() - 1 + num;
            if (idx > list.size()) {
                break;
            }
            it = list.listIterator(idx);
        }
        return jumps;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < n; i ++) {
                lst.add(s.nextInt());
            }
            System.out.println(jump_over_numbers(lst));
        }
    }
}
