package com.xingfeng.exer1.linkedlist;

import java.util.Stack;

/**
 * 题目描述

 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * Created by Xingfeng on 2016/4/10.
 */
public class TwoStackQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int val=0;
        if(!stack2.isEmpty())
           val=stack2.pop();

        while(!stack2.isEmpty())
            stack1.push(stack2.pop());

        return val;
    }

}
