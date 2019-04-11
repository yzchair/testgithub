package com.common;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random r = new Random();

        System.out.println("产生的随机数 : ");
        for (int i = 0; i < 10; i++) {
            num[i] = r.nextInt(100);
            System.out.print(num[i] + " ");
        }
        System.out.println();

        int[] copyNum = new int[10];
        System.arraycopy(num, 0, copyNum, 0, copyNum.length);


        System.out.println("复制随机数(4种方法) :");
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }
        System.out.println();

        System.out.println("排序后的数组 : ");
        Arrays.sort(copyNum);
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }

        System.out.println();
        System.out.print("输入一个数值:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        int index = Arrays.binarySearch(num, inputNum);

        System.out.println();
        if (index >= 0)
            System.out.println(inputNum + "下标为" + index);
        else
            System.out.println("找不到" + inputNum);
    }
}
