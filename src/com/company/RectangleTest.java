package com.company;

public class RectangleTest {
  public static void main(String[] args) {
    System.out.println("1. Design a class named Rectangle to represent a rectangle. The class contains :\n"
        + "\uF0B7 Two double data fields named width and height that specify the width and height\n"
        + "of the rectangle. The default values are 1 for both width and height.\n"
        + "\uF0B7 A string data field named color that specifies the color of a rectangle. Hypothetically,\n"
        + "assume that all rectangles have the same color. The default color is white.\n"
        + "\uF0B7 A no-arg constructor that creates a default rectangle.\n"
        + "\uF0B7 A constructor that creates a rectangle with the specified width and height.\n"
        + "\uF0B7 The accessor and mutator methods for all three data fields.\n"
        + "\uF0B7 A method named getArea() that returns the area of this rectangle.\n"
        + "\uF0B7 A method named getPerimeter() that returns the perimeter.\n"
        + "Draw the UML diagram for the class. Implement the class. Write a test program that creates\n"
        + "two Rectangle objects. Assign width 4 and height 40 to the first object and width 3.5\n"
        + "height 35.9 to the second object. Assign color red to all Rectangle objects. Display the\n"
        + "properties of both objects and find their areas and perimeters.");
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
