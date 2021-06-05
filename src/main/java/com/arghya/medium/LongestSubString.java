package com.arghya.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int subStringLength = 1;
            map.put(s.charAt(i), 0);
            for (int j = i + 1; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    break;
                }
                subStringLength++;
                map.put(s.charAt(j), 0);
            }
            longestSubstringLength = Math.max(longestSubstringLength, subStringLength);

        }

        return longestSubstringLength;
    }
}