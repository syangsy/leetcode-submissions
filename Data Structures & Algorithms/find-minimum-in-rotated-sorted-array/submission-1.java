class Solution {
    public int findMin(int[] nums) {

        int l = 0; 
        int r = nums.length-1;

        int min = nums[0];
        while(l <= r){
            if(nums[l] < min)
                min = nums[l];
            if(nums[r] < min)
                min = nums[r];
            l++;
            r--;
        }

        return min;
        
    }
}
