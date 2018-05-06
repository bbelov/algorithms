package com.leetcode.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public static List<Integer> iterativePostorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        while(!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left == null && node.right == null) {
                stack.pop();
                list.add(node.val);
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                    node.right = null;
                }
                if (node.left != null) {
                    stack.push(node.left);
                    node.left = null;
                }
            }
        }
        return list;
    }

    public static List<Integer> recursivePostorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderTraversal(list, root);
        return list;
    }

    private static void postOrderTraversal(List<Integer> list, TreeNode node) {
        if (node != null) {
            postOrderTraversal(list, node.left);
            postOrderTraversal(list, node.right);
            list.add(node.val);
        }
    }
}
