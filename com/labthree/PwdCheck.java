package com.labthree;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PwdCheck {
    public static void checkPwd(String pwd, String matchRule) {
        // 利用正则检查密码合法性
        if (pwd.matches(matchRule))
            System.out.println("此密码验证通过");
        else
            System.out.println("此密码验证非法");
    }

    public static void main(String[] args) {
        // 验证密码是数字和字母的组合且最少八位
        System.out.print("请输入待检验的密码 : ");
        Scanner scan = new Scanner(System.in);
        String pwd = scan.nextLine();

        // (?![0-9]+$)以数字开始或者结尾的最大匹配
        // (?![a-zA-Z]+$)以字母开始或者结尾的最大匹配
        // [0-9A-Za-z]{8,}$数字或者字母8位至少
        String matchRule = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,}$";

        checkPwd(pwd, matchRule);
    }
}
