
package com.example;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        System.out.println("=== Banking Console App ===");

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println(
                            "Balance: " + account.getBalance());
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        account.deposit(sc.nextDouble());
                        System.out.println("Deposit successful.");
                        break;

                    case 3:
                        System.out.print("Enter amount: ");
                        account.withdraw(sc.nextDouble());
                        System.out.println("Withdrawal successful.");
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InsufficientFundsException
                    | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
