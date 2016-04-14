package com.xingfeng.exer1.string;

/**
 * 题目描述

 对于一个字符串，我们想通过添加字符的方式使得新的字符串整体变成回文串，但是只能在原串的结尾添加字符，请返回在结尾添加的最短字符串。
 给定原字符串A及它的长度n，请返回添加的字符串。保证原串不是回文串。
 测试样例：
 "ab",2
 返回："a"
 * Created by Xingfeng on 2016/4/14.
 */
public class Palindrome {

    /**
     * 思路：将字符串反转，之后求两个字符转最大的交集，多余部分则是应该添加的字符串
     * @param A
     * @param n
     * @return
     */
    public static String addToPalindrome(String A, int n) {

        String reverse=new StringBuilder(A).reverse().toString();

        int sameCount=0;//相同字符数量
        for(int i=0;i<n;i++){

            if(A.charAt(i)==reverse.charAt(sameCount)){
                sameCount++;
            }else{
                if(sameCount>0)
                  i--;
                sameCount=0;
            }
        }

        return reverse.substring(sameCount);
    }

    public static void main(String[] args) {

        //System.out.println(addToPalindrome("babbbaaaabababbbbabbbaabbbbabbabbbaabbbaabaaabbabaaaababaabababaaaabbbbbaabbaabbbbaaaaabbaaaaaaaabbabbabaaaaababbbaabbbbabaaababb",129));
         System.out.println(addToPalindrome("ab",2));
    }

}
