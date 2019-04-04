package com.zxx.sword;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q66MedianInStream {
    private int count = 0;
    //利用PriorityQueue构建小顶堆和大顶堆
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    public void Insert(Integer num){
        if(count%2 == 0){
            maxHeap.offer(num);
            int filteredMaxNum = maxHeap.poll();
            minHeap.offer(filteredMaxNum);
        }else {
            minHeap.offer(num);
            int filteredMinNum = minHeap.poll();
            maxHeap.offer(filteredMinNum);
        }
        count++;
    }
    public Double GetMedian(){
        if(count%2 == 0){
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        }else {
            return new Double(minHeap.peek());
        }
    }
}
