package com.xingfeng.exer1.array;

/**
 * 对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针打印矩阵元素。
 * 给定int矩阵mat,以及它的维数nxm，请返回一个数组，数组中的元素为矩阵元素的顺时针输出。
 * 测试样例：
 * [[1,2],[3,4]],2,2
 * 返回：[1,2,4,3]
 * Created by Xingfeng on 2016/3/29.
 */
public class Printer {


    public int[] clockwisePrint(int[][] mat, int n, int m) {

        int[] result = new int[m * n];

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        int index = 0;

        int i = 0;
        int j = 0;

        while (bottom > top && right > left) {

            //向右
            if (i == left && j == top) {

                while (i <= right) {
                    result[index++] = mat[j][i++];
                }
                i = right;
                ++top;
                j = top;
            }

            //向下
            if (i == right && j == top) {
                while (j <= bottom) {
                    result[index++] = mat[j++][i];
                }
                j = bottom;
                right--;
                i = right;
            }

            //向左
            if (i == right && j == bottom) {

                while (i >= left) {
                    result[index++] = mat[j][i--];
                }
                i = left;
                bottom--;
                j = bottom;
            }

            //向上
            if (i == left && j == bottom) {

                while (j >= top) {
                    result[index++] = mat[j--][i];
                }
                j = top;
                left++;
                i = left;
            }
        }

        //剩最后一行
        if (bottom == top) {
            //向右
            if (i == left) {

                while (i <= right)

                    result[index++] = mat[bottom][i++];
            } else {
                while (i >= left)
                    result[index++] = mat[bottom][i--];
            }
        }
        else if (left == right) {

            if (j == top) {
                while (j <= bottom) {
                    result[index++] = mat[j++][left];
                }

            } else {
                while (j >= top) {
                    result[index++] = mat[j--][left];
                }
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        mat[0] = new int[]{4, 46, 89};
        mat[1] = new int[]{28, 66, 99};
        mat[2] = new int[]{26, 21, 71};
        Printer printer = new Printer();
        int[] result = printer.clockwisePrint(mat, 3, 3);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i] + ",");
        }
        sb.deleteCharAt(sb.length() - 1).append("]");
        System.out.println(sb);

    }
}
