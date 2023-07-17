package dev.afonso.codewars.java.kyu7.c005;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DiceDotCountTest {

    DiceDotCount ddc = new DiceDotCount();

    @Test
    public void testSomething() {
        for (int i = 0; i < 93; i++) {
            List<Integer> numOfSidesList = Arrays.asList(6, 8, 10, 12, 20);
            long seed = System.nanoTime();
            Collections.shuffle(numOfSidesList, new Random(seed));
            int numOfSides = numOfSidesList.get(0);
            Random r = new Random();
            int topNum = r.nextInt((numOfSides - 1) + 1) + 1;
            assertEquals(ddc.totalAmountVisible(topNum, numOfSides), ((numOfSides - 2) / 2) * (numOfSides + 1) + topNum);
        }
    }
}
