class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        int length = str.length();
        List<String> result = new ArrayList();
        while(i<length){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i=j+1;
            result.add(str.substring(i,i+len));
            i=len+i;
        }

        return result;
    }
}
