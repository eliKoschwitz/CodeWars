package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SplitStringTest {

    @Test
    void solution() {
        //GIVEN
        String s = "abc";
        //WHEN
        String[] actual = SplitString.solution(s);
        //THEN
        Assertions.assertEquals(['ab', 'c_'], actual);

    }
}