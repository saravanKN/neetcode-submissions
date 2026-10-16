class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hashMap = new HashMap();
        for(String st: strs){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
             hashMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(st);
        }
        return new ArrayList(hashMap.values());
    }
}
