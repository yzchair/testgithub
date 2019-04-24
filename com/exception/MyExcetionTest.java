package com.exception;

class TypeSwapWxception extends Exception {
    private String str;

    TypeSwapWxception(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str + "中存在非数字字符，无法转换";
    }
}

public class MyExcetionTest {
    public static int parseInt(String str) throws TypeSwapWxception {
        // 将字符串转换为数字并返回

        int intValue = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                intValue = intValue * 10 + ch - '0';
            else
                throw new TypeSwapWxception(str);
        }

        return intValue;
    }

    public static void main(String[] args) {
        String testStr = "@A1B123";
        try {
            int result = parseInt(testStr);
            System.out.println("转换后的整数是 : " + String.valueOf(result));
        } catch (TypeSwapWxception e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}