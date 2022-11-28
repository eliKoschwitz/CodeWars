package org.example;

import java.util.Arrays;

public class SplitString {
    public static String[] solution(String income) {
        int j = 0;
        int offsetJ = 2;
        if (income.length() % 2 == 1) {
            income = income + "_";
        }
        String[] stringArr = new String[income.length() / 2];

        for (int i = 0; i < (income.length()/2); i++) {
            stringArr[i] = income.substring(j, offsetJ);
            j = j + 2;
            offsetJ = offsetJ + 2;
        }
        return stringArr;
    }

    public static void main(String[] args){
        System.out.println("Fertig!");
    }
}
