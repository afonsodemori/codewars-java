package dev.afonso.codewars.java.kyu7.c005;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/7kyu.md#7kyu-c005-visible-dots-on-a-die">Visible Dots On a Die</a>
 */
public class DiceDotCount {

    public int totalAmountVisible(int topNum, int numOfSides) {
        if (topNum < 1 || topNum > numOfSides) {
            throw new IllegalArgumentException("Invalid topNum: " + topNum);
        }

        if (numOfSides % 2 != 0) {
            throw new IllegalArgumentException("numOfSides must be an even number");
        }

        int oppositeDotsCount = numOfSides + 1;
        int totalVisibleDots = oppositeDotsCount * (oppositeDotsCount / 2);
        return totalVisibleDots - (oppositeDotsCount - topNum);
    }
}
