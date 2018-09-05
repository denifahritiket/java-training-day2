package com.company;

public class MyPointTest {
  public static void main(String[] args) {
    System.out.println("6. Design a class named MyPoint to represent a point with x and y-coordinates. The class\n"
        + "contains:\n"
        + "\uF0B7 Two data fields x and y that represent the coordinates.\n"
        + "\uF0B7 A no-arg constructor that creates a point(0, 0).\n"
        + "\uF0B7 A constructor that constructs a point with specified coordinates.\n"
        + "\uF0B7 Two get methods for data fields x and y, respectively.\n"
        + "\uF0B7 A method named distance that returns the distance from this point to another point of\n"
        + "the MyPoint type.\n"
        + "\uF0B7 A method named distance that returns the distance from this point to another point\n"
        + "with specified x and y-coordinates.\n"
        + "Draw the UML diagram for the class. Implement the class. Write a test program that\n"
        + "creates two points (0,0) and (10,30.5) and displays the distance between them.");
    MyPoint point1 = new MyPoint();
    MyPoint point2 = new MyPoint(10,30.5);
    System.out.println("Distance : "+point1.distance(point2));
  }
}
