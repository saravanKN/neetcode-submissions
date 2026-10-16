class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap();
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp = target - nums[i];
            if(hm.containsKey(temp)){
               return new int[]{hm.get(temp),i}; 
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}