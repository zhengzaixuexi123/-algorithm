package org.example.insertion_sort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] c = {8, 32, 6, 4, 6, 8, 9, 10};
        sort q = new sort();
        q.insertionSort(c);
        System.out.println(Arrays.toString(c));
    }
}