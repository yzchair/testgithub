package com.common;

public class SwapStrSb {
    public static void main(String[] args) {
        // String转换为StringBuffer
        String str = new String("This is a string");

        // 构造方法
        StringBuilder sb1 = new StringBuilder(str);
        // append()方法
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);

        System.out.println("String类型转换为StringBuffer类型 : ");
        System.out.println("构造方法 " + sb1);
        System.out.println("append()方法 : " + sb2);

        System.out.println();

        // StringBuffer转换为String
        StringBuilder sb = new StringBuilder("This is a StringBuffer");

        // 构造方法
        String str1 = new String(sb);
        // 通过toString()方法
        String str2 = sb.toString();

        System.out.println("StringBuffer类型转换为String类型 : ");
        System.out.println("构造方法 : " + str1);
        System.out.println("toString()方法 : " + str2);

    }
}
