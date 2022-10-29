package longestcommonprefix;

import java.util.ArrayList;
import java.util.List;


// URL : https://leetcode.com/problems/longest-common-prefix
public class LongestCommonPrefixSolution {

    String longestCommonPrefix(String[] strs) {

        List<Character> prefix = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                prefix = strToArrayOfChar(strs[i]);
            } else {
                if (prefix.size() == 0 || strs[i].length() == 0) {
                    return "";
                }

                comparePrefixWithCurrentWord(strs[i], prefix);
            }

        }

        return charToString(prefix);
    }

    private String charToString(List<Character> prefix) {
        // create object of StringBuilder class
        StringBuilder sb = new StringBuilder();

        // Appends characters one by one
        for (Character ch : prefix) {
            sb.append(ch);
        }

        return sb.toString();
    }

    private void comparePrefixWithCurrentWord(String str, List<Character> prefix) {

        for (int i = 0; i < str.length(); i++) {

            if (str.length() < prefix.size()) {
                removeCurrenAndRest(str.length(), prefix);
            }

            if (prefix.size() > i && str.charAt(i) != prefix.get(i)) {
                removeCurrenAndRest(i, prefix);
                return;
            }
        }

    }

    private void removeCurrenAndRest(int currentIdx, List<Character> prefix) {
        prefix.subList(currentIdx, prefix.size()).clear();
    }

    private List<Character> strToArrayOfChar(String str) {
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(i, str.charAt(i));
        }

        return chars;
    }

}
