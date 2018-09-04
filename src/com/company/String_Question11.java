package com.company;

import java.util.Arrays;

public class String_Question11 {
  public static void main(String[] args) {
    System.out.println("Write a method that checks whether two words are anagrams. Two words are anagrams if\n"
        + "they contain the same letters in any order. For example, “silent” and “listen” are anagrams.\n"
        + "The header of the method is as follows:\n"
        + "public static boolean isAnagram(String s1, String s2)\n"
        + "Write a main method to invoke isAnagram(“silent”, “listen”),\n"
        + "isAnagram(“garden”, “ranged”), and isAnagram(“split”, “lisp”).\n \n");

    System.out.println("Is anagram “silent”, “listen”? "+isAnagram("silent","listen"));
    System.out.println("Is anagram “garden”, “ranged”? "+isAnagram("garden","ranged"));
    System.out.println("Is anagram “split”, “lisp”? "+isAnagram("split","lisp"));

  }
  
  public static boolean isAnagram(String s1, String s2){
    char tempArrays1[] = s1.toCharArray();
    char tempArrays2[] = s2.toCharArray();
    Arrays.sort(tempArrays1);
    Arrays.sort(tempArrays2);
    String sorted1 = new String(tempArrays1);
    System.out.println(sorted1);
    String sorted2 = new String(tempArrays2);
    System.out.println(sorted2);
    if (sorted1.equals(sorted2)){
      return true;
    }else{
      return false;
    }
  }
}


