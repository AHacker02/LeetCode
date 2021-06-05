package com.arghya.hard;

public class ArrayMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //join arrays
        int[] aggregatedSortedArray = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        do {
            if (i < nums1.length) {
                aggregatedSortedArray[j] = nums1[i];
                j++;
            }
            if (i < nums2.length) {
                aggregatedSortedArray[j] = nums2[i];
                j++;
            }
            i++;
        }
        while (i < nums1.length || i < nums2.length);

        //sort array
        quickSort(aggregatedSortedArray, 0, aggregatedSortedArray.length - 1);

        //median
        double medianIndex = (aggregatedSortedArray.length / 2d) - 1d;
        if (medianIndex % 1 == 0) {
            return (aggregatedSortedArray[(int) medianIndex] + aggregatedSortedArray[(int) medianIndex + 1]) / 2d;
        } else {
            return aggregatedSortedArray[(int) Math.ceil(medianIndex)];
        }

    }

    public static int partition(int[] a, int beg, int end) {

        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((a[loc] <= a[right]) && (loc != right))
                right--;
            if (loc == right)
                flag = 1;
            else if (a[loc] > a[right]) {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if (flag != 1) {
                while ((a[loc] >= a[left]) && (loc != left))
                    left++;
                if (loc == left)
                    flag = 1;
                else if (a[loc] < a[left]) {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }

    static void quickSort(int[] a, int beg, int end) {

        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc - 1);
            quickSort(a, loc + 1, end);
        }
    }
}
