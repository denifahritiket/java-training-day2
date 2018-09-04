package com.company;

public class AccountTest {
  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(20000);
    account.setId(1122);
    account.setAnnualInterestRate(4.5);
    account.withDraw(2500.0);
    account.deposit(3000.0);
    System.out.println("Balance: $" + account.getBalance());
    System.out.println("Monthly Interest: " + account.getMonthlyInterestRate());
    System.out.println("Date Created: " + account.getDateCreated());

  }
}
