package com.company;

public class Stock {
  String symbol;
  String name;
  double previousClosingPrice;
  double currentPrice;

  public Stock(String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public double getPreviousClosingPrice() {
    return previousClosingPrice;
  }

  public double getCurrentPrice() {
    return currentPrice;
  }

  public void setPreviousClosingPrice(double previousClosingPrice) {
    this.previousClosingPrice = previousClosingPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public double changePercent(){
    return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
  }
}
