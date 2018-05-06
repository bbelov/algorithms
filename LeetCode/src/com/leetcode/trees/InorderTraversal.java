package com.leetcode.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public static List<Integer> iterativeInorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left != null) {
                stack.push(node.left);
                node.left = null;
            } else {
                list.add(node.val);
                stack.pop();
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
        }
        return list;
    }

    public static List<Integer> recursiveInorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(list, root);
        return list;
    }

    private static void inorderTraversal(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(result, node.left);
        result.add(node.val);
        inorderTraversal(result, node.right);
    }
}
