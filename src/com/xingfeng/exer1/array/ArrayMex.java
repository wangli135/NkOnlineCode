package com.xingfeng.exer1.array;

/**
 * 题目描述

 请设计一个高效算法，查找数组中未出现的最小正整数。
 给定一个整数数组A和数组的大小n，请返回数组中未出现的最小正整数。保证数组大小小于等于500。
 测试样例：
 [-1,2,3,4],4
 返回：1
 * Created by Xingfeng on 2016/4/10.
 */
public class ArrayMex {


    public int findArrayMex(int[] A, int n) {

        /*//我的思路：排序，再遍历
        Arrays.sort(A);
        int min=1;
        for(int i=0;i<n;i++){

            if(A[i]<=0)
                continue;
            else{
                if(min==A[i])
                    min=A[i]+1;
                else if(min<A[i])
                    return min;
                else
                    continue;
            }
        }
        return min;*/

        //好的思路，空间换时间，hash，将值作为hash表的键，出现作为1
        int[] a=new int[500];
        for(int i=0;i<n;i++){
            if(A[i]>0)
                a[A[i]]=1;
        }

        for(int j=1;j<a.length;j++)
            if(a[j]==0)
                return j;
        return 1;
    }

    public static void main(String[] args) {
        int[] A={0,5,3,5,1,2};
        System.out.println(new ArrayMex().findArrayMex(A,6));
    }

}
