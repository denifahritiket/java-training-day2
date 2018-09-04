package com.company;

public class MyIntegerTest {
  public static void main(String[] args) {
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
