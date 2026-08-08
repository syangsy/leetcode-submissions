class Solution {
    public int maxArea(int[] heights) {

        // BRUTE FORCE: doesn't work for large inputs
        /*
        int max = 0;
        for(int i = 0; i < heights.length-1; i++){
            
            for(int j = i+1; j < heights.length; j++){
                int width = j-i;
                int height = Math.min(heights[i], heights[j]);

                int area = width*height; 

                if(area > max){
                    max = area;
                }
            }

        }
        return max; 
        */

        int max = 0;
        int l = 0;
        int r = heights.length-1;

        while(l < r){

            int width = r - l;
            int height = Math.min(heights[l], heights[r]);

            max = Math.max(max, width*height);

            if(heights[l] < heights[r])
                l++;
            else
                r--;

        }

        return max;
    }
}
