package com.xingfeng.exer1.company.jinritoutiao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 现在有一个字符串，你要对这个字符串进行 n 次操作，每次操作给出两个数字：(p, l) 表示当前字符串中从下标为 p 的字符开始的长度为 l 的一个子串。你要将这个子串左右翻转后插在这个子串原来位置的正后方，求最后得到的字符串是什么。字符串的下标是从 0 开始的，你可以从样例中得到更多信息。

 输入描述:
 每组测试用例仅包含一组数据，每组数据第一行为原字符串，长度不超过 10 ，仅包含大小写字符与数字。接下来会有一个数字 n 表示有 n 个操作，再接下来有 n 行，每行两个整数，表示每次操作的(p , l)。


 保证输入的操作一定合法，最后得到的字符串长度不超过 1000。


 输出描述:
 输出一个字符串代表最后得到的字符串。

 输入例子:
 ab
 2
 0 2
 1 3

 输出例子:
 abbaabb
 * Created by xingfeng on 16-5-2.
 */
public class StringReverseAndAdd {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        String data=scanner.nextLine().trim();
        int n=scanner.nextInt();
        int p=0,l=0;

        if(data.length()>10)
            return;

        String result=data;
        for(int i=0;i<n;i++){

            p=scanner.nextInt();
            l=scanner.nextInt();

            result=handle(data,p,l);

            if(result.equals(data)) {
                System.out.println(result);
                break;
            }else{
                data=result;
            }


        }

        System.out.println(result);


    }

    /**
     *
     * @param data
     * @param p
     * @param l
     * @return
     */
    private static String handle(String data,int p,int l){

        if(data.length()+l>1000)
            return data;

        String part=data.substring(p,p+l);
        part=new StringBuilder(part).reverse().toString();

        String left=data.substring(0,p+l);
        String right=data.substring(p+l);

        return left+part+right;


    }

}
