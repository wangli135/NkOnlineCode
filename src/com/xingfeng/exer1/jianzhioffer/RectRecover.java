package com.xingfeng.exer1.jianzhioffer;

/**
 * 矩形覆盖
 参与人数：6568时间限制：1秒空间限制：32768K
 算法知识视频讲解
 题目描述

 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 总共有多少种方法？
 * Created by xingfeng on 16-5-6.
 */
public class RectRecover {

    public int RectCover(int target) {

        if(target<3)
            return target;
        else
            return RectCover(target-2)+RectCover(target-1)-1;


    }

}
