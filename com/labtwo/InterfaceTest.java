package com.labtwo;


interface Food {
    public abstract String getName();
}


abstract class Animal {
    public abstract void shout();

    public abstract void eat(Food food);

    public abstract String getName();
}


class Dog extends Animal {
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void shout() {
        System.out.println(this.getName() + "发出欢快的叫声。");
    }

    @Override
    public void eat(Food food) {
        this.shout();
        System.out.println(this.getName() + "吃着香喷喷的" + food.getName());
    }
}


class Tiger extends Animal {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void shout() {
        System.out.println(this.getName() + "发出欢快的叫声。");
    }

    @Override
    public void eat(Food food) {
        this.shout();
        System.out.println(this.getName() + "吃着香喷喷的" + food.getName());
    }
}


class Bone implements Food {

    @Override
    public String getName() {
        return "Bone";
    }
}


class Chicken extends Animal implements Food {
    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void shout() {
        System.out.println(this.getName() + "发出惨痛的叫声。");
    }

    @Override
    public void eat(Food food) {
        this.shout();
        System.out.println(this.getName() + "吃着香喷喷的" + food.getName());
    }

}


class Feeder {
    private String name;

    public Feeder(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("欢迎来到动物园！");
        System.out.println("我是饲养员" + this.getName());
    }

    public void feed(Animal a, Food food) {
        a.eat(food);
        if (food instanceof Animal) {
            a = (Animal) food;
            a.shout();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        Feeder feeder = new Feeder("花花");
        feeder.speak();
        Dog dog = new Dog("小布丁");
        Food food = new Bone();
        feeder.feed(dog, food);
        Tiger tiger = new Tiger("小猫崽");
        food = new Chicken("小公鸡");
        feeder.feed(tiger, food);
    }
}
