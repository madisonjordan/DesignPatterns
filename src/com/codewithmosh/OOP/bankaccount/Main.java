package com.codewithmosh.OOP.bankaccount;

public class Main {
    // Bank Account (Encapsulation example)
    public static void main(String[] args) {
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}