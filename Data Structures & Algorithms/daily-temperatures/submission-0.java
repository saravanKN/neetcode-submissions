class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] output = new int[size];
        Stack<Integer> stack = new Stack();
        for(int i =0;i<size;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int temp = stack.pop();
                output[temp] = i-temp;
            }
            stack.push(i);
        }
        return output;
    }
}
