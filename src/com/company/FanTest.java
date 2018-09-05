package com.company;

public class FanTest {
  public static void main(String[] args) {
    System.out.println("2. Design a class named Fan to represent a fan. The class contains:\n"
        + "\uF0B7 three constants named SLOW, MEDIUM, and FAST with values 1, 2 and 3 to denote\n"
        + "the fan speed.\n"
        + "\uF0B7 An int data field named speed that specifies the speed of the fan (default SLOW).\n"
        + "\uF0B7 A boolean data field named on that specifies whether the fan is on (default false).\n"
        + "\uF0B7 A double data field named radius that specifies the radius of the fan (default 5).\n"
        + "\uF0B7 A string data field named color that specifies the color the fan (default blue).\n"
        + "\uF0B7 A no-arg constructor that creates a default fan.\n"
        + "\uF0B7 The accessor and mutator methods for all four data fields.\n"
        + "\uF0B7 A method named toString() that returns a string description for the fan, if the fan\n"
        + "is on, the method returns the fan speed, color and radius along with the string. If the\n"
        + "fan is not on, the method returns fan color and radius along with the string “fan is\n"
        + "off” in one combined string.\n"
        + "Draw the UML diagram for the class. Implement the class. Write a test program that creates\n"
        + "two Fan objects. Assign maximum speed, radius 10, color yellow, and turn it on to the\n"
        + "first object. Assign medium speed, radius 5, color blue, and turn it off to the second\n"
        + "object. Display the objects by invoking their toString method.");
    Fan fan1 = new Fan();
    Fan fan2 = new Fan();

    fan1.setSpeed(fan1.FAST);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);

    fan2.setSpeed(fan2.MEDIUM);
    fan2.setOn(false);

    System.out.println(fan1.toString());
    System.out.println(fan2.toString());
  }
}
