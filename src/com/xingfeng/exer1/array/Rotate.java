package com.xingfeng.exer1.array;

/**
 * 有一个NxN整数矩阵，请编写一个算法，将矩阵顺时针旋转90度。
 * 给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于300。
 * 测试样例：
 * [[1,2,3],[4,5,6],[7,8,9]],3
 * 返回：[[7,4,1],[8,5,2],[9,6,3]]
 * Created by Xingfeng on 2016/3/29.
 */
public class Rotate {

    public int[][] rotateMatrix(int[][] mat, int n) {

        //我的思路
        /*if (n < 0 || n > 300) {
            return null;
        }

        int[][] result = new int[n][n];

        float mid = (float) ((n -1)* 1.0 / 2);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {


                int x = (int) (2 * mid - i);
                int y = j;
                result[y][x] = mat[i][j];

            }

        }

        return result;*/

        //比较好的答案
        int[][] rmatrix = new int[n][n];

        for(int i =0; i < n; i++){
                for(int j =0; j < n; j++){
                    rmatrix[j][n-1-i] = mat[i][j];
                }
        }
        return rmatrix;

    }

    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        mat[0] = new int[]{1, 2, 3};
        mat[1] = new int[]{4, 5, 6};
        mat[2] = new int[]{7, 8, 9};

        Rotate rotate = new Rotate();
        int[][] result = rotate.rotateMatrix(mat, 3);

        int i = 0;


    }

}
