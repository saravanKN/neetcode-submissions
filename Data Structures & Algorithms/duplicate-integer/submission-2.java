class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> valueSet = new HashSet();
        for(Integer num: nums){
            valueSet.add(num);
        }
        if(nums.length==valueSet.size()){
            return false;
        }
        return true;
    }
}