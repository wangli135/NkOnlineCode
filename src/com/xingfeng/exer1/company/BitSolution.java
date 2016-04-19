package com.xingfeng.exer1.company;

/**
 * 题目描述

 世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 输入例子:
 1999 2299

 输出例子:
 7
 * Created by Xingfeng on 2016/4/18.
 */
public class BitSolution {

    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {

        int result=m^n;

        int sum=0;
        for(int i=0;i<32;i++){
           if((result&1)==1)
               sum++;
            result=result>>1;
        }

        return sum;

    }

    public static void main(String[] args) {
        BitSolution solution=new BitSolution();
        System.out.println(solution.countBitDiff(1999,2299));
    }

}
