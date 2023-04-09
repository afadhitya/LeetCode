package plusone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlusOneSolutionTest {

    private final PlusOneSolution plusOneSolution = new PlusOneSolution();

    @Test
    void test() {
        plusOneSolution.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }
}