package com.arghya.medium;

public class PalindromSubstring {
    /**
     * https://leetcode.com/problems/longest-palindromic-substring/submissions/
     *
     * @param s String to get palindrome from
     * @return Longest palindrome from the given string
     */
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (s.charAt(j) == s.charAt(i)) {
                    String substring = s.substring(i, j + 1);
                    if (isPalindrome(substring)) {
                        longestPalindrome = substring.length() > longestPalindrome.length() ? substring : longestPalindrome;
                        if (j == s.length() - 1) {
                            return longestPalindrome;
                        }
                    }
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
