package com.labone;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MyArray {
    private int[] mAry;

    public MyArray(int[] arr) {
        this.mAry = new int[arr.length];
        System.arraycopy(arr, 0, mAry, 0, arr.length); // 效率最好
    }

    public int getArrayMaxValue() {
        int maxNum = this.mAry[0];
        for (int i : this.mAry) {
            maxNum = maxNum > i ? maxNum : i;
        }

        return maxNum;
    }

    public int getArrayMinValue() {
        int minNum = this.mAry[0];
        for (int i : this.mAry) {
            minNum = minNum < i ? minNum : i;
        }

        return minNum;
    }

    public void sortArray() {
        Arrays.sort(this.mAry);
    }

    public void printArray() {
        for (int i : this.mAry)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] testArray = {10, 15, 7, 6, -1, 9, 3, 4, 18, 20};
        MyArray ary = new MyArray(testArray);
        System.out.println("MaxNum : " + ary.getArrayMaxValue());
        System.out.println("MinNum : " + ary.getArrayMinValue());
        System.out.println("Sorting...");
        ary.sortArray();
        System.out.print("After Sorted : ");
        ary.printArray();
    }
}
