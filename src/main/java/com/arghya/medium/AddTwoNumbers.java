package com.arghya.medium;

public class AddTwoNumbers {
    /**
     * https://leetcode.com/problems/add-two-numbers/
     *
     * @param l1 - LinkedList 1
     * @param l2 LinkedList 2
     * @return LinkedList with sum of the LinkedLists
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode((l1.val + l2.val) % 10);
        int carry = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null) {
            l1 = l1 == null ? new ListNode(0) : l1;
            l2 = l2 == null ? new ListNode(0) : l2;
            getLastNode(sum).next = new ListNode((l1.val + l2.val + carry) % 10);
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            getLastNode(sum).next = new ListNode(carry);
        }
        return sum;
    }

    static ListNode getLastNode(ListNode node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
}

