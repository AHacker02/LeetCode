package com.arghya.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayMedianTest {
    @Test
    void shouldReturn2When1_3And2() {
        assertEquals(2, new ArrayMedian().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    void shouldReturn2point5When1_2And3_4() {
        assertEquals(2.5, new ArrayMedian().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

}