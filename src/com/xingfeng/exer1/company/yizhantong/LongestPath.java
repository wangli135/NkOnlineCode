package com.xingfeng.exer1.company.yizhantong;


/**
 * [编程题] 树上最长单色路径
 * 对于一棵由黑白点组成的二叉树，我们需要找到其中最长的单色简单路径，其中简单路径的定义是从树上的某点开始沿树边走不重复的点到树上的另一点结束而形成的路径，而路径的长度就是经过的点的数量(包括起点和终点)。而这里我们所说的单色路径自然就是只经过一种颜色的点的路径。你需要找到这棵树上最长的单色路径。
 * 给定一棵二叉树的根节点(树的点数小于等于300，请做到O(n)的复杂度)，请返回最长单色路径的长度。这里的节点颜色由点上的权值表示，权值为1的是黑点，为0的是白点。
 * Created by Xingfeng on 2016/5/3.
 */

/**
 * 思路：findPathRecur为以某一个节点查找单向最大长度，首先取左孩子的最大单向长度，再取右孩子的最大单向长度，比较两者
 * 中的大者，即为某一节点的单向最大长度。并在此过程中不断将左右总长度与最大值比较
 */
public class LongestPath {

    int max = 0;

    /**
     * 查找以节点开始的最长的单色简单路径
     *
     * @param root
     * @return 长度
     */
    public int findPath(TreeNode root) {

        findPathRecur(root);
        return max;

    }

    /**
     * 查找单方向最大长度
     *
     * @param root
     * @return
     */
    private int findPathRecur(TreeNode root) {

        if (root == null)
            return 0;

        int val = root.val;
        int leftLen = 0;
        int rightLen = 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left != null) {

            int ret = findPathRecur(left);
            if (left.val == val)
                leftLen = ret;

        }

        if (right != null) {
            int ret=findPathRecur(right);
            if(right.val==val)
               rightLen=ret;
        }

        if (1 + leftLen + rightLen > max)
            max = 1 + leftLen + rightLen;

        int t=Math.max(leftLen+1,rightLen+1);

        return t;
    }


    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
