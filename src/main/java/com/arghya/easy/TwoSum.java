package com.arghya.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            int compIndex = numsList.indexOf(compliment);
            if (compIndex != -1 && compIndex != i) {
                return new int[]{compIndex, i};
            }
        }
        throw new IllegalArgumentException("No Sum found");
    }
}
