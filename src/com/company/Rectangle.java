package com.company;

public class Rectangle {
  private double height;
  private double width;
  private String color;

  public Rectangle(){
    height = 1;
    width =1;
    color ="white";
  }

  public Rectangle(double _height,double _width){
    height=_height;
    width=_width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea(){
    return height*width;
  }

  public double getPerimeter(){
    return 2*(height+width);
  }
}
