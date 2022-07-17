package twosum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumSolutionTest {

    private final TwoSumSolution twoSumSolution;

    public TwoSumSolutionTest() {
        this.twoSumSolution = new TwoSumSolution();
    }

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 2}, twoSumSolution.twoSum(new int[]{2, 4, 5, 7}, 7));
    }
}