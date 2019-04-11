package com.common;

public class SwapStrSb {
    public static void main(String[] args) {
        // String转换为StringBuffer
        String str = new String("This is a string");

        // 构造方法
        StringBuffer sb1 = new StringBuffer(str);
        // append()方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(str);

        System.out.println("String类型转换为StringBuffer类型 : ");
        System.out.println("构造方法 " + sb1);
        System.out.println("append()方法 : " + sb2);

        System.out.println();

        // StringBuffer转换为String
        StringBuffer sb = new StringBuffer("This is a StringBuffer");

        // 构造方法
        String str1 = new String(sb);
        // 通过toString()方法
        String str2 = sb.toString();

        System.out.println("StringBuffer类型转换为String类型 : ");
        System.out.println("构造方法 : " + str1);
        System.out.println("toString()方法 : " + str2);

        System.out.println();

        StringBuffer sb3 = new StringBuffer("abc def 123");

        // 插入操作
        StringBuffer sb4 = new StringBuffer("append ");
        sb4.append(sb3);
        System.out.println("添加 : " + sb4);

        // 插入操作
        sb3.insert(4, "insert");
        System.out.println("插入 : " + sb3);

        // 删除操作
        sb3.delete(2, 5);
        System.out.println("删除 : " + sb3);

        // 反转操作
        sb3.reverse();
        System.out.println("反转 : " + sb3);

    }
}
