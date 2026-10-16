class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public MinStack() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }
    
    public void push(int val) {
        stack1.push(val);

        if(stack2.isEmpty()||stack2.peek()>=val){
            stack2.push(val);
        }
    }
    
    public void pop() {
        int removed = stack1.pop();
        if(removed == stack2.peek()){
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
