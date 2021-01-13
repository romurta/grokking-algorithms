package com.grokking.algorithms.chapter1;

import java.util.Arrays;

/***
 *  time: O(log n)
 *  space: O(1)
 */
public class BinarySearch {

    public static int search(int[] array, int k) {
        if (array == null || array.length == 0) {
            return -1;
        }
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (k > array[mid]) {
                left = mid + 1;
            } else if (k < array[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {1, 7, 3, 4, 5, 6,6};
        int k = 3;
        System.out.println(search(array, k));
    }

}
