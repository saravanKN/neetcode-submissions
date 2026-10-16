class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue((a,b)-> countMap.get(b)-countMap.get(a));
        for(int num : countMap.keySet()){
            pq.offer(num);
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
