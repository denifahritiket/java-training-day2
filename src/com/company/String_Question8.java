package com.company;

public class String_Question8 {
  public static void main(String[] args) {
    System.out.println("8. Write a method that counts the occurrences of each digit in a string using the following\n"
        + "header:\n"
        + "public static int[] count(String s)");
    System.out.println(count("aa676a7"));

  }
  public static int count(String s){
    int counter=0;
    for (int i = 0; i < s.length() ; i++) {
      if(s.charAt(i) >= '0' & s.charAt(i) <= '9' ){
        counter+=1;
      }
    }
    return counter;
  }
}
