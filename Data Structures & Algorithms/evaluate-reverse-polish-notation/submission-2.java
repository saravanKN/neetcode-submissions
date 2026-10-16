class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String token : tokens){
            if(isOperator(token)){
                int b = stack.pop();
                int a = stack.pop();
                int total = 0;
                switch(token){
                    case "+":
                    total = a+b;
                    break;
                    case "-":
                    total = a-b;
                    break;
                    case "*":
                    total = a*b;
                    break;
                    case "/":
                    total = a/b;
                    break;
                }
                stack.push(total);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    boolean isOperator(String token){
        return (token.equals("+")|| token.equals("-") 
            || token.equals("*") || token.equals("/"));
    }
}
