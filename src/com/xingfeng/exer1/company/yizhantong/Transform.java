package com.xingfeng.exer1.company.yizhantong;

/**
 * [编程题] 字符串变形
 对于一个给定的字符串，我们需要在线性(也就是O(n))的时间里对它做一些变形。首先这个字符串中包含着一些空格，就像"Hello World"一样，然后我们要做的是把着个字符串中由空格隔开的单词反序，同时反转每个字符的大小写。比如"Hello World"变形后就变成了"wORLD hELLO"。

 输入描述:
 给定一个字符串s以及它的长度n(1≤n≤500)


 输出描述:
 请返回变形后的字符串。题目保证给定的字符串均由大小写字母和空格构成。

 输入例子:
 "This is a sample",16

 输出例子:
 "SAMPLE A IS tHIS"
 * Created by Xingfeng on 2016/5/3.
 */
public class Transform {
    public String trans(String s, int n) {

        String result="";
        String temp="";

        char c='0';
        for(int i=0;i<n;i++){
            c=s.charAt(i);
            if(c!=' '){

                //大小写转换
                if(Character.isLowerCase(c)){
                    c=Character.toUpperCase(c);
                }else{
                    c=Character.toLowerCase(c);
                }

                temp+=c;

            }else{

                result=temp+result;
                result=" "+result;
                temp="";

            }


        }

        result=temp+result;
        return result;
    }

    public static void main(String[] args) {

        Transform transform=new Transform();
        System.out.println(transform.trans("This is a sample",16));

    }
}
