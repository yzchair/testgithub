package com.labone;

public class BankAccount {
    private String accountNumber; // 账号
    private double leftMoney; // 存款余额

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountNumber, double leftMoney) {
        this.accountNumber = accountNumber;
        if (leftMoney >= 0.0)
            this.leftMoney = leftMoney;
        else {
            this.leftMoney = 0.0;
            System.out.println("Money value must be valid!");
        }
    }

    public void saveMoney(double money) {
        if (money > 0.0)
            this.leftMoney += money;
        else {
            this.leftMoney += 0.0;
            System.out.println("Money value must be valid!");
        }
    }

    public void getMoney(double money) {
        if (money > 0.0 && (this.leftMoney > money))
            this.leftMoney -= money;
        else {
            this.leftMoney -= 0.0;
            System.out.println("Money value must be valid!");
        }
    }

    public double getLeftMoney() {
        return this.leftMoney;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("123456", 500);
        ba.saveMoney(1000.00);
        ba.getMoney(2000.00);
    }
}
