package org.itstep.task04;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            int idx = binarySearch(arr,3);
            System.out.println("idx = " + idx);
            arr = new int[]{1,2,4,3,5};
            idx = binarySearch(arr,3);
            System.out.println("idx = " + idx);
        } catch (NotSortedExceprion e) {
            System.err.println(e.getMessage());
        }
    }

    public static int binarySearch(int[] arr, int value) throws NotSortedExceprion {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                throw new NotSortedExceprion("Массив должен быть отсортирован!");
            }
        }
        return Arrays.binarySearch(arr, value);
    }
}
