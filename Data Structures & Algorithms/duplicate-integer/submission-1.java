class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,String> hash = new HashMap();
        for(int num: nums){
            if(hash.containsKey(num)){
                return true;
            }
            hash.put(num,"");
        }
        return false;
    }
}
