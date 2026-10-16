class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet();

        for(int num: nums){
            hashSet.add(num);
        }

        int maxCount = 0;
        for(Integer n: hashSet){
            if(!hashSet.contains(n-1)){
                int  currentNum = n;
                int streak = 0;
                while(hashSet.contains(currentNum)){
                    currentNum++;
                    streak++;
                }
                maxCount = Math.max(maxCount,streak);
            }
        }
        return maxCount;
    }
}
