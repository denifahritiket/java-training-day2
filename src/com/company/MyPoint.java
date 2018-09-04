package com.company;

public class MyPoint {
  double x;
  double y;

  public MyPoint() {
    x=0;
    y=0;
  }

  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  public double distance(double a, double b){
    return Math.sqrt(Math.pow(a-this.x,2) + Math.pow(b-this.y,2));
  }

  public double distance(MyPoint point){
    return distance(point.getX(),point.getY());
  }
}
