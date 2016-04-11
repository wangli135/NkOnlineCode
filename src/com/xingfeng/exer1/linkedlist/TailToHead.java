package com.xingfeng.exer1.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
 * <p>
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 输入描述:
 * 输入为链表的表头
 * <p>
 * <p>
 * 输出描述:
 * 输出为需要打印的“新链表”的表头
 * Created by Xingfeng on 2016/4/10.
 */
public class TailToHead {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack=new Stack<Integer>();
        ListNode cur=listNode;
        while(cur!=null){
            stack.push(cur.val);
            cur=cur.next;
        }

        ArrayList<Integer> list=new ArrayList<Integer>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

}
