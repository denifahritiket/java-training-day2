package com.company;

public class MyIntegerTest {
  public static void main(String[] args) {
    System.out.println("5. Design a class named MyInteger. The class contains :\n"
        + "\uF0B7 An int data field named value that stores the int value represented by this object.\n"
        + "\uF0B7 A constructor that creates a MyInteger object for the specified int value.\n"
        + "\uF0B7 A get method that returns the int value.\n"
        + "\uF0B7 Methods isEven(), isOdd(), and isPrime() that return true if the value is\n"
        + "even, odd, or prime, respectively.\n"
        + "\uF0B7 Static methods isEven(int), isOdd(int), and isPrime(int) that return\n"
        + "true if the specified value is even, odd, or prime, respectively.\n"
        + "\uF0B7 Static methods isEven(MyInteger), isOdd(MyInteger), and\n"
        + "isPrime(MyInteger) that return true if the specified value is even, odd, or prime,\n"
        + "respectively.\n"
        + "\uF0B7 Methods equals(int) and equals(MyInteger) that return true if the value int\n"
        + "the object is equal to the specified value.\n"
        + "\uF0B7 A static method parseInt(int) that converts a string to an int value.\n"
        + "Draw the UML diagram for the class. Implement the class. Write a client program that\n"
        + "tests all methods in the class.");
    MyInteger int1 = new MyInteger(77);
    MyInteger int2 = new MyInteger(2);
    MyInteger int3 = new MyInteger(44);
    MyInteger int4 = new MyInteger(69);

    System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime());
    System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime());
    System.out.printf("%d is prime? %s%n", int3.getValue(), int3.isPrime());

    System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven());
    System.out.printf("%d is even? %s%n", int2.getValue(), int2.isEven());
    System.out.printf("%d is even? %s%n", int3.getValue(), int3.isEven());

    System.out.printf("93 is odd? %s%n", MyInteger.isOdd(93));

    System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));

    System.out.printf("%d%n", MyInteger.parseInt("454"));

  }
}
