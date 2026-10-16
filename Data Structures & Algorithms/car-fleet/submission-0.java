class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        double carsPositionAndTime[][] = new double[length][2];

        for(int i=0;i<length;i++){
            carsPositionAndTime[i][0] = position[i];
            carsPositionAndTime[i][1] = (double) (target-position[i])/speed[i];
        }

        Arrays.sort(carsPositionAndTime,(a,b)->Double.compare(b[0],a[0]));
        Stack<Double> stack =new Stack();
        for(double[] car : carsPositionAndTime){
            double time = car[1];
            if(stack.isEmpty()||stack.peek()<time){
                stack.push(time);
            }
        }

        return stack.size();

    }
}
