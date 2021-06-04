package com.arghya.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    @Test
    void shouldAdd2_4_3And5_6_4Return7_0_8() {
        ListNode l1 = ListNode.toLinkedList(new int[]{2, 4, 3});
        ListNode l2 = ListNode.toLinkedList(new int[]{5, 6, 4});
        ListNode expected = ListNode.toLinkedList(new int[]{7, 0, 8});
        ListNode sum = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(expected, sum);
    }

    @Test
    void shouldAdd9_9_9_9_9_9_9And9_9_9_9Return8_9_9_9_0_0_0_1() {
        ListNode l1 = ListNode.toLinkedList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = ListNode.toLinkedList(new int[]{9, 9, 9, 9});
        ListNode expected = ListNode.toLinkedList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        ListNode sum = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(expected, sum);
    }

    @Test
    void shouldAdd0And0Return0() {
        ListNode l1 = ListNode.toLinkedList(new int[]{0});
        ListNode l2 = ListNode.toLinkedList(new int[]{0});
        ListNode expected = ListNode.toLinkedList(new int[]{0});
        ListNode sum = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(expected, sum);
    }
}