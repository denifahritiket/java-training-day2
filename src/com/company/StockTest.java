package com.company;

public class StockTest {
  public static void main(String[] args) {
    System.out.println("4. design a class named Stock that contains :\n"
        + "\uF0B7 A string data field named symbol for the stock's symbol.\n"
        + "\uF0B7 A string data field named name for the stock's name\n"
        + "\uF0B7 a double data field named previousClosingPrice that stores the stock price for\n"
        + "the previous day.\n"
        + "\uF0B7 A double data field named currentPrice that stores the stock price for the current\n"
        + "time.\n"
        + "\uF0B7 A constructor that creates a stock with specified symbol and name.\n"
        + "\uF0B7 The accessor methods for all data fields.\n"
        + "\uF0B7 The mutator methods for previousClosingPrice and currentPrice.\n"
        + "\uF0B7 A method named changePercent() that returns the percentange changed from\n"
        + "previousClosingPrice to currentPrice.\n"
        + "Draw the UML diagram for the class. Implement the class. Write a test program that creates\n"
        + "a Stock object with the stock symbol SUNW, the name Sun Microsystems Inc, and the\n"
        + "previous closing price of 100. set a new current price to 90 and display the price-change\n"
        + "percentage");
    Stock stock = new Stock("SUNW","Sun Microsystems Inc");
    stock.setPreviousClosingPrice(100);
    stock.setCurrentPrice(90);
    System.out.println("Price Change: " + stock.changePercent()+" %");

  }
}
