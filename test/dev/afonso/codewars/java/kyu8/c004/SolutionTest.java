package dev.afonso.codewars.java.kyu8.c004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private static int X(int a, int b) {
        return a == b ? a * b : 2 * (a + b);
    }

    @Test
    public void StaticTests() {
        assertEquals(16, Solution.areaOrPerimeter(4, 4));
        assertEquals(25, Solution.areaOrPerimeter(5, 5));
        assertEquals(32, Solution.areaOrPerimeter(6, 10), 32);
    }

    @Test
    public void TestRandom() {
        int quota = 0;

        for (int i = 1; i < 101; i++) {
            int a = (int) (Math.random() * (i + 50) + 1);
            int b = (int) (Math.random() * (i + 30) + 21);
            int p = (int) (Math.random() * 50 + 1);

            if (p <= quota || a == b) {
                quota -= 1;
                a = b;
            } else {
                quota += 1;
            }

            System.out.println("Testing for " + a + ", " + b);
            assertEquals(X(a, b), Solution.areaOrPerimeter(a, b));
        }
    }
}