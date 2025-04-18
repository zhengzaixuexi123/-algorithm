package org.example.bubble_sort;

/*
 * 冒泡排序*/
public class sort {
    void bubbleSort(int[] c) {

        for (int j = c.length - 1; j > 0; j--) {//轮最大长度-1次，不算0，每伦比上一次-1
            boolean flag = false;//初始化flag
            for (int i = 0; i < c.length - 1; i++) {//当前面的数大就交换,比较最大长度-1次，算上0次则-2
                if (c[i] > c[i + 1]) {
                    int temp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = temp;
                    flag = true;//实现交换变成true
                }
            }
            if (!flag) {
                break;//如果flag为false则该轮没有实现交换，数组已经有序
            }
        }
    }
}
