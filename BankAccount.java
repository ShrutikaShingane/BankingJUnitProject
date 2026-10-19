
package com.example;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive");
        }

        balance += amount;
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient balance");
        }

        balance -= amount;
    }
}
