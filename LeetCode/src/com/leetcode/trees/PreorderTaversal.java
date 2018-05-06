package com.leetcode.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTaversal {

    public static List<Integer> iterativePreorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    public static List<Integer> recursivePreorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(list, root);
        return list;
    }

    private static void preorderTraversal(List<Integer> list, TreeNode node) {
        if (node != null) {
            list.add(node.val);
            preorderTraversal(list, node.left);
            preorderTraversal(list, node.right);
        }
    }
}
