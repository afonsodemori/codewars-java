package dev.afonso.codewars.java.kyu8.c004;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/8kyu.md#8kyu-c004-area-or-perimeter">Area or Perimeter</a>
 */
public class Solution {
    public static int areaOrPerimeter(int l, int w) {
        return (l == w) ? (l * w) : (2 * (l + w));
    }
}
