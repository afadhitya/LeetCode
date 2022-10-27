package palindrom;

// URL : https://leetcode.com/problems/palindrome-number
public class PalindromSolution {

    boolean isPalindrom(int x) {

        char[] chars = String.valueOf(x).toCharArray();

        boolean isOdd = chars.length % 2 != 0;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return chars[chars.length - 1 - i] == chars.length / 2 && isOdd;
            }
        }

        return true;
    }

}
