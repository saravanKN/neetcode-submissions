class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer> tempList = new ArrayList();
        Map<Integer,Integer> resultMap = new HashMap();
        for(int i=0;i<n;i++){
            resultMap.put(nums[i],resultMap.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            result[i++] = pq.poll().getKey();
        }
        return result;
    }
}
