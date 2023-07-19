package dev.afonso.codewars.java.kyu7.c006;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DnaStrandTest {
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }

    @Test
    public void test04() {
        assertEquals("TTCC", DnaStrand.makeComplement("AAGG"));
    }

    @Test
    public void test05() {
        assertEquals("GCGC", DnaStrand.makeComplement("CGCG"));
    }

    @Test
    public void test06() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    @Test
    public void test07() {
        assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT", DnaStrand.makeComplement("GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
    }
}
