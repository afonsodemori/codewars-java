package dev.afonso.codewars.java.kyu8.c002;

/**
 * Solves the challenge <a href="https://github.com/afonsodemori/codewars-java/blob/main/8kyu.md#8kyu-c002-will-there-be-enough-space">Will there be enough space?</a>
 */
public class Bob {
    /**
     * @param cap is the amount of people the bus can hold excluding the driver.
     * @param on is the number of people on the bus excluding the driver.
     * @param wait is the number of people waiting to get on to the bus excluding the driver.
     * @return If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
     */
    public static int enough(int cap, int on, int wait) {
        return (cap - on >= wait) ? 0 : on + wait - cap;
    }
}
