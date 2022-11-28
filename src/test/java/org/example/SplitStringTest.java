package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SplitStringTest {

    @Test
    void giveABC() {
        //GIVEN
        String s = "abc";
        String[] arr = new String[] {"ab","c_"};
        //WHEN
        String[] actual = SplitString.solution(s);
        //THEN
        Assertions.assertArrayEquals(arr, actual);

    }

    @Test
    void giveABCD() {
        //GIVEN
        String s = "abcd";
        String[] arr = new String[] {"ab","cd"};
        //WHEN
        String[] actual = SplitString.solution(s);
        //THEN
        Assertions.assertArrayEquals(arr, actual);
    }

    @Test
    void giveABCDE() {
        //GIVEN
        String s = "abcde";
        String[] arr = new String[] {"ab","cd", "e_"};
        //WHEN
        String[] actual = SplitString.solution(s);
        //THEN
        Assertions.assertArrayEquals(arr, actual);
    }


}