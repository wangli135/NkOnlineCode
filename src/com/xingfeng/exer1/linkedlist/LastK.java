package com.xingfeng.exer1.linkedlist;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * Created by Xingfeng on 2016/4/10.
 */
public class LastK {

    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {

        if(k==0)
            return null;

        Stack<ListNode> stack=new Stack<ListNode>();
        ListNode cur=head;
        while (cur != null) {
            stack.push(cur);
            cur=cur.next;
        }

        if(k>stack.size())
            return null;

        while(k>1){
            stack.pop();
            k--;
        }

        return stack.pop();


    }

}
