package com.xingfeng.exer1.string;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * Created by Xingfeng on 2016/4/10.
 */
public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {

        if(str==null)
             return null;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                result.append("%20");
            else
                result.append(String.valueOf(str.charAt(i)));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace replaceSpace=new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace(new StringBuffer("We Are Happy")));
    }

}
