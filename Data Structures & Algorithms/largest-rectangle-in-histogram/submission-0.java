class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        Deque <Integer> stk = new ArrayDeque<>();
        int maxArea = 0;

        for(int i = 0; i <= n; i++){
            int currHeight = (i==n) ? 0 : heights[i];

            while(!stk.isEmpty() && currHeight < heights[stk.peek()]){
                int h = heights[stk.pop()];
                int w = stk.isEmpty() ? i : i - stk.peek()-1;
                maxArea = Math.max(maxArea, h*w);
            }
            stk.push(i);
        }

        return maxArea;
    }
}
