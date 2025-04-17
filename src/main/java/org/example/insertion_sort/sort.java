package org.example.insertion_sort;

/*
 * 插入排序*/
public class sort {
    public void insertionSort(int[] c) {
        for (int i = 0; i < c.length; i++) {//外循环遍历数组从索引0到索引i-1
            int base = c[i];
            int j = i - 1;
            while (j > 0 && base < c[j]) {//内循环实现元素右移
                c[i] = c[j];//把左值给右一格
                j--;
            }
            c[j + 1] = base;//当base比c[j]大时直接将base插入到c[j]前
        }
    }
}
