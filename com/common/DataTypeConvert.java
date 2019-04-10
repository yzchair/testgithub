package com.common;

public class DataTypeConvert {
    public static void main(String[] args) {

        // 只用整数类型进行举例

        int basicNum = 100;
        Integer intNum = new Integer(50);
        String str = new String("123");

        // 包装类和基本数据类型互相转换
        Integer intCvtNum1 = new Integer(basicNum);  // int类型转换为Integer类型
        int basicCvtNum1 = intNum.intValue();  // Integer类型转换为int类型

        // 包装类和字符串互相转换
        String str1 = intNum.toString();  // Integer类型转换为String类型方法1
        String str2 = String.valueOf(intNum);  // 方法2

        Integer intCvtNum2 = Integer.valueOf(str); // String类型转换为Integer类型

        // 基本数据类型和字符串互相转换
        String str3 = Integer.toString(basicNum);  // int类型转换为String类型方法1
        String str4 = String.valueOf(basicNum);  // 方法2
        String str5 = basicNum + "";  // 方法3

        int basicCvtNum2 = Integer.parseInt(str);  // String类型转换为int类型方法1
        int basicCvtNum3 = Integer.valueOf(str);  // 方法2
    }
}
