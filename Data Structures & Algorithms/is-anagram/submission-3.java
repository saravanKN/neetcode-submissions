class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        
        char[] ch = new char[26];

        for(int i=0;i<s.length();i++){
            ch[a[i] - 'a']++;
            ch[b[i] - 'a']--;
        }

        for(char c:ch){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
