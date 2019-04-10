package com.labone;

import java.util.Arrays;

public class ArrayOperator {
    public static int getArrayMaxValue(int[] arr) {
        int maxNum = arr[0];
        for (int i : arr) {
            maxNum = maxNum > i ? maxNum : i;
        }

        return maxNum;
    }

    public static int getArrayMinValue(int[] arr) {
        int minNum = arr[0];
        for (int i : arr) {
            minNum = minNum < i ? minNum : i;
        }

        return minNum;
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = {10, 7, 33, 4, 5, 6, -4, 100, 28};
        System.out.println("MaxNum : " + getArrayMaxValue(num));
        System.out.println("MinNum : " + getArrayMinValue(num));
        System.out.println("Sorting......");
        sortArray(num);
        System.out.print("After Sorted : ");
        printArray(num);
    }

}
