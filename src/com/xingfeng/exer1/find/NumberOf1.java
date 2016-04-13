package com.xingfeng.exer1.find;

/**
 * 题目描述

 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * Created by XINGFENG on 2016/4/13.
 */
public class NumberOf1{

    public int  numberOf1(int n) {

        int i=0;
        int result=0;
        while(i<32){
            int temp=n&1;
            if(temp==1)
                result++;
            n=n>>1;
            i++;
        }
       return result;
    }

    public static void main(String[] args) {

        NumberOf1 demo=new NumberOf1();
        System.out.println(demo.numberOf1(65535));

    }

}
