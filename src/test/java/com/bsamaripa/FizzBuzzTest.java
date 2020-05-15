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
    void isIntegerTest() {
        assertTrue(FizzBuzz.isInteger("0"));
        assertTrue(FizzBuzz.isInteger("13"));
        assertFalse(FizzBuzz.isInteger(""));
        assertFalse(FizzBuzz.isInteger("fizz"));
    }
    @Test
    void negativeTest() {
        assertEquals("-1", FizzBuzz.FizzBuzz(-1));
    }

    @Test
    void zeroTest() {
        assertEquals("0", FizzBuzz.FizzBuzz(0));
    }

    @Test
    void singleTest() {
        assertEquals("1", FizzBuzz.FizzBuzz(1));
    }

    @Test
    void tenTest() {
        String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz";
        assertEquals(expected, FizzBuzz.FizzBuzz(10));
    }

    @Test
    void twentyTest() {
        String expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
        assertEquals(expected, FizzBuzz.FizzBuzz(20));
    }
}