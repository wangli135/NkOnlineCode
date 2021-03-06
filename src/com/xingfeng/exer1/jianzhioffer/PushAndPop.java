package com.xingfeng.exer1.jianzhioffer;

import java.util.Stack;

/**栈的压入、弹出序列
 参与人数：3740时间限制：1秒空间限制：32768K
 本题知识点： 栈
 算法知识视频讲解
 题目描述
 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * Created by xingfeng on 16-5-6.
 */
public class PushAndPop {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if(pushA.length==0||popA.length==0)
            return false;

        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0,j=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while((!stack.isEmpty())&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();

    }

}
