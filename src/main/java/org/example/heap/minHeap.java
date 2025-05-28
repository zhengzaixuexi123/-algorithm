package org.example.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class minHeap {
    public Queue<Integer> topKHeap (int[] nums,int k){
        //初始化小顶堆
        Queue<Integer> heap = new PriorityQueue<>();
        //把k个元素加入堆
        for (int i=0;i<k;i++){
            heap.offer(nums[i]);
        }
        //判断k+1之后的元素入堆，保持堆只有K个元素
        for (int i=k;i<nums.length;i++){
            if (heap.peek()<nums[i]){
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        return heap;
    }

}
