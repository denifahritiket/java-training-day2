package com.company;

import java.util.HashMap;
import java.util.Map;

public class String_Question10 {
  public static void main(String[] args) {
    System.out.println("Write main method to display the count for “SSN is 343 32 4545 and ID is 434\n"
        + "34 4323”");
    Map<Character,Integer> tampung = counts("SSN is 343 32 4545 and ID is 434 34 4323");
    int num = 0;
    for ( Map.Entry<Character,Integer> entry :tampung.entrySet()
        ) {
      System.out.println("Count ["+ entry.getKey()+ "] is "+ entry.getValue());
    }

  }
  public static Map counts(String s){
    Map ssn = new HashMap();

    for (int i = 0; i < s.length() ; i++) {
      ssn.put(s.charAt(i),count(s, s.charAt(i)));
    }
    return ssn;
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
