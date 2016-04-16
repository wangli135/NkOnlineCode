package com.xingfeng.exer1.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * <p>
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 * <p>
 * <p>
 * 输出描述:
 * 输出该数值的十进制字符串。
 * <p>
 * 输入例子:
 * 0xA
 * <p>
 * 输出例子:
 * 10
 * Created by Xingfeng on 2016/4/16.
 */
public class HexToDecil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            handle(input);
        }

    }

    /**
     * 十六进制转十进制
     *
     * @param hex
     */
    private static void handle(String hex) {

        int len = hex.length();
        int result = 0;
        for (int i = 0; i < len - 2; i++) {

            result += (Math.pow(16,i)* charToInt(hex.charAt(len - i - 1)));

        }

        System.out.println(result);

    }

    private static int charToInt(char c) {

        if (c >= 48 && c <= 57)
            return c-48;

        if(c>=65&&c<=70)
            return c-55;

        if(c>=97&&c<=102)
            return c-87;

        return 0;
    }

}
