package org.example.pubble_sort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] c = { 5, 4, 3, 2, 1 };
        sort q = new sort();
        q.pubbleSort(c);
        System.out.println(Arrays.toString(c));
    }
}
