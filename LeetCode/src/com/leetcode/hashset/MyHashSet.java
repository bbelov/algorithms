package com.leetcode.hashset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyHashSet {
        class Item {
            int key;
            Item next;

            public Item(int key) {
                this.key = key;
                next = null;
            }
        }
        private Item[] buckets;

        /** Initialize your data structure here. */
        public MyHashSet() {
            buckets = new Item[10000];
        }

        public void add(int key) {
            int index = hash(key);
            // validate if the key already in the set
            Item current = buckets[index], prev = null;
            while (current != null) {
                if (current.key == key) {
                    return; // found the key, no need to continue
                }
                current = current.next;
            }
            Item item = new Item(key);
            if (prev == null) {
                buckets[index]  = item;
            } else {
                prev.next = item;
            }
        }

        public void remove(int key) {
            int index = hash(key);
            Item current = buckets[index], prev = null;
            while (current != null) {
                if (current.key == key) {
                    if (prev != null) {
                        prev.next = current.next;
                    } else {
                        buckets[index] = current.next;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }

        /** Returns true if this set did not already contain the specified element */
        public boolean contains(int key) {
            int index = hash(key);
            Item current = buckets[index];
            while (current != null) {
                if (current.key == key) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        private int hash(int key) {
            return key % buckets.length;
        }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("/Users/borisbelov/src/algorithms/inputx.txt"))) {
            String cmds = sc.nextLine();
            cmds = cmds.replace(',', ' ');
            cmds = cmds.replace('\"', ' ');
            cmds = cmds.replace('[', ' ');
            String[] commands = cmds.split("\\s+");

            String vals = sc.nextLine();
            vals = vals.replace('[', ' ');
            vals = vals.replace(']', ' ');
            vals = vals.replace(',', ' ');
            String[] values = vals.split("\\s+");

            MyHashSet set = new MyHashSet();
            for (int i = 2; i < values.length; i++) {
                switch (commands[i]) {
                    case "add" :
                        set.add(Integer.valueOf(values[i-1]));
                        break;
                    case "contains":
                        set.contains(Integer.valueOf(values[i-1]));
                        break;
                    case "remove":
                        set.remove(Integer.valueOf(values[i-1]));
                        break;
                }
                System.out.println("[" + i + "]:" + commands[i] + " " + values[i-1]);
            }
            System.out.println(set);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
