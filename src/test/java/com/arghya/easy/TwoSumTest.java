package com.arghya.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {
    TwoSum solution = new TwoSum();

    @Test
    void shouldBe0_1When9() {
        int[] sumPair = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.stream(sumPair).anyMatch(i -> i == 1));
        assertTrue(Arrays.stream(sumPair).anyMatch(i -> i == 0));
    }

    @Test
    void shouldBe1_2When6() {
        int[] sumPair = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertTrue(Arrays.stream(sumPair).anyMatch(i -> i == 1));
        assertTrue(Arrays.stream(sumPair).anyMatch(i -> i == 2));
    }

    @Test
    void shouldBe2_4WhenNegative8() {
        int[] sumPair = solution.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        assertTrue(Arrays.stream(sumPair).anyMatch(i -> i == 4));
        assertTrue(Arrays.stream(sumPair).anyMatch(i -> i == 2));
    }
}