package com.xingfeng.exer1.company;

import java.util.Arrays;

/**
 * 编程题] 微信红包
 春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。
 请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
 给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
 测试样例：
 [1,2,3,2,2],5
 返回：2
 * Created by Xingfeng on 2016/4/17.
 */
public class Gift {

    public int getValue(int[] gifts, int n) {

        Arrays.sort(gifts);

        int startIndex=gifts.length/2;
        int sum=1;
        //向前查找
        for(int i=startIndex-1;i>=0;i--){
            if(gifts[i]==gifts[startIndex])
                sum++;
            else
                break;
        }
        //向后查找
        for(int i=startIndex+1;i<gifts.length;i++){
            if(gifts[i]==gifts[startIndex])
                sum++;
            else
                break;
        }

        if(sum>gifts.length/2)
             return  gifts[startIndex];
        else return 0;
    }

}
