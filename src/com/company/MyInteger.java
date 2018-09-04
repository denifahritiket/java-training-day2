package com.company;

public class MyInteger {
  int value;

  public MyInteger(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public boolean isEven(){
    if (value%2 == 0) {
      return true;
    }else{
      return false;
    }
  }
  public boolean isOdd(){
    if (value%2 != 0) {
      return true;
    }else{
      return false;
    }
  }

  public boolean isPrime(){
    int pembagi = value/2;
    if (value == 1 | value == 0) {
      return false;
    }else{
      for (int i = 2; i < pembagi; i++) {
        if (value%i == 0){
          return false;
        }
      }
      return true;
    }
  }
  public static boolean isEven(int angka){
    if (angka%2 == 0) {
      return true;
    }else{
      return false;
    }
  }
  public static boolean isOdd(int angka){
    if (angka%2 != 0) {
      return true;
    }else{
      return false;
    }
  }

  public static boolean isPrime(int angka){
    int pembagi = angka/2;
    if (angka == 1 | angka == 0) {
      return false;
    }else{
      for (int i = 2; i < pembagi; i++) {
        if (angka%i == 0){
          return false;
        }
      }
      return true;
    }
  }

  public static boolean isEven(MyInteger myInt){
    if (myInt.getValue()%2 == 0) {
      return true;
    }else{
      return false;
    }
  }
  public static boolean isOdd(MyInteger myInt){
    if (myInt.getValue() %2 != 0) {
      return true;
    }else{
      return false;
    }
  }

  public boolean isPrime(MyInteger myInt){
    int pembagi = myInt.getValue()/2;
    if (myInt.getValue() == 1 | myInt.getValue() == 0) {
      return false;
    }else{
      for (int i = 2; i < pembagi; i++) {
        if (myInt.getValue()%i == 0){
          return false;
        }
      }
      return true;
    }
  }

  public boolean equals(int n){
    if(n == this.value){
      return true;
    }else{
      return false;
    }
  }

  public boolean equals(MyInteger myInt){
    return equals(myInt.getValue());
  }

  public static int parseInt(String n){
    return Integer.parseInt(n);
  }

}
