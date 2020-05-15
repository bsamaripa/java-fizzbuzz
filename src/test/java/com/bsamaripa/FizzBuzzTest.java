package com.bsamaripa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzBuzz FizzBuzz = new FizzBuzz();

    @Test
    void divByTest() {
        assertFalse(FizzBuzz.divBy(20, 3));
        assertFalse(FizzBuzz.divBy(20, 21));
        assertTrue(FizzBuzz.divBy(6, 3));
        assertTrue(FizzBuzz.divBy(20, 2));
    }

    @Test
    void checkFizzBuzzTest() {
        assertEquals("-1", FizzBuzz.checkFizzBuzz(-1));
        assertEquals("0", FizzBuzz.checkFizzBuzz(0));
        assertEquals("1", FizzBuzz.checkFizzBuzz(1));
        assertEquals("2", FizzBuzz.checkFizzBuzz(2));
        assertEquals("lucky", FizzBuzz.checkFizzBuzz(3));
        assertEquals("fizz", FizzBuzz.checkFizzBuzz(6));
        assertEquals("buzz", FizzBuzz.checkFizzBuzz(5));
        assertEquals("fizzbuzz", FizzBuzz.checkFizzBuzz(15));
    }

    @Test
    void containsThreeTest() {
        assertFalse(FizzBuzz.containsThree(0));
        assertFalse(FizzBuzz.containsThree(1));
        assertTrue(FizzBuzz.containsThree(3));
        assertTrue(FizzBuzz.containsThree(13));
        assertTrue(FizzBuzz.containsThree(31));
    }

    @Test
    void zero() {
        assertEquals("0", FizzBuzz.FizzBuzz(0));
    }

    @Test
    void single() {
        assertEquals("1", FizzBuzz.FizzBuzz(1));
    }

    @Test
    void twenty() {
        String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
        assertEquals(expected, FizzBuzz.FizzBuzz(20));
    }

}