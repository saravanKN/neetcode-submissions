class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> words = new HashSet();
        int left = 0;
        int maxSize=0;
        char[] ch = s.toCharArray();
        for(int right =0 ; right<ch.length; right++){
            while(words.contains(ch[right])){
                words.remove(ch[left]);
                left++;
            }
            words.add(ch[right]);
            maxSize = Math.max(maxSize , right-left+1);
        }
        return maxSize;
    }
}
