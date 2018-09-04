package com.company;

public class String_Question7 {
  public static void main(String[] args) {
    System.out.println("Write a method that finds the number of occurrences of a specified character in the string\n"
        + "using the following header:\n"
        + "public static int count(String str, char a)");
    System.out.println(count("wawawawa",'a'));

  }
  public static int count(String str, char a){
    int counter=0;
    for (int i = 0; i < str.length() ; i++) {
      if(str.charAt(i)== a){
        counter+=1;
      }
    }
    return counter;
  }
}
