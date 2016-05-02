package com.xingfeng.exer1.company.jinritoutiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 你作为一名出道的歌手终于要出自己的第一份专辑了，你计划收录 n 首歌而且每首歌的长度都是 s 秒，每首歌必须完整地收录于一张 CD 当中。每张 CD 的容量长度都是 L 秒，而且你至少得保证同一张 CD 内相邻两首歌中间至少要隔 1 秒。为了辟邪，你决定任意一张 CD 内的歌数不能被 13 这个数字整除，那么请问你出这张专辑至少需要多少张 CD ？

 输入描述:
 每组测试用例仅包含一组数据，每组数据第一行为三个正整数 n, s, L。 保证 n ≤ 100 , s ≤ L ≤ 10000


 输出描述:
 输出一个整数代表你至少需要的 CD 数量。

 输入例子:
 7 2 6

 输出例子:
 4
 * Created by xingfeng on 16-5-2.
 */
public class CDNum {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n=scanner.nextInt();
        int s=scanner.nextInt();
        int l=scanner.nextInt();

        if(n>100)
            return;

        if(s>l)
            return;

        if(l>10000)
            return;

        int cdnum=handle(n,s,l);
        System.out.println(cdnum);


    }

    /**
     * 计算CD数目
     * @param n n首歌
     * @param s 每首歌s秒
     * @param l 每张CD一共l秒
     * @return
     */
    private static int handle(int n,int s,int l){

        int cdnum=0;

        //一张CD可以放下的歌曲
        int num=l/(s+1);
        if(l%(s+1)==s)
            num++;


        if(num>=n){
            num=n;
            if(n%13==0){
                cdnum=2;
            }
            else{
                cdnum=1;
            }
            return cdnum;
        }else{

            if(num%13==0)
                num--;

            cdnum=n/num;
            int left=n-cdnum*num;

            if(left==0)
                return cdnum;

            if(left%13==0){
                if(left==num-1)
                    cdnum=cdnum+2;
                else
                    cdnum++;
            }
            else
                cdnum++;

            return cdnum;

        }




    }



}
