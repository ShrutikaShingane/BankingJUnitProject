
package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);

        assertEquals(1500, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() throws InsufficientFundsException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(300);

        assertEquals(700, account.getBalance(), 0.01);
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount(500);

        assertThrows(InsufficientFundsException.class,
            () -> account.withdraw(1000));
    }

    @Test
    public void testInvalidDeposit() {
        BankAccount account = new BankAccount(500);

        assertThrows(IllegalArgumentException.class,
            () -> account.deposit(-100));
    }
}
