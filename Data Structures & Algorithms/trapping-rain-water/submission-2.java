class Solution {
    public int trap(int[] height) {

        int l = 0;
        int r = height.length-1;

        int lMax = height[l];
        int rMax = height[r];
        int totalArea = 0;
        

        while(l < r){
            // get the min of the rightMax and leftMax, bounded by that min
            if(rMax < lMax){
                int currArea = rMax - height[r];
                if(currArea > 0)
                    totalArea += currArea; 
                r--;
                rMax = Math.max(rMax, height[r]);
            }
            else{
                int currArea = lMax - height[l];
                if(currArea > 0)
                    totalArea += currArea; 
                l++;
                lMax = Math.max(lMax, height[l]);
            }
        }

        return totalArea;
    }

}
