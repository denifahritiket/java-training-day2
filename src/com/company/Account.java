package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
  int id;
  double balance;
  double annualInterestRate;
  Date dateCreated;

  public Account(){
    this.id = 0;
    this.balance = 0;
    this.annualInterestRate = 0 ;
    Date date = new Date();
    this.dateCreated = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public double getMonthlyInterestRate(){
    return annualInterestRate/12;
  }

  public void withDraw(double draw){
    balance = balance - draw;
  }

  public void deposit(double depo){
    balance += depo;
  }

  public Account(int id, double balance, double annualInterestRate) {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
    Date date = new Date();
    this.dateCreated = date;
  }

  @Override
  public String toString() {
    return "Account{" +
        "id=" + id +
        ", balance=" + balance +
        ", annualInterestRate=" + annualInterestRate +
        ", dateCreated=" + dateCreated +
        '}';
  }
}
