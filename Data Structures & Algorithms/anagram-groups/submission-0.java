class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap();
        for(String str: strs){
            int count[] = new int[26];

            for(char c: str.toCharArray()){
                count[c -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int a: count){
                sb.append("#"+a);
            }
            String key = sb.toString();
            if(!resultMap.containsKey(key)){
                List<String> list = new ArrayList();
                list.add(str);
                resultMap.put(key, list);
            }
            else{
                List<String> strList = resultMap.get(key);
                strList.add(str);
                resultMap.put(key,strList);
            }
        }
        return new ArrayList(resultMap.values());
    }
}
