package dev.afonso.codewars.java.kyu6.c007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.stream.*;

public class PhoneTest {
    @Test
    public void basicTests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", Kata.createPhoneNumber(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(478) 157-9971", Kata.createPhoneNumber(new int[]{4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
        assertEquals("(780) 221-7513", Kata.createPhoneNumber(new int[]{7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
    }

    private String sol(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }

    @Test
    public void randomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
            assertEquals(sol(a), Kata.createPhoneNumber(a));
        }
    }
}
