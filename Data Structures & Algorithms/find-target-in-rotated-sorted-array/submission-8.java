class Solution {
    public int search(int[] nums, int target) {

        // first find min
        int l = 0; 
        int r = nums.length-1;

        while(l < r){
            int mid = l + (r-l)/2;

            if(nums[mid] > nums[r]){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        // min is going to be nums[l] or nums[r]
        int min = nums[l];
        int minIndex = l;


        // check for window of binary search
        if(minIndex == 0){
            l = 0;
            r = nums.length-1;
        } 
        // THIS IS NOT POSSIBLE 
        /*
        else if(target < min){
            l = 0;
            r = minIndex-1;
        }
        */
        else if(target >= nums[0] && target <= nums[minIndex-1]){
            l = 0;
            r = minIndex-1;
        }
        else{
            l = minIndex;
            r = nums.length-1;
        }

        if(target == min){
            return minIndex;
        }
        
        System.out.println("l: " + l);
        System.out.println("r: " + r);


        while(l <= r){
            int mid = l + (r-l)/2;
            System.out.println("mid: " + mid);

            if(target == nums[mid]){
                return mid;
            }
            else if (target < nums[mid]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }

        }

        return -1;     
    }
}
