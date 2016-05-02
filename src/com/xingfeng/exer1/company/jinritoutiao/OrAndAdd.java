package com.xingfeng.exer1.company.jinritoutiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 给定 x, k ，求满足 x + y = x | y 的第 k 小的正整数 y 。 | 是二进制的或(or)运算，例如 3 | 5 = 7。
 比如当 x=5，k=1时返回 2，因为5+1=6 不等于 5|1=5，而 5+2=7 等于 5 | 2 = 7。

 输入描述:
 每组测试用例仅包含一组数据，每组数据为两个正整数 x , k。 满足 0 < x , k ≤ 2,000,000,000。


 输出描述:
 输出一个数y。

 输入例子:
 5 1

 输出例子:
 2
 * Created by xingfeng on 16-5-2.
 */
public class OrAndAdd {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        long x=scanner.nextLong();
        long k=scanner.nextLong();

        if(x<0||x>2000000000)
            return;

        if(k<0||k>2000000000)
            return;

        long y=handle(x,k);
        System.out.println(y);

    }

    private static long handle(long x,long k){

        String xs=Long.toBinaryString(x);
        String ks=Long.toBinaryString(k);

        int xIndex=xs.length()-1,kIndex=ks.length()-1;

        StringBuilder sb=new StringBuilder();
        for(int i=xIndex;i>=0;i--){

            if(kIndex<0)
                break;

            if(xs.charAt(i)=='1')
                sb.append('0');
            else{
                sb.append(ks.charAt(kIndex--));
            }

        }

        while(kIndex>=0)
            sb.append(ks.charAt(kIndex--));

        String yS=sb.reverse().toString();

        return new BigInteger(yS,2).intValue();
    }


}
