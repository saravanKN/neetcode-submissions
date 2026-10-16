class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int prefix = 1;
        for(int i=0;i<length;i++){
            result[i] = prefix;
            prefix*=nums[i];
        }
        int postfix = 1;
        for(int i=length-1;i>=0;i--){
            result[i]*=postfix;
            postfix*=nums[i];
        }
        System.out.println(result);
        return result;
    }

}  
