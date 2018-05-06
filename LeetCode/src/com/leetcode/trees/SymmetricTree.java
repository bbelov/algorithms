package com.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static boolean isSymmetricIterative(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while (!q.isEmpty()) {
            TreeNode leftTree = q.remove();
            TreeNode rightTree = q.remove();
            if (leftTree == null && rightTree == null) {
                continue;
            }
            if (leftTree == null || rightTree == null) {
                return false;
            }
            if (leftTree.val == rightTree.val) {
                q.offer(leftTree.left);
                q.offer(rightTree.right);
                q.offer(leftTree.right);
                q.offer(rightTree.left);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetricRecusive(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root, root);
    }

    private static boolean isSymmetric(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null || rightTree == null) {
            return false;
        }
        if (leftTree.val == rightTree.val) {
            return isSymmetric(leftTree.left, rightTree.right) && isSymmetric(leftTree.right, rightTree.left);
        }
        return false;
    }
}
