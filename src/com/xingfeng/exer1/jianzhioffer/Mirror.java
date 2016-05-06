package com.xingfeng.exer1.jianzhioffer;

/**
 * 二叉树的镜像
 参与人数：4704时间限制：1秒空间限制：32768K
 算法知识视频讲解
 题目描述

 操作给定的二叉树，将其变换为源二叉树的镜像。
 输入描述:
 二叉树的镜像定义：源二叉树
 8
 /  \
 6   10
 / \  / \
 5  7 9 11
 镜像二叉树
 8
 /  \
 10   6
 / \  / \
 11 9 7  5
 * Created by xingfeng on 16-5-6.
 */
public class Mirror {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode root) {

        if(root==null)
            return;

        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=right;
        root.right=left;

        Mirror(root.left);
        Mirror(root.right);

    }

}
