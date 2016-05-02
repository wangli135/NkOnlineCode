package com.xingfeng.exer1.company.jinritoutiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 给出 n 个字符串，对于每个 n 个排列 p，按排列给出的顺序(p[0] , p[1] … p[n-1])依次连接这 n 个字符串都能得到一个长度为这些字符串长度之和的字符串。所以按照这个方法一共可以生成 n! 个字符串。
 一个字符串的权值等于把这个字符串循环左移 i 次后得到的字符串仍和原字符串全等的数量，i 的取值为 [1 , 字符串长度]。求这些字符串最后生成的 n! 个字符串中权值为 K 的有多少个。
 注：定义把一个串循环左移 1 次等价于把这个串的第一个字符移动到最后一个字符的后面。

 输入描述:
 每组测试用例仅包含一组数据，每组数据第一行为两个正整数 n, K ， n 的大小不超过 8 ， K 不超过 200。接下来有 n 行，每行一个长度不超过 20 且仅包含大写字母的字符串。


 输出描述:
 输出一个整数代表权值为 K 的字符串数量。

 输入例子:
 3 2
 AB
 RAAB
 RA

 输出例子:
 3
 * Created by xingfeng on 16-5-2.
 */
public class Magic {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=scanner.nextInt();
        int k=scanner.nextInt();

        if(n<0||n>8)
            return;

        if(k<0||k>200)
            return;

        scanner.nextLine();

        String[] array=new String[n];

        for(int i=0;i<n;i++){
            array[i]=scanner.nextLine().trim();
        }

        array=arrange(array);
        int num=0;
        for(int i=0;i<array.length;i++){
            if(weight(array[i])==k)
                num++;
        }
        System.out.println(num);



    }

    /**
     * 求字符串数组的排列组合
     * @param array
     * @return
     */
    private static String[] arrange(String[] array){

        if(array.length==1)
            return array;

        String[] result=new String[jiecheng(array.length)];
        int resultIndex=0;
        for(int i=0;i<array.length;i++){

            String first=array[i];
            String[] left=new String[array.length-1];
            int index=0;
            for(int j=0;j<array.length;j++){
                if(i!=j)
                    left[index++]=array[j];
            }
            left=arrange(left);
            for(int j=0;j<left.length;j++){
                result[resultIndex++]=first+left[j];
            }
        }
        return result;

    }

    private static int jiecheng(int n){

        if(n==1)
            return 1;
        else
            return n*jiecheng(n-1);

    }

    /**
     * 求字符串的权值
     * @param s
     * @return
     */
    private static int weight(String s){

        int weight=0;

        String temp=s;
        for(int i=0;i<s.length();i++){

            temp=temp.substring(1)+temp.charAt(0);
            if(temp.equals(s))
                weight++;

        }

        return weight;
    }


}
