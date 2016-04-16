package com.xingfeng.exer1.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。


 Input Param
 n               输入随机数的个数
 inputArray      n个随机整数组成的数组

 Return Value
 OutputArray    输出处理后的随机整数


 注：测试用例保证输入参数的正确性，答题者无需验证。




 输入描述:
 输入多行，先输入随机整数的个数，在输入相应个数的整数


 输出描述:
 返回多行，处理后的结果

 输入例子:
 11
 10
 20
 40
 32
 67
 40
 20
 89
 300
 400
 15

 输出例子:
 10
 15
 20
 32
 40
 67
 89
 300
 400
 * Created by Xingfeng on 2016/4/16.
 */
public class DeleteSameAndSort {

    public static void main(String[] args) {

        int[] array=null;
        int num=0;

        Scanner scanner=new Scanner(new BufferedReader(new InputStreamReader(System.in)));


        while(scanner.hasNext()){
            num=scanner.nextInt();
            array=new int[num];
            for(int i=0;i<num;i++){
                array[i]=scanner.nextInt();
                for(int j=i;j>0&&array[j]<array[j-1];j--){
                    swap(array,j,j-1);
                }
            }

            int previous=-1;
            for(int i=0;i<array.length;i++){

                if(previous==array[i])
                    continue;
                else{
                    System.out.println(array[i]);
                    previous=array[i];
                }

            }
        }



    }

    private static void swap(int[] array,int i,int j){

        int t=array[i];
        array[i]=array[j];
        array[j]=t;

    }

}
