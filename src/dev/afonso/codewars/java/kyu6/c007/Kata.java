package dev.afonso.codewars.java.kyu6.c007;

import java.util.stream.IntStream;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/6kyu.md#6kyu-c007-create-phone-number">Create Phone Number</a>
 */
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        // return String.format("(%s) %s-%s", string.substring(0, 3), string.substring(3, 6), string.substring(6, 10));
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}
