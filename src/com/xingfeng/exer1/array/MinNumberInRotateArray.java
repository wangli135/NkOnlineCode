package com.xingfeng.exer1.array;

/**
 * 题目描述
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减序列的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * Created by Xingfeng on 2016/4/10.
 */
public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int[] array) {

        if(array.length==0)
            return 0;

        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>=array[i-1])
                continue;
            else
                return array[i];

        }

        return min;

    }

}
