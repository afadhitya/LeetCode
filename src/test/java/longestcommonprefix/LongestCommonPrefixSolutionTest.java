package longestcommonprefix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixSolutionTest {

    private final LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();

    @Test
    void testSolution() {
//        String[] strs = {"hello", "hehehe"};
//
//        assertEquals("he", solution.longestCommonPrefix(strs));
//
//        String[] strs2 = {"dog","racecar","car"};
//        assertEquals("", solution.longestCommonPrefix(strs2));
//
//        strs2 = new String[]{"", "b"};
//        assertEquals("", solution.longestCommonPrefix(strs2));
//
//        strs2 = new String[]{"ab", "a"};
//        assertEquals("a", solution.longestCommonPrefix(strs2));
//
//        String[] strs2 = new String[]{"flower","flow","flight"};
//        assertEquals("fl", solution.longestCommonPrefix(strs2));

//        String[] strs2 = new String[]{"aaa","aa","aaa"};
//        assertEquals("aa", solution.longestCommonPrefix(strs2));

        String[] strs2 = new String[]{"abab","aba",""};
        assertEquals("", solution.longestCommonPrefix(strs2));

    }

}