package com.xingfeng.exer1.tree;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * Created by Xingfeng on 2016/4/10.
 */
public class RebuildTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if(pre.length==0)
            return null;

        if(pre.length==1)
            return new TreeNode(pre[0]);

        TreeNode root=new TreeNode(pre[0]);
        int partion=0;
        for(partion=0;partion<in.length;partion++){
            if(in[partion]==pre[0])
                break;
        }

        int[] leftPre=new int[partion];
        int[] leftIn=new int[partion];
        int[] rightPre=new int[in.length-partion-1];
        int[] rightIn=new int[in.length-partion-1];

        System.arraycopy(pre,1,leftPre,0,partion);
        System.arraycopy(pre,partion+1,rightPre,0,pre.length-partion-1);
        System.arraycopy(in,0,leftIn,0,partion);
        System.arraycopy(in,partion+1,rightIn,0,in.length-partion-1);


        root.left=reConstructBinaryTree(leftPre,leftIn);
        root.right=reConstructBinaryTree(rightPre,rightIn);

        return root;

    }

}
