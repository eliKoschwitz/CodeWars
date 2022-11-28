package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ChristmasTreeTDDTest {

    @Test
    void heightIs0AnswerHasToBe0(){
        // GIVEN
        int height = 0;

        //WHEN
        String actual = ChristmasTreeTDD.heightOfTheTree(height);

        //THEN
        Assertions.assertEquals("|", actual);
    }


    @Test
    void heightIs1AnswerHasToBe1(){
        // GIVEN
        int height = 1;

        //WHEN
        String actual = ChristmasTreeTDD.heightOfTheTree(height);

        //THEN
        Assertions.assertEquals("X\n|", actual);
    }

    @Test
    void heightIs2AnswerHasToBe2(){
        // GIVEN
        int height = 2;

        //WHEN
        String actual = ChristmasTreeTDD.heightOfTheTree(height);

        //THEN
        Assertions.assertEquals(" X\nXXX\n |", actual);
    }

    @Test
    void heightIs3AnswerHasToBe3(){
        // GIVEN
        int height = 3;

        //WHEN
        String actual = ChristmasTreeTDD.heightOfTheTree(height);

        //THEN
        Assertions.assertEquals("  X\n XXX\nXXXXX\n  |", actual);
    }

    @Test
    void heightIs4AnswerHasToBe4(){
        // GIVEN
        int height = 4;

        //WHEN
        String actual = ChristmasTreeTDD.heightOfTheTree(height);

        //THEN
        Assertions.assertEquals("   X\n  XXX\n XXXXX\nXXXXXXX\n   |", actual);
    }

    @Test
    void heightIs5AnswerHasToBe5(){
        // GIVEN
        int height = 5;

        //WHEN
        String actual = ChristmasTreeTDD.heightOfTheTree(height);

        //THEN
        Assertions.assertEquals("    X\n   XXX\n  XXXXX\n XXXXXXX\nXXXXXXXXX\n    |", actual);
    }
}