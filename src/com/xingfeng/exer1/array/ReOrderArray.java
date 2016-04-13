package com.xingfeng.exer1.array;

/**
 * 题目描述

 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * Created by XINGFENG on 2016/4/13.
 */
public class ReOrderArray {

    public void reOrderArray(int [] array) {

        int oddIndex=0;//奇数索引
        int temp=0;
        for(int i=0;i<array.length;i++){

            //奇数
            if(array[i]%2==1){

                temp=array[i];
                System.arraycopy(array,oddIndex,array,oddIndex+1,(i-oddIndex));
                array[oddIndex++]=temp;

            }

        }

    }

}
