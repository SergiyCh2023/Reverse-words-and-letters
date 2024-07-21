package org.example;

public class Solution {

     public String reversLetters(String s) {

         if (s.equals("")) throw new LettersWordsException();

         String [] arrays = s.split("");
         StringBuilder result = new StringBuilder();
         for (int i = arrays.length-1; i >=0 ; i--) {
             result.append(arrays[i]);
         }
         return result.toString();
     }


    public String reversWords(String s) {

        if (s.equals("")) throw new LettersWordsException();
        String [] arrays = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = arrays.length-1; i >=0 ; i--) {

            result.append(arrays[i]);
            if (i-1 >= 0) result.append(" ");
        }
        return result.toString();
    }


}
