class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        int openCount=0,closeCount =0;
        String currentString="";
        getResult(result,currentString,openCount,closeCount,n);
        return result;
    }

    void getResult(List<String> result, String currentString, int openCount, int closeCount,int n){
        
        if(currentString.length()==n*2){
            result.add(currentString);
            return ;
        }
        if(openCount<n){
            getResult(result,currentString+"(",openCount+1,closeCount,n);
        }
        if(closeCount<openCount){
            getResult(result,currentString+")",openCount,closeCount+1,n);
        }
    }
}
