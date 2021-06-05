package com.arghya.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubStringTest {

    @Test
    void shouldBe3Whenabcabcbb() {
        assertEquals(3, new LongestSubString().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void shouldBe1Whenbbbbb() {
        assertEquals(1, new LongestSubString().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void shouldBe3Whenapwwkew() {
        assertEquals(3, new LongestSubString().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void shouldBe1WhenSpace() {
        assertEquals(1, new LongestSubString().lengthOfLongestSubstring(" "));
    }

    @Test
    void shouldBe2Whenau() {
        assertEquals(2, new LongestSubString().lengthOfLongestSubstring("au"));
    }

    @Test
    void shouldBe2Whenaab() {
        assertEquals(2, new LongestSubString().lengthOfLongestSubstring("aab"));
    }

    @Test
    void shouldBe3Whendvdf() {
        assertEquals(2, new LongestSubString().lengthOfLongestSubstring("aab"));
    }
}