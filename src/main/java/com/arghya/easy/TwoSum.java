package com.arghya.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * https://leetcode.com/problems/two-sum/submissions/
     *
     * @param nums   - array of number
     * @param target - target sum
     * @return index of elements where sum = target
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Sum found");
    }
}
