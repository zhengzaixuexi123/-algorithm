package org.example.quick_sort;

/*
 *快速排序*/
public class sort {
    /*找中位数，为了防止分治的一边为数组长度为0*/
    int medianThree(int low, int medium, int high) {//
        if ((low <= medium) && (medium <= high)) {
            return medium;
        } else if ((medium <= low) && (low <= high)) {
            return low;
        } else return high;
    }
    /*交换a，b索引的元素*/
    void swap(int[] c, int a, int b) {
        int temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
    /*实现第一次分治，并返回碰面时元素的索引*/
    int partition(int[] c, int low, int high) {
        int i1 = medianThree(low, (high - low) / 2, high);//找中位数
        swap(c, i1, low);//把中位数换到low
        int i = low;
        int j = high;//初始化i,j指向两边
        while (i < j) {//i和j没有碰面时
            while (i < j && c[low] <= c[j]) {//当j指向的值大于等于基数时
                j--;//向左移动一格
            }
            while (i < j && c[low] >= c[i]) {//当i小于等于基数时
                i++;//向右移动一格
            }
            swap(c, i, j);//当j比基数小，i比基数大时交换彼此指向的元素
        }
        swap(c, i, low);//i和j碰面时，交换i指向的元素和基数
        return i;//返回这个索引
    }

    void quickSort(int[] c, int low, int high) {
        while (low < high) {//当分治后数组长度不为1时
            int pivot = partition(c, low, high);//找到分治后的基数换位置后的索引
            if (pivot - low < high - pivot) {//尾递归优化，找到长度较小的数组进行分治
                quickSort(c, low, pivot - 1);
                low = pivot + 1;//初始化low(最左端元素)
            } else {
                quickSort(c, pivot + 1, high);
                high = pivot - 1;//初始化high(最右端元素)
            }
        }
    }
}
