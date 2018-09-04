package com.company;

public class StockTest {
  public static void main(String[] args) {
    Stock stock = new Stock("SUNW","Sun Microsystems Inc");
    stock.setPreviousClosingPrice(100);
    stock.setCurrentPrice(90);
    System.out.println("Price Change: " + stock.changePercent()+" %");

  }
}
