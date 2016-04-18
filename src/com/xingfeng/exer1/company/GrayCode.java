package com.xingfeng.exer1.company;

/**
 * [编程题] 生成格雷码
 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
 给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 测试样例：
 1
 返回：["0","1"]

 递归生成码表
 这种方法基于格雷码是反射码的事实，利用递归的如下规则来构造：
 1位格雷码有两个码字
 (n+1)位格雷码中的前2n个码字等于n位格雷码的码字，按顺序书写，加前缀0
 (n+1)位格雷码中的后2n个码字等于n位格雷码的码字，按逆序书写，加前缀1[3]
 n+1位格雷码的集合 = n位格雷码集合(顺序)加前缀0 + n位格雷码集合(逆序)加前缀1
 * Created by Xingfeng on 2016/4/17.
 */
public class GrayCode {

    /**
     * 获得数字n的n位格雷码
     * @param n
     * @return
     */
    public static String[] getGray(int n) {

        if(n==1){
            return new String[]{"0","1"};
        }else{

            String[] result=new String[(int) Math.pow(2,n)];
            String[] previous=getGray(n-1);
            for(int i=0;i<previous.length;i++){
                result[i]="0"+previous[i];
            }

            for(int i=result.length-1;i>=result.length/2;i--){
                result[i]="1"+previous[result.length-1-i];
            }
            return result;
        }

    }

    public static void main(String[] args) {

        String[] result=getGray(2);
        for(String s:result){
            System.out.print(s+"  ");
        }

    }

}
