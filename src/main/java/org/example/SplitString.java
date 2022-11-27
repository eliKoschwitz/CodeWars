package org.example;

public class SplitString {

    public static String[] solution(String s) {
        int arrLength = 0;

        if(s.length() % 2 == 1){
            arrLength = s.length() + 1;
        } else {
            arrLength = s.length();
        }

        char[] theSingleLetter = s.toCharArray();
        String[] arr = new String[arrLength];

        for(char c : theSingleLetter){
            arr = arr[] + c;
        }

    return arr;
    }
}
