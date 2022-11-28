package org.example;

import java.util.Arrays;

public class SplitString {

    public static String[] solution(String income) {
        String[] endString = new String[(income.length()/2)];

        if(income.length() % 2 == 1){
            income = income + "_";
        }

        if(income.length() == 4) {
            String[] stringArr = new String[2];
            stringArr[0] = income.substring(0, 2);
            stringArr[1] = income.substring(2, 4);
            endString = stringArr;
        }

        if(income.length() == 6) {
            String[] stringArr = new String[3];
            stringArr[0] = income.substring(0, 2);
            stringArr[1] = income.substring(2, 4);
            stringArr[2] = income.substring(4, 6);
            endString = stringArr;
        }

        if(income.length() == 8) {
            String[] stringArr = new String[4];
            stringArr[0] = income.substring(0, 2);
            stringArr[1] = income.substring(2, 4);
            stringArr[2] = income.substring(4, 6);
            stringArr[3] = income.substring(6, 8);
            endString = stringArr;
        }

    return endString;
    }

    public static void main(String[] args){
        System.out.println("hier wird das ergebnis geprintet " + Arrays.toString(solution("abcde")));
    }
}
