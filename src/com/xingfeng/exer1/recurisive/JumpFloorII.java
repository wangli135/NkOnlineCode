package com.xingfeng.exer1.recurisive;

/**
 * 题目描述

 一只青蛙一次可以跳上1级台阶，
 也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * Created by Xingfeng on 2016/4/10.
 */
public class JumpFloorII {

    public static int jumpFloorII(int target) {

        if(target==1)
            return 1;

        int sum=0;
        for(int i=1;i<target;i++)
            sum+=jumpFloorII(i)*jumpFloorII(target-i);
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(jumpFloorII(4));

    }

}
