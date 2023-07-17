package dev.afonso.codewars.java.kyu8.c003;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/8kyu.md#8kyu-c003-triple-trouble">Triple Trouble</a>
 */
public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
        if (one.length() != two.length() || one.length() != three.length()) {
            throw new IllegalArgumentException("All parameters must have the same length");
        }

        StringBuilder sb = new StringBuilder(one.length() * 3);
        for (int i = 0; i < one.length(); i++) {
            sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }

        return sb.toString();
    }
}
