package main.heap_priority_queue_master_pattern;

import java.util.*;

public class FindTopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequentElement(nums, k)));

    }

    private static int[] topKFrequentElement(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for (int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num, 0) + 1);
        }
        //Can be replaced with 'Comparator.comparingInt'
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a,b)-> a.getValue()  - b.getValue());

        for (Map.Entry<Integer, Integer>entry : freqMap.entrySet()){
            minHeap.offer(entry);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for (int i =  0; i < k; i ++){
            result[i] = minHeap.poll().getKey();
        }
        return  result;
     }
}
