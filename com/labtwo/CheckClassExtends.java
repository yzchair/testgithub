package com.labtwo;

class Father {
    private int age;

    public Father() {
        System.out.println("父类无参数构造方法！！！");
    }

    public Father(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Value must be valid");
        System.out.println("父类带参数构造方法！！！");
    }

    public void printAge() {
        System.out.println("父亲年龄是 ： " + this.age);
    }
}

class Child extends Father {
    private int age;

    public Child() {
        super();
        System.out.println("子类无参数构造方法！！！");
    }


    public Child(int age) {
        super();
        if (age > 0)
            this.age = age;
        else
            System.out.println("Value must be valid");
        System.out.println("子类带参数构造方法！！！");
    }

    @Override
    public void printAge() {
        System.out.println("孩子年龄是 ： " + this.age);
    }
}

public class CheckClassExtends {
    public static void main(String[] args) {
        Father f1 = new Father(30);
        f1.printAge();
        Father f2 = new Child(10);
        f2.printAge();
    }
}
