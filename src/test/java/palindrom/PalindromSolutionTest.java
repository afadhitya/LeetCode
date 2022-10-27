package palindrom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import twosum.TwoSumSolution;

class PalindromSolutionTest {

    private final PalindromSolution palindromSolution;

    public PalindromSolutionTest() {
        this.palindromSolution = new PalindromSolution();
    }

    @Test
    void twoSum() {
        assertEquals(false, palindromSolution.isPalindrom(-100));
        assertEquals(true, palindromSolution.isPalindrom(101));
        assertEquals(false, palindromSolution.isPalindrom(1011));
        assertEquals(true, palindromSolution.isPalindrom(1001));
        assertEquals(false, palindromSolution.isPalindrom(10));

//        assertArrayEquals(new int[]{0, 2}, palindromSolution.twoSum(new int[]{2, 4, 5, 7}, 7));
    }
}