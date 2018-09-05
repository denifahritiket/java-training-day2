package com.company;

public class AccountTest {
  public static void main(String[] args) {
    System.out.println("3. design a class named Account that contains:\n"
        + "\uF0B7 An int data field named id for the account (default 0).\n"
        + "\uF0B7 A double data field named balance for the account (default 0).\n"
        + "\uF0B7 A double data field named annualInterestRate that stores the current interest\n"
        + "rate (default 0).\n"
        + "\uF0B7 A Date data field named dateCreated that stores the date when the account was\n"
        + "created.\n"
        + "\uF0B7 A no-arg constructor that creates a default account\n"
        + "\uF0B7 The accessor and mutator methods for id, balance, and annualInterestRate.\n"
        + "\uF0B7 The accessor method for dateCreated.\n"
        + "\uF0B7 A method named getMonthlyInterestRate() that returns the monthly interest\n"
        + "rate\n"
        + "\uF0B7 A method named withDraw that withdraw a specified amount form the account.\n"
        + "\uF0B7 A method named deposit that deposits a specified amount to the account.\n"
        + "Draw the UML diagram for the class. Implement the class. Write a test program that creates\n"
        + "an Account object with an account ID of 1122, a balance of 20000, and an annual\n"
        + "interest rate 4.5%. use the withdraw method to withdraw $2500, use the deposit\n"
        + "method to deposit $3000, and print the balance, the monthly interest, and the date when\n"
        + "this account was created.");
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
