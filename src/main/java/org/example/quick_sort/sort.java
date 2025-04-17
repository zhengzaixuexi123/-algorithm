package org.example.quick_sort;

public class sort {
    /*快速排序*/
    int medianThree(int low,int medium,int high){
        if((low<=medium)&&(medium<=high)){
            return medium;
        } else if ((medium<=low)&&(low<=high)) {
            return low;
        }else return high;
    }
    void swap(int[] c, int a, int b){
        int temp = c[a];
        c[a]=c[b];
        c[b]=temp;
    }
    int partition(int[] c, int low, int high){
        int i1 = medianThree(low, (high - low) / 2, high);
        swap(c, i1, low);
        int i=low;
        int j=high;
        while(i<j){
            while (i<j&&c[i]<=c[j]){
                j--;
            }
            while(i<j&&c[low]>=c[i]){
                i++;
            }
            swap(c,i,j);
        }
        swap(c,i,low);
        return i;
    }

    void quickSort(int[] c, int low, int high){
        while (low<high){
            int pivot= partition(c,low,high);
            if(pivot-low<high-pivot) {
                quickSort(c,low,pivot-1);
                low = pivot+1;
            }else {
                quickSort(c,pivot+1,high);
                high = pivot-1;
            }
        }
    }

    /*插入排序*/

}
