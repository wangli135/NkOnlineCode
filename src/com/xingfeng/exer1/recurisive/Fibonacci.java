package com.xingfeng.exer1.recurisive;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * 递归当层次很多时，会造成栈溢出，这时需要使用迭代
 * Created by Xingfeng on 2016/4/10.
 */
public class Fibonacci {

    public static int Fibonacci(int n) {

        if(n<0)
            return 0;

        if(n<2)
            return n;

        int[] record=new int[n+1];
        record[0]=0;
        record[1]=1;

        for(int i=2;i<n+1;i++)
            record[i]=record[i-1]+record[i-2];

        return record[n];

    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }

}
