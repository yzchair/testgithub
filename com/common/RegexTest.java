package com.common;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void binPhoneFormat(String phone) {
        // 判断一个电话是否符合格式(0000)0000-0000
        Pattern p1 = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
        Matcher m1 = p1.matcher(phone);

        if (m1.matches())
            System.out.println(phone + "是合法的电话号码格式");
        else
            System.out.println(phone + "是不合法的电话号码格式");


    }

    public static void printAllIpAddress(String str) {
        // 将一个字符串里的所有Ip地址都打印出来
        // 使用边界匹配
        Pattern p2 = Pattern.compile("(?=(\\b|\\D))(((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|" +
                "(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))");
        Matcher m2 = p2.matcher(str);

        System.out.println("合法Ip地址如下 : ");
        while (m2.find()) {
            System.out.println(m2.group());
        }
    }

    public static void reduceRepeatLetter(String str) {
        // 压缩连续出现的字符成一个
        String reptStr = str.replaceAll("(.)(\\1)*", "$1");

        System.out.println("压缩后的字符串 : " + reptStr);
    }

    public static void binEndWithAbc(String str) {
        // 判断字符串是否以abc结尾
        Pattern p3 = Pattern.compile("(.)*(abc$)");
        Matcher m3 = p3.matcher(str);
        boolean binCheck = m3.matches();

        if (binCheck == true)
            System.out.println(str + "以abc结尾");
        else
            System.out.println(str + "不以abc结尾");
    }

    public static void findLinkAddress(String str) {
        // 从字符串中提取静态网页链接地址
        Pattern p4 = Pattern.compile("https?://(.)+(html)");
        Matcher m4 = p4.matcher(str);

        System.out.println("静态网页链接如下 : ");
        while (m4.find()) {
            System.out.println(m4.group());
        }
    }

    public static void getIntegerToArray(String str) {
        // 提取字符串的整数到数组
        Pattern p5 = Pattern.compile("(\\d)+");
        Matcher m5 = p5.matcher(str);

        ArrayList<Integer> intList = new ArrayList<Integer>();
        Integer intNum = new Integer(0);

        while (m5.find()) {
            intNum = Integer.valueOf(m5.group());
            ((ArrayList) intList).add(intNum);
        }

        // 输出数组中存放的整数
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void textReplace(String text, String word, String repalceWord) {
        // 替换所有的word为replaceWord
        Pattern p5 = Pattern.compile(word);
        Matcher m5 = p5.matcher(text);

        String afterReplace = new String();
        afterReplace = m5.replaceAll(repalceWord);

        System.out.println("替换前 : " + text);
        System.out.println("替换后 : " + afterReplace);
    }

    public static void getCxllString(String str) {
        // 提取%CXLL开头，右部是%的字符串
        Pattern p6 = Pattern.compile("%CXLL=.*?(?=%)"); // 右部必须有一个%,最小匹配
        Matcher m6 = p6.matcher(str);

        System.out.println("CXLL格式字符串提取如下 : ");
        while (m6.find()) {
            System.out.println(m6.group());
        }
    }

    public static void main(String[] args) {
        binPhoneFormat("(1234)5678-0000");
        binPhoneFormat("1234-01234-8561");

        printAllIpAddress("Ip1 : 192.108.1.100, Ip2 : 1.10.10.10, WrongIp : 258.120.12.100");
        reduceRepeatLetter("aaabbbccccdddd123.");

        binEndWithAbc("ahdabc");
        binEndWithAbc("abcab");

        String linkStr = "<link rel=\"canonical\" href=\"http://www.runoob.com/java/java-regular-expressions.html\" />";
        findLinkAddress(linkStr);

        getIntegerToArray("ae256dd-w348e6");

        textReplace("replace somthing pupel, java, pupel", "pupel", "pupil");

        String cxllStr = "%...%CXLL=add1,31,123,12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
        getCxllString(cxllStr);
    }
}
