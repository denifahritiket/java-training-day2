package com.company;

public class RectangleTest {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(40,4);
    Rectangle rectangle2 = new Rectangle(35.9,3.5);

    rectangle1.setColor("Red");
    rectangle2.setColor("Red");

    System.out.println("Rectangle 1");
    System.out.println("Color:"+ rectangle1.getColor());
    System.out.println("Width:" + rectangle1.getWidth());
    System.out.println("Height:" + rectangle1.getHeight());
    System.out.println("Area:" + rectangle1.getArea());
    System.out.println("Perimeter:" + rectangle1.getPerimeter());
    System.out.println("------------------");
    System.out.println("Rectangle 2");
    System.out.println("Color:"+rectangle2.getColor());
    System.out.println("Width:" + rectangle2.getWidth());
    System.out.println("Height:" + rectangle2.getHeight());
    System.out.println("Area:" + rectangle2.getArea());
    System.out.println("Perimeter:" + rectangle2.getPerimeter());
  }
}
