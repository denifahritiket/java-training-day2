package com.company;

public class String_Question9 {
  public static void main(String[] args) {
    System.out.println("9. The method counts how many times a digit appears int the string. The return value is an\n"
        + "array of ten elements, each of which holds the count for a digit. For example, after executing\n"
        + "int[] counts = count(“12203AB3”), counts[0] is 1, counts[1] is 1,\n"
        + "counts[2] is 2, counts[3] is 2.\n \n"
        + "soal nya a1231dsf1343249898");
    int[] tampung = counts("a1231dsf1343249898");
    int num = 0;
    for (int i:tampung
    ) {
      System.out.println("Count ["+ num+ "] is "+ i);
      num+=1;
    }

  }
  public static int[] counts(String s){
    int[] counter=new int[10];
    for (int i = 0; i <= 9 ; i++) {
      counter[i]= count(s, Integer.toString(i).charAt(0));
    }
    return counter;
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
