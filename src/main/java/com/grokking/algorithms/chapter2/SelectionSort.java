package com.grokking.algorithms.chapter2;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            swap(array, i, minIdx);
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        var temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        int[] array = {7, 6, 5, 3, 2};

        sort(array);

        Arrays.stream(array).forEach(System.out::println);
    }
}
