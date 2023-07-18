package dev.afonso.codewars.java.kyu7.c006;

import java.util.HashMap;
import java.util.Map;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/7kyu.md#7kyu-c006-complementary-dna">Complementary DNA</a>
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
        Map<Character, Character> map = new HashMap<>();
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('C', 'G');
        map.put('G', 'C');

        StringBuilder sb = new StringBuilder(dna.length());
        for (int i = 0; i < dna.length(); i++) {
            sb.append(map.get(dna.charAt(i)));
        }

        return sb.toString();
    }
}
