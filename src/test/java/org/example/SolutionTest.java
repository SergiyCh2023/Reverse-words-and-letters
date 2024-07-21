package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private  Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void reversLettersTest1() {
        String s = solution.reversLetters("ScrougeMcDuck");
        Assertions.assertEquals(s, "kcuDcMeguorcS");
    }

    @Test
    void reversLettersTestException() {

        Assertions.assertThrows(LettersWordsException.class, ()->solution.reversLetters(""));
    }


    @Test
    void reversWordsTest1() {
        String s = solution.reversWords("Scrouge McDuck is the most reachest duck in the world");
        Assertions.assertEquals(s, "world the in duck reachest most the is McDuck Scrouge");
    }


    @Test
    void reversWordsTestException() {

        Assertions.assertThrows(LettersWordsException.class, ()->solution.reversWords(""));
    }



    @Test
    void reversLettersTestExceptionTotalRevers() {
        String s = solution.reversLetters("Scrouge McDuck is the most reachest duck in the world");
        Assertions.assertEquals(s, "dlrow eht ni kcud tsehcaer tsom eht si kcuDcM eguorcS");

    }

}