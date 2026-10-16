class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer> tempList = new ArrayList();
        Map<Integer,Integer> resultMap = new HashMap();
        for(int i=0;i<n;i++){
            resultMap.put(nums[i],resultMap.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> pq =
            new ArrayList<>(resultMap.entrySet());

        pq.sort((a,b)-> b.getValue()-a.getValue());


        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.get(i).getKey();
        }
        return result;
    }
}
