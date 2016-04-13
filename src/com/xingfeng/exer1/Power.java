package com.xingfeng.exer1;

/**
 * 题目描述

 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * Created by XINGFENG on 2016/4/13.
 */
public class Power {

    public double power(double base, int exponent) {

        double result=1.0;
        for(int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }

        if(exponent<0)
            result=1/result;


        return result;



    }

    public static void main(String[] args) {

        Power power=new Power();
        System.out.println(power.power(2,-3));

    }
}
