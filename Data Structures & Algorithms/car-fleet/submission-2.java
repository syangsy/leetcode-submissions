class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        // first i need to ensure that position + target info are together
        // can use a zip in python, but we using java out here
        int n = position.length;

        int[][] cars = new int[n][2];
        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // sort so that the first positions are first
        Arrays.sort(cars, (a,b) -> Integer.compare(b[0], a[0]));

        int fleets = 0;
        double currTime = 0;

        // Don't need a stack
        // Deque<Double> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            
            double time = (double) (target - cars[i][0]) / cars[i][1];
            if(time > currTime){
                currTime = time;
                fleets++; 
            }
        }


        return fleets;
        
    }
}
