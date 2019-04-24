package com.labthree;

import java.util.StringTokenizer;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        System.out.print("请输入与字符串（只有字母和空格):");

        // 统计单词出现次数，并提取
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //方法1
        int wordNum = 0;
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("StringTokenizer类方法:");
        while (st.hasMoreElements()) { // 或者st.hasMoreToken()
            System.out.print(st.nextElement() + " || ");
            wordNum++;
        }
        System.out.println();
        System.out.println("单词个数 : " + wordNum);
        System.out.println();

        // 方法2
        System.out.println("使用String的split()方法");
        String[] splitWord = str.split("\\s+"); // 支持正则表达式，不可以直接" "
        for (String s : splitWord) {
            System.out.print(s + "++");
        }
        System.out.println();
        System.out.println("单词个数 : " + splitWord.length);
        System.out.println();

    }
}
