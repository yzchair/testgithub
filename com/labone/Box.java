package com.labone;

public class Box {
    private double length; // 长
    private double width; // 宽
    private double height; // 高

    public Box() {

    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volumn() {
        return this.length * this.width * this.height;
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.setBox(2.0, 3.0, 4.0);
        System.out.println("Volumn : " + b.volumn());
    }
}
